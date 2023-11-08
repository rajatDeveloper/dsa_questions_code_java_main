
package day_10_recrsion_backtracking;

import java.util.*;
// public class Problem_2 {

//     public static void placeNQueensFun(int n) {
//         int board[][] = new int[n][n];
//         placeQueen(board, 0, n);
//     }

//     private static void placeQueen(int borad[][], int row, int n) {

//         if (row == n) {
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(borad[i][j] + "");

//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         for (int j = 0; j < n; j++) {
//             if (isBoradSafe(borad, row, j)) {
//                 borad[row][j] = 1;
//                 placeQueen(borad, row + 1, n);
//                 borad[row][j] = 0;
//             }
//         }
//     }

//     private static boolean isBoradSafe(int[][] borad, int row, int col) {
//         int n = borad.length;
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (borad[i][j] == 1) {
//                 return false;
//             }
//         }

//         for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
//             if (borad[i][j] == 1) {
//                 return false;
//             }
//         }

//         for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
//             if (borad[i][j] == 1) {
//                 return false;
//             }
//         }

//         for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
//             if (borad[i][j] == 1) {
//                 return false;
//             }
//         }

//         for (int i = row - 1; i >= 0; i--) {
//             if (borad[i][col] == 1) {
//                 return false;
//             }
//         }

//         for (int i = row + 1; i < n; i++) {
//             if (borad[i][col] == 1) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         // placeNQueensFun(4);

//     }
// }

class Problem_2 {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(0, board, res);
        return res;
    }

    static boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q')
                return false;
            col--;
            row++;
        }
        return true;
    }

    static void dfs(int col, char[][] board, List<List<String>> res) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void main(String args[]) {
        int N = 4;
        List<List<String>> queen = solveNQueens(N);
        int i = 1;
        for (List<String> it : queen) {
            System.out.println("Arrangement " + i);
            for (String s : it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

    }
}