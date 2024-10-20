package src.Lab13;

import java.util.Scanner;

public class TicTacToe {
    private static boolean didWin(char[][] board) {
        int[] results = new int[8];
        for (int i=0;i<3;i++) {
            results[0] += board[0][i] == 'X' ? 1 : board[0][i] == 'O' ? 0 : 100;
            results[1] += board[1][i] == 'X' ? 1 : board[1][i] == 'O' ? 0 : 100;
            results[2] += board[2][i] == 'X' ? 1 : board[2][i] == 'O' ? 0 : 100;
            results[3] += board[i][0] == 'X' ? 1 : board[0][i] == 'O' ? 0 : 100;
            results[4] += board[i][1] == 'X' ? 1 : board[1][i] == 'O' ? 0 : 100;
            results[5] += board[i][2] == 'X' ? 1 : board[2][i] == 'O' ? 0 : 100;
            results[6] += board[i][i] == 'X' ? 1 : board[i][i] == 'O' ? 0 : 100;
            results[7] += board[2-i][2-i] == 'X' ? 1 : board[2-i][2-i] == 'O' ? 0 : 100;
        }
        for (int e : results) {
            if (e == 3 || e == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        int cnt = 0;
        Scanner ip = new Scanner(System.in);
        do {
            boolean isFirst = cnt % 2 == 0;
            System.out.print("Player " + (isFirst ? "one: " : "two: "));
            int i = ip.nextInt(), j = ip.nextInt();
            board[i-1][j-1] = (isFirst ? 'X' : 'O');
            if (didWin(board) && cnt < 8) {
                System.out.println("win");
            } else if (cnt == 8) {
                System.out.println("draw");
            } else {
                System.out.println("unfinished");
            }
            for (i=0;i<3;i++) {
                for (j=0;j<3;j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } while (++cnt < 9);
        ip.close();
    }
}
