package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Temp {
	class Solution {
	    List<Character> pos(char[][] board, int i, int j){
	        int[] arr = new int[9];
	        for(int n=0; n<9; n++)  //check row
	            if(board[i][n]!='.') arr[board[i][n]-'1']++;
	        for(int n=0; n<9; n++) //check col
	            if(board[n][j]!='.') arr[board[n][j]-'1']++;
	        int nn = (i/3)*3; int mm=(j/3)*3;
	        for(int n=nn; n<nn+3; n++) //check cell
	            for(int m=mm; m<mm+3; m++) 
	              if(board[n][m]!='.') arr[board[n][m]-'1']++;
	        List<Character> result = new ArrayList<>();
	        for(int n=0; n<9; n++)
	            if(arr[n]==0) result.add((char)(n+'1'));
	        return result;
	    }
	    
	    boolean done(char[][] board){
	         for(int i=0; i<9; i++)
	            for(int j=0; j<9; j++)
	               if(board[i][j]=='.') return false;
	        return true;
	    }
	    
	    char[][] copy(char[][] board){
	        char[][] a = new char[9][9];
	        for(int i=0; i<9; i++)
	            for(int j=0; j<9; j++)
	               a[i][j]=board[i][j];
	        return a;
	    }
	    
	    boolean valid(char[][] board, int i, int j){
	        int[] arr = new int[9];
	        for(int n=0; n<9; n++)  //check row
	            if(board[i][n]!='.') {
	                arr[board[i][n]-'1']++;
	                if(board[i][n]-'1'>1) return false;
	                                 }
	        for(int n=0; n<9; n++) //check col
	            if(board[n][j]!='.') {
	                arr[board[n][j]-'1']++;
	                if(board[n][j]-'1'>1) return false;
	            }
	        int nn = (i/3)*3; int mm=(j/3)*3;
	        for(int n=nn; n<nn+3; n++) //check cell
	            for(int m=mm; m<mm+3; m++) 
	              if(board[n][m]!='.') {
	                  arr[board[n][m]-'1']++;
	                  if(board[n][m]-'1'>1) return false;
	              }
	        return true;
	    }
	    
	    boolean solveSudoku0(char[][] board) {
	        char[][] a = copy(board);
	        Map<Integer, List<Character>> pos = null;
	        int cnt = 1;
	        while(cnt>0){
	            pos=new TreeMap<>();
	            cnt = 0;
	            for(int i=0; i<9; i++){
	                for(int j=0; j<9; j++){
	                    if(a[i][j]=='.'){
	                        List<Character> list = pos(board, i, j);
	                        pos.put(i*10+j, list);
	                        //System.out.println(i+" "+j+":"+list);
	                        if(list.size()==1){
	                            cnt++;
	                            a[i][j]=list.get(0);
	                        }
	                    }
	                }
	            }
	        }
	        
	        if(done(a)) return true;
	        
	        for(Map.Entry<Integer, List<Character>> e:pos.entrySet()){
	            Integer key = e.getKey();
	            List<Character> list = e.getValue();
	            int i = key/10; int j = key%10;
	            for(Character tr:list){
	                 a[i][j]=tr;
	                if(valid(a, i, j)){
	                    if(solveSudoku0(a)) return true;
	                }
	                a[i][j]='.';
	            }
	        }
	        
	        for(int i=0; i<9; i++){
	            for(int j=0; j<9; j++){
	                System.out.print(board[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println(pos);
	        
	        return false;
	        
	    }
	    
	    
	    public void solveSudoku(char[][] board) {
	        int cnt = 1;
	        while(cnt>0){
	            cnt = 0;
	            for(int i=0; i<9; i++){
	                for(int j=0; j<9; j++){
	                    if(board[i][j]=='.'){
	                        List<Character> list = pos(board, i, j);
	                        if(list.size()==1){
	                            cnt++;
	                            board[i][j]=list.get(0);
	                        }
	                    }
	                }
	            }
	        }
	        if(done(board)) return;
	        
	        
	        solveSudoku0(board); 
	        
	    }
	}
}
