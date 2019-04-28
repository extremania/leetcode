package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1034_Coloring_A_Border_1ms {
	class Solution {
	    void f(int[][] grid, boolean[][] checked, int r, int c, int ori, int clr){
	        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return;
	        if(checked[r][c]) return;
	        if(grid[r][c]!=ori) return;
	        checked[r][c]=true;
	        int chk = chk(grid, r, c, ori);
	        if(chk==1) 
	            list.add(r*100+c);
	        if(chk>0){
	        f(grid, checked, r-1, c, ori, clr);
	        f(grid, checked, r+1, c, ori, clr);
	        f(grid, checked, r, c+1, ori, clr);
	        f(grid, checked, r, c-1, ori, clr);     
	        }
	    }
	    
	    List<Integer> list = new ArrayList<>();
	    
	    int chk(int[][] grid, int r, int c, int ori){
	        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return 0;
	        if(grid[r][c]!=ori) return 0;
	        if(r==0 || c==0 || r==grid.length-1 || c==grid[0].length-1) return 1;
	        if(grid[r-1][c]==ori && grid[r+1][c]==ori && grid[r][c-1]==ori && grid[r][c+1]==ori) return 2;
	        return 1;
	    }
	    
	    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
	        if(grid.length==0) return grid;
	        boolean[][] checked = new boolean[grid.length][grid[0].length];
	        f(grid, checked, r0, c0, grid[r0][c0], color);
	        for(Integer i:list)
	            grid[i/100][i%100]=color;

	        return grid;
	    }
	}
}
