package com.github.extermania.leetcode;

public class $0036_Valid_Sudoku_41_10 {
	static class Solution {
		private static boolean isValid(char[] nine) {
			for (int i = 0; i < 9; i++) {
				if (nine[i] == '.')
					continue;
				for (int j = i + 1; j < 9; j++) {
	                if (nine[j] == '.')
					    continue;
					if (nine[i] == nine[j])
						return false;
				}
			}
			return true;
		}
	    public boolean isValidSudoku(char[][] board) {
	        boolean valid = true;
			for (int i = 0; i < 9; i++) {
				valid = isValid(board[i]) //
						&& isValid(new char[] {//
								board[0][i], board[1][i], board[2][i], //
								board[3][i], board[4][i], board[5][i], //
								board[6][i], board[7][i], board[8][i],//
						}) ;
				if (!valid)
					return false;
			}
			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					valid = isValid(new char[] { //
							board[i][j], board[i][j + 1], board[i][j + 2], //
							board[i + 1][j], board[i + 1][j + 1], board[i + 1][j + 2], //
							board[i + 2][j], board[i + 2][j + 1], board[i + 2][j + 2],//
					});
					if (!valid)
						return false;
				}
			}
			return true;
	    }
	}
}
