package TicTactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your placement (1-9)");
        int position = scanner.nextInt();
        System.out.println(position);
        switch (position) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][1] = 'X';
                break;
            case 3:
                gameBoard[0][2] = 'X';
                break;
            case 4:
                gameBoard[1][0] = 'X';
                break;
            case 5:
                gameBoard[1][1] = 'X';
                break;
            case 6:
                gameBoard[1][2] = 'X';
                break;
            case 7:
                gameBoard[2][0] = 'X';
                break;
            case 8:
                gameBoard[2][1] = 'X';
                break;
            case 9:
                gameBoard[2][2] = 'X';
                break;
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row
            ) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}





