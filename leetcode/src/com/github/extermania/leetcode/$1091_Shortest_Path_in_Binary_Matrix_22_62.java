package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class $1091_Shortest_Path_in_Binary_Matrix_22_62 {
	class Solution {
	    
	    void f(int[][] grid, List<int[]> ijs, int[][] dp, int cur){
	        Iterator<int[]> it = ijs.iterator();
	        while(it.hasNext()){
	            int[] ij = it.next();
	            int i = ij[0]; int j = ij[1];
	            if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==1 || dp[i][j]!=-1 && dp[i][j]<=cur) it.remove();
	            else dp[i][j] = cur+1;
	        }
	        
	    }
	    
	    boolean add(Set<Integer> list, int i, int j, int[][] grid){
	        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==1) return false;
	        list.add(i*1000+j);
	        return i==grid.length-1 && j==grid[0].length-1;
	    }
	    
	    public int shortestPathBinaryMatrix(int[][] grid) {
	        if(grid.length==0) return 0;
	        if(grid[0][0]==1) return -1;
	        if(grid.length==1 && grid[0].length==1) return 1;
	        
	 
	        Set<Integer> list = new HashSet<>();
	        list.add(0);
	        
	        int cur=1;
	        
	        while(list.size()>0){
	            Set<Integer> list0 = new HashSet<>();
	            for(Integer ij:list){
	                int i=ij/1000; int j=ij%1000;
	                grid[i][j]=1;
	                if(
	                    add(list0, i-1, j-1, grid) ||
	                    add(list0, i-1, j, grid) ||
	                    add(list0, i-1, j+1, grid) ||
	                    add(list0, i, j-1, grid) ||
	                    add(list0, i, j+1, grid) ||
	                    add(list0, i+1, j-1, grid) ||
	                    add(list0, i+1, j, grid) ||
	                    add(list0, i+1, j+1, grid) 
	                ) return cur+1;
	            }
	            //System.out.println(list0.size());
	            list=list0;
	            ++cur;
	        }
	        
	        return -1;
	    }
	}
}
