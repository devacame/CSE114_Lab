package src.Lab12;

public class RandomMatrix {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int i = 0; i < 64; i++)
            board[i / 8][i % 8] = (int) (Math.random() * 10) % 2;
        for (int[] row : board) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        int mainDiag = 0, minorDiag = 0;
        for (int i = 0; i < 8; i++) {
            int rowCnt = 0, colCnt = 0;
            for (int j = 0; j < 8; j++) {
                rowCnt += board[i][j];
                colCnt += board[j][i];
            }
            if (rowCnt == 8 || rowCnt == 0) {
                System.out.printf("All %d's on row %d\n", rowCnt == 8 ? 1 : 0, i);
            }
            if (colCnt == 8 || colCnt == 0) {
                System.out.printf("All %d's on column %d\n", colCnt == 8 ? 1 : 0, i);
            }
            mainDiag += board[i][i];
            minorDiag += board[i][7 - i];
        }
        if (mainDiag == 8 || mainDiag == 0) {
            System.out.printf("All %d's on the main diagonal\n", mainDiag == 8 ? 1 : 0);
        }
        if (minorDiag == 8 || minorDiag == 0) {
            System.out.printf("All %d's on the minor diagonal\n", minorDiag == 8 ? 1 : 0);
        }
    }
}
