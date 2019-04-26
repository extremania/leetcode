package com.github.extermania.leetcode;

public class $0289_Game_of_Life_100 {
	class Solution {

		// 0->1 3
		// 1->0 2

		int[] deadlive(int[][] board, int i, int j) {
			int dead = 0;
			int live = 0;
			if (i > 0) {
				if (j > 0) {
					if (board[i - 1][j - 1] == 0 || board[i - 1][j - 1] == 3) {
						dead++;
					} else {
						live++;
					}
				}
				if (board[i - 1][j] == 0 || board[i - 1][j] == 3) {
					dead++;
				} else {
					live++;
				}
				if (j < board[0].length - 1)
					if (board[i - 1][j + 1] == 0 || board[i - 1][j + 1] == 3) {
						dead++;
					} else {
						live++;
					}
			}
			if (j > 0)
				if (board[i][j - 1] == 0 || board[i][j - 1] == 3) {
					dead++;
				} else {
					live++;
				}
			if (j < board[0].length - 1)
				if (board[i][j + 1] == 0 || board[i][j + 1] == 3) {
					dead++;
				} else {
					live++;
				}
			if (i < board.length - 1) {
				if (j > 0)
					if (board[i + 1][j - 1] == 0 || board[i + 1][j - 1] == 3) {
						dead++;
					} else {
						live++;
					}
				if (board[i + 1][j] == 0 || board[i + 1][j] == 3) {
					dead++;
				} else {
					live++;
				}
				if (j < board[0].length - 1)
					if (board[i + 1][j + 1] == 0 || board[i + 1][j + 1] == 3) {
						dead++;
					} else {
						live++;
					}
			}
			return new int[] { dead, live };
		}

		void f(int[][] board, int i, int j) {
			int[] dl = deadlive(board, i, j);
			// System.out.println(dl[0]+" "+dl[1]+"->"+board[i][j]);
			if (board[i][j] == 0) {
				if (dl[1] == 3)
					board[i][j] = 3;
			} else {
				if (dl[1] < 2 || dl[1] > 3)
					board[i][j] = 2;
			}
			// System.out.println(board[i][j]);
		}

		public void gameOfLife(int[][] board) {
			if (board.length == 0 || board[0].length == 0)
				return;
			for (int i = 0; i < board.length; i++)
				for (int j = 0; j < board[0].length; j++)
					f(board, i, j);
			for (int i = 0; i < board.length; i++)
				for (int j = 0; j < board[0].length; j++)
					if (board[i][j] == 2)
						board[i][j] = 0;
					else if (board[i][j] == 3)
						board[i][j] = 1;

		}
	}
}
