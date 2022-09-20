package gr.aueb.elearn.miniprojects.project_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class app {
    private static Map<String, Integer> sitRows = new HashMap<>();
    private static boolean[][] sits = new boolean[30][12];

    public static void main(String[] args) {
        populateSitRows(sitRows);

        Scanner inpt = new Scanner(System.in);
        while (true) {
            try {

                System.out.println("(B)ook | (C)ancel | (E)xit");
                String operation = inpt.next();

                if (operation == null)
                    continue;
                else if (operation.charAt(0) == 'E')
                    break;

                System.out.println("Give a valid sit number ex. \"D 10\"");

                String column = inpt.next();
                if (!((int)column.charAt(0) >= 65 && (int)column.charAt(0) <= 77)){
                    inpt.nextLine();
                    System.out.println("Error: Insert a valid column letter.\n");
                    continue;
                }

                int row = inpt.nextInt();

                if (operation.charAt(0) == 'B') {
                    book(column.charAt(0), row);
                } else if (operation.charAt(0) == 'C') {
                    cancel(column.charAt(0), row);
                }

            } catch (Exception e) {
                inpt.nextLine();
                e.printStackTrace();
                System.err.println("Error: Please insert a valid input.");
            }
        }
        inpt.close();

    }

    private static void cancel(char col, int row) {
        if (sits[row][sitRows.get("" + col)]) {
            sits[row][sitRows.get("" + col)] = false;
            System.out.println("You canceled a sit!");
        } else {
            System.err.println("Error: This sit is not booked.");
        }
    }

    private static void book(char col, int row) {
        if (!sits[row][sitRows.get("" + col)]) {
            sits[row][sitRows.get("" + col)] = true;
            System.out.println("You booked a sit!");
        } else {
            System.err.println("Error: This sit is already booked.");
        }
    }

    private static void populateSitRows(Map<String, Integer> map) {
        for (int i = 65; i < 77; i++) {
            map.put("" + (char) i, i - 65);
        }
    }
}
