package com.github.extermania.leetcode;

public class $0200_Number_of_Islands_100 {
	class Solution {
	    void ff(char[][] grid, int i, int j, int cnt){
	        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
	        if(grid[i][j]=='1'){
	            grid[i][j]='0';
	            ff(grid, i-1, j, cnt);
	            ff(grid, i+1, j, cnt);
	            ff(grid, i, j+1, cnt);
	            ff(grid, i, j-1, cnt);
	        }
	    }
	    boolean f(char[][] grid, int bi, int bj, int cnt){
	        for(int i=bi; i<grid.length; i++){
	            for(int j=bj; j<grid[0].length; j++){
	                if(grid[i][j]=='1'){
	                    ff(grid, i, j, cnt);
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    public int numIslands(char[][] grid) {
	        if(grid.length==0) return 0;
	        int bi=0; int bj=0; int cnt=0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j]=='1'){
	                    bi=i; bj=j;
	                    if(!f(grid, bi, bj, cnt)) return cnt;
	                    cnt++;
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
