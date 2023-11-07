
package day_10_recrsion_backtracking;

public class Problem_2 {

    public static void placeNQueensFun(int n) {
        int board[][] = new int[n][n];
        placeQueen(board, 0, n);
    }

    private static void placeQueen(int borad[][], int row, int n) {

        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(borad[i][j] + "");

                }
                System.out.println();
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++) {
            if (isBoradSafe(borad, row, j)) {
                borad[row][j] = 1;
                placeQueen(borad, row + 1, n);
                borad[row][j] = 0;
            }
        }
    }

    private static boolean isBoradSafe(int[][] borad, int row, int col) {
        int n = borad.length;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (borad[i][j] == 1) {
                return false;
            }
        }

        for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
            if (borad[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (borad[i][j] == 1) {
                return false;
            }
        }

        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (borad[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            if (borad[i][col] == 1) {
                return false;
            }
        }

        for (int i = row + 1; i < n; i++) {
            if (borad[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        placeNQueensFun(4);
    }
}
