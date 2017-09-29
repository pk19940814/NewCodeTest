package SchoolRecruit2016.Meituan.Flip;

import java.util.*;

public class Flip {
    private int[][] board;

    public int[][] flipChess(int[][] A, int[][] f) {
        // write code here
        board = A;
        for (int[] t : f
                ) {
            flip(t[0]-1, t[1]-1);
        }
        return board;
    }

    private void flip(int x, int y) {
        if (x - 1 >= 0) {
            if (board[x - 1][y] == 0) {
                board[x - 1][y] = 1;
            } else {
                board[x - 1][y] = 0;
            }
        }
        if (x + 1 < board.length) {
            if (board[x + 1][y] == 0) {
                board[x + 1][y] = 1;
            } else {
                board[x + 1][y] = 0;
            }
        }
        if (y - 1 >= 0) {
            if (board[x][y - 1] == 0) {
                board[x][y - 1] = 1;
            } else {
                board[x][y - 1] = 0;
            }
        }
        if (y + 1 < board.length) {
            if (board[x][y + 1] == 0) {
                board[x][y + 1] = 1;
            } else {
                board[x][y + 1] = 0;
            }
        }

    }

}
