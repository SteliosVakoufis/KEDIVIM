package com.layeredarchitectures.accountapp;

import java.util.Optional;
import java.util.Scanner;

import com.layeredarchitectures.accountapp.dao.AccountDAOImpl;
import com.layeredarchitectures.accountapp.dto.AccountDTO;
import com.layeredarchitectures.accountapp.service.AccountServiceImpl;
import com.layeredarchitectures.accountapp.service.IAccountService;
import com.layeredarchitectures.accountapp.service.exceptions.AccountAlreadyExists;
import com.layeredarchitectures.accountapp.service.exceptions.AccountDoesNotExist;
import com.layeredarchitectures.accountapp.service.exceptions.InsufficientAccountBalance;
import com.layeredarchitectures.accountapp.service.exceptions.TryingToDepositNegativeAmount;

public class App {
    private static final IAccountService service = new AccountServiceImpl(new AccountDAOImpl());

    public static void main(String[] args) {
        int choice = 0;
        do {
            printUserMenu();
            choice = getValidInt();

            switch (choice) {
                case 1:
                    try {
                        System.out
                                .println("Insert Account ID, Iban, last name, first name, SSN and starting balance");
                        AccountDTO accountDTO = new AccountDTO(getValidInt(), getInput(), getInput(),
                                getInput(), getInput(), getValidInt());
                        service.createAccount(accountDTO);
                        System.out.println("Successful Account creation!");
                    } catch (AccountAlreadyExists e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Insert Account ID for deletion.");
                        service.deleteAccount(getValidInt());
                        System.out.println("Successful deletion!");
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Insert Account ID to update.");
                        int acc_id_old = getValidInt();
                        System.out.println(service.getAccountState(acc_id_old));
                        System.out.println("Insert a new value for each field.");
                        int acc_id_new = getValidInt();
                        AccountDTO accountDTO = new AccountDTO(acc_id_new, getInput(), getInput(),
                                getInput(), getInput(), getValidInt());
                        service.updateAccount(acc_id_old, accountDTO);
                        System.out.println("Successful update!");
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Insert Account ID to deposit to.");
                        int acc_id = getValidInt();
                        System.out.println("Your balance is: " + service.getAccountBalance(acc_id));
                        System.out.print("Deposit: ");
                        Optional<Double> newBalance = service.deposit(acc_id, getValidInt());
                        System.out.println("\nSuccessful deposit!\n New balance is: " + newBalance.get());
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    } catch (TryingToDepositNegativeAmount e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Insert Account ID to withdraw from.");
                        int acc_id = getValidInt();
                        System.out.println("Your balance is: " + service.getAccountBalance(acc_id));
                        System.out.print("Withdraw: ");
                        Optional<Double> newBalance = service.withdraw(acc_id, getValidInt());
                        System.out.println("\nSuccessful withdrawal!\n New balance is: " + newBalance.get());
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    } catch (InsufficientAccountBalance e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        System.out.println("Insert Account ID to check your balance.");
                        int acc_id = getValidInt();
                        System.out.println("Your balance is: " + service.getAccountBalance(acc_id));
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        System.out.println("Insert Account ID to check your Account state.");
                        int acc_id = getValidInt();
                        System.out.println("Your balance is: " + service.getAccountState(acc_id));
                    } catch (AccountDoesNotExist e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 8:
                    System.out.println("Exiting application..");
                    break;
                default:
                    System.out.println("Make a selection from 1-7.");
                    break;
            }

        } while (choice != 8);
    }

    public static void printUserMenu() {
        System.out.println("\n-------------------------\n" +
                "1. Create Account.\n" +
                "2. Delete Account.\n" +
                "3. Update Account.\n" +
                "4. Deposit to Account.\n" +
                "5. Withdraw from Account.\n" +
                "6. Check Account balance.\n" +
                "7. Check Account state.\n" +
                "8. Exit application.\n" +
                "\n-------------------------\n");
    }

    // Helper functions
    private static int getValidInt() {
        Scanner inpt = new Scanner(System.in);

        while (true) {
            try {
                return inpt.nextInt();
            } catch (Exception e) {
                inpt.nextLine();
                System.err.println(e);
            }
        }
    }

    private static String getInput() {
        Scanner inpt = new Scanner(System.in);

        while (true) {
            try {
                return inpt.nextLine();
            } catch (Exception e) {
                inpt.nextLine();
                System.err.println(e);
            }
        }
    }
}
