package com.github.extermania.leetcode;

public class $0999_Available_Captures_for_Rook_1ms {
	class Solution {
	    public int numRookCaptures(char[][] board) {
	        for(int i=0; i<8; i++){
	            for(int j=0; j<8; j++){
	                if(board[i][j]=='R'){
	                    int cnt=0;
	                    for(int k=i-1;k>=0;k--){
	                        if(board[k][j]=='B') break;
	                        else if(board[k][j]=='p'){ cnt++; break; }
	                    }
	                    for(int k=i+1;k<8;k++){
	                        if(board[k][j]=='B') break;
	                        else if(board[k][j]=='p'){ cnt++; break; }
	                    }
	                    for(int k=j-1;k>=0;k--){
	                        if(board[i][k]=='B') break;
	                        else if(board[i][k]=='p'){ cnt++; break; }
	                    }
	                    for(int k=j+1;k<8;k++){
	                        if(board[i][k]=='B') break;
	                        else if(board[i][k]=='p'){ cnt++; break; }
	                    }
	                    return cnt;
	                }
	            }
	        }
	        return 0;
	    }
	}
}
