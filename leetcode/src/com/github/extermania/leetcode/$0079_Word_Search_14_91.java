package com.github.extermania.leetcode;

public class $0079_Word_Search_14_91 {
	class Solution {
	    boolean[][] copy(boolean[][] used){
	        boolean[][] used0 = new boolean[used.length][used[0].length];
	        for(int i=0; i<used.length; i++)
	            for(int j=0; j<used[0].length; j++)
	                if(used[i][j]) used0[i][j]=true;
	        return used0;
	    }
	    
	    boolean f(char[][] board, boolean[][] used, int i, int j, char c, String word){
	        if(i<0 || i>=board.length) return false;
	        if(j<0 || j>=board[0].length) return false;
	        if(used[i][j]) return false;
	        if(c!=board[i][j]) return false;
	        if(word.length()==0) return true;
	        
	        char c0 = word.charAt(0);
	        String word0 = word.substring(1);
	        
	        boolean[][] used0 = copy(used);
	        
	        int ia = i-1;
	        int ib = i+1;
	        int ja = j-1;
	        int jb = j+1;
	        
	        used0[i][j]=true;
	        
	        return f(board, used0, ia, j, c0, word0)
	            || f(board, used0, ib, j, c0, word0)
	            || f(board, used0, i, ja, c0, word0)
	            || f(board, used0, i, jb, c0, word0);
	    }
	    
	    boolean quick(char[][] board, String word){
	        if(word.length()>board.length*board[0].length) return false;
	        int[] arr = new int[256];
	        for(int i=0; i<board.length; i++)
	            for(int j=0; j<board[0].length; j++)
	                arr[board[i][j]]++;
	        for(char c:word.toCharArray())
	            if(--arr[c]<0) return false;
	        
	        return true;
	    }
	    
	    public boolean exist(char[][] board, String word) {
	        if(word.length()==0) return true;
	        if(board.length==0) return false;
	        
	        if(!quick(board, word)) return false;
	         
	        char c0 = word.charAt(0);
	        String word0 = word.substring(1);
	        for(int i=0; i<board.length; i++){
	            for(int j=0; j<board[0].length; j++){
	                if(board[i][j]==c0){
	                    boolean[][] used =  new boolean[board.length][board[0].length];
	                    if(f(board, used, i, j, c0, word0)){
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	    }
	}
}
