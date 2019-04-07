package com.github.extermania.leetcode;

public class $0130_Surrounded_Regions_100 {
	class Solution {
	    void f(char[][] board, int i, int j){
	        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return;
	        //if(board[i][j]=='X') return;
	        if(board[i][j]=='O'){
	            board[i][j]='#';
	            f(board, i-1, j); f(board, i+1, j); f(board, i, j-1); f(board, i, j+1);
	        }
	    }
	    public void solve(char[][] board) {
	        if(board.length<=2 || board[0].length<=2) return;
	        for(int j=0; j<board[0].length; j++){
	            f(board, 0, j); f(board, board.length-1, j); 
	        }
	        for(int i=0; i<board.length; i++){
	            f(board, i, 0); f(board, i, board[0].length-1);
	        }
	        for(int i=0; i<board.length; i++)
	            for(int j=0; j<board[0].length; j++) board[i][j]=(board[i][j]=='#')?'O':'X';
	    }
	}
}
