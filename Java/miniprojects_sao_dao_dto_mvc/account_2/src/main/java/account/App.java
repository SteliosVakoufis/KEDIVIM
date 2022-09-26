package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import account.dao.AccountsControllerDAO;
import account.dto.AccountInfoDTO;
import account.dto.UserDTO;
import account.service.AccountControllerServiceImpl;
import account.service.IAccountControllerService;

public class App {
	private static IAccountControllerService service = new AccountControllerServiceImpl(
			new AccountsControllerDAO());

	public static void main(String[] args) {
		int choice = 0;
		do {
			printMenu();
			choice = getValidInt();

			switch (choice) {
				case 1:
					try {
						System.out.println("Insert Account Type");
						System.out.println("-options \"ACCOUNT\" \"OVERDRAFT\" \"JOINT\" \"OVERDRAFT_JOINT\"");
						String accountType = getUserString();
						int user_count = getUserCount(accountType);
						service.addAccount(createUsersDTO(user_count), createAccnfoDTO(), accountType);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;

				case 2:
					try {
						System.out.println("Insert (iBan, amount)");
						String iban = getUserString();
						service.withdraw(iban, getValidDouble());
						System.out.println(service.getInfo(iban));
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;

				case 3:
					try {
						System.out.println("Insert (iBan, amount)");
						String iban = getUserString();
						service.deposit(iban, getValidDouble());
						System.out.println(service.getInfo(iban));
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}

					break;

				case 4:
					try {
						System.out.println("Insert (iBan)");
						System.out.println(service.getInfo(getUserString()));
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}

					break;

				case 5:
					try {
						System.out.println("Insert (iBan)");
						service.deleteAccount(getUserString());
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}

					break;

				case 6:
					System.out.println("Exiting application..");
					break;

				default:
					System.err.println("The choice doesn't exist!");
					break;
			}

		} while (choice != 6);
	}

	// Helper Functions
	private static void printMenu() {
		System.out.println("--------------------------------\n" +
				"1. Create New Account.\n" +
				"2. Withdraw from Account.\n" +
				"3. Deposit to Account.\n" +
				"4. Display Account information.\n" +
				"5. Delete Account.\n" +
				"6. Exit application.\n" +
				"--------------------------------\n");
	}

	private static AccountInfoDTO createAccnfoDTO() {
		System.out.println("Insert Account information (iban, startingBalance)");
		return new AccountInfoDTO(
				getUserString(),
				getValidDouble());
	}

	private static List<UserDTO> createUsersDTO(int count) {
		List<UserDTO> users = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			System.out.printf("User %d Insert(firstName, lastName, ssn)\n", i);
			users.add(new UserDTO(
					getUserString(),
					getUserString(),
					getUserString()));
		}

		return users;
	}

	private static int getUserCount(String accountType) {
		switch (accountType) {
			case "ACCOUNT":
				return 1;

			case "JOINT":
				return 2;

			case "OVERDRAFT":
				return 1;

			case "OVERDRAFT_JOINT":
				return 2;

			default:
				return 0;
		}
	}

	private static int getValidInt() {
		Scanner inpt = new Scanner(System.in);

		while (true) {
			try {
				return inpt.nextInt();
			} catch (Exception e) {
				inpt.nextLine();
				System.err.println("Insert a valid number!");
			}
		}
	}

	private static String getUserString() {
		Scanner inpt = new Scanner(System.in);

		while (true) {
			try {
				return inpt.nextLine();
			} catch (Exception e) {
				inpt.nextLine();
				System.err.println("Insert valid text!");
			}
		}
	}

	private static Double getValidDouble() {
		Scanner inpt = new Scanner(System.in);

		while (true) {
			try {
				return inpt.nextDouble();
			} catch (Exception e) {
				inpt.nextLine();
				System.err.println("Insert a valid number!");
			}
		}
	}
}
