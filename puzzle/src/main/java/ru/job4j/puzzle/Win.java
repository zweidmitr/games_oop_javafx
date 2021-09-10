package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        int tempVertical = 0;
        int tempHorizontal = 0;
        int countVertical = 0;
        int countHorizontal = 0;
        boolean rsl = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    tempVertical = j;
                    tempHorizontal = i;
                    break;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][tempVertical] == 1) {
                countVertical++;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[tempHorizontal][i] == 1) {
                countHorizontal++;
            }
        }
        if (countHorizontal == 5 || countVertical == 5) {
            rsl = true;
        }

        return rsl;
    }
}
