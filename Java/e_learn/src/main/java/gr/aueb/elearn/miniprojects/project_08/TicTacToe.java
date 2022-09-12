package gr.aueb.elearn.miniprojects.project_08;

import java.util.Scanner;

public class TicTacToe {
    private char[][] table;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private boolean playerTurn;

    public TicTacToe() {
        this.initTable();
    }

    public void sitOnTable() {
        Scanner inpt = new Scanner(System.in);
        try (inpt;) {
            while (true) {
                int x = inpt.nextInt();
                if (x == -1) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                int y = inpt.nextInt();
                if (y == -1) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                this.play(x, y);
                this.checkWinner();
            }
        } catch (Exception e) {
            inpt.nextLine();
            System.out.println("Invalid input.");
        }
        inpt.close();
    }

    // 264 X wins.
    // 237 Y wins.
    private void checkWinner() {
        int row = 0;
        int column = 0;

        int diagonalSum = this.table[0][0] + this.table[1][1] + this.table[2][2];
        if (diagonalSum == 264 || diagonalSum == 237) {
            if (diagonalSum == 264)
                this.scoreP1++;
            else
                this.scoreP2++;
            initTable();
            return;
        }
        diagonalSum = this.table[2][0] + this.table[1][1] + this.table[0][2];
        if (diagonalSum == 264 || diagonalSum == 237) {
            if (diagonalSum == 264)
                this.scoreP1++;
            else
                this.scoreP2++;
            initTable();
            return;
        }

        int isDraw = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                row += this.table[i][j];
                column += this.table[j][i];
                isDraw += this.table[i][j];
            }
            if (row == 264 || row == 237) {
                if (row == 264)
                    this.scoreP1++;
                else
                    this.scoreP2++;
                initTable();
                return;
            }
            if (column == 264 || column == 237) {
                if (column == 264)
                    this.scoreP1++;
                else
                    this.scoreP2++;
                initTable();
                return;
            }
            if (isDraw == 756) {
                initTable();
                return;
            }
        }
    }

    private void play(int x, int y) {
        if (x < 0 || x > 3 || y < 0 || y > 3) {
            System.out.println("Invalid location.\n");
            displayTable();
            return;
        }
        if (this.table[x][y] != '#') {
            System.out.println("Invalid location.\n");
            displayTable();
            return;
        }

        this.table[x][y] = this.playerTurn ? 'X' : 'O';
        this.playerTurn = !this.playerTurn;
        displayTable();
    }

    private void displayTable() {
        System.out.println("------------");
        System.out.printf("Pturn: %s\nScore: %d : %d\n",
                this.playerTurn ? "X" : "O", this.scoreP1, this.scoreP2);
        System.out.println("------------");
        for (char[] row : table) {
            for (char c : row) {
                System.out.printf("%3c", c);
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    private void initTable() {
        this.playerTurn = true;
        char[][] table = new char[3][3];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = '#';
            }
        }

        this.table = table;
        displayTable();
    }

}
