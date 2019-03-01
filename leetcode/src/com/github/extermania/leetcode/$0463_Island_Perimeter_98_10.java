package com.github.extermania.leetcode;

public class $0463_Island_Perimeter_98_10 {
	class Solution {
	    int cnt(int[][] grid, int i, int j){
	        int cnt = 0;
	        if(i==0 || grid[i-1][j]==0) cnt++; //top
	        if(i==grid.length-1 || grid[i+1][j]==0) cnt++; //down
	        if(j==0 || grid[i][j-1]==0) cnt++; //left
	        if(j==grid[0].length-1 || grid[i][j+1]==0) cnt++; //right
	        return cnt;        
	    }
	    
	    public int islandPerimeter(int[][] grid) {
	        int cnt=0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j]==1) cnt+=cnt(grid, i, j);
	            }
	        }   
	        return cnt;
	    }
	}
}
