package com.github.extermania.leetcode;

public class $0063_Unique_Paths_II_100 {
	class Solution {
	    void f(int[][] grid, int[][] d, int m, int n){
	        //System.out.println(m+" "+n);
	        if(m<0 || n<0) return;
	        if(d[m][n]==0){
	            d[m][n]= val(grid, d, m+1, n)+val(grid, d, m, n+1);
	            for(int i=m; i>=0; i--) d[i][n]=val(grid, d, i+1, n)+val(grid, d, i, n+1);
	            for(int i=n; i>=0; i--) d[m][i]=val(grid, d, m+1, i)+val(grid, d, m, i+1);
	            f(grid, d, m-1, n-1);
	        }
	    }
	    int val(int[][] grid, int[][] d, int m, int n){
	        if(grid[m][n]==1) return 0;
	        else return d[m][n];
	    }
	    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        
	        int m = obstacleGrid.length;
	        if(m==0) return 0;
	        int n = obstacleGrid[0].length;
	        if(n==0) return 0;
	        
	        if(obstacleGrid[0][0]==1) return 0;

	        int[][] d = new int[m][n];
	        boolean ob = false;
	        for(int i=n-1; i>=0; i--) {
	            if(obstacleGrid[m-1][i]==1){
	                ob=true;
	            }else{
	                if(!ob) d[m-1][i]=1;
	            }
	        }
	        ob = false;
	        for(int i=m-1; i>=0; i--){
	            if(obstacleGrid[i][n-1]==1){
	                ob=true;
	            }else{
	                if(!ob) d[i][n-1]=1;
	            }
	        } 
	        f(obstacleGrid, d, m-2, n-2);
	         // for(int[] arr:d){
	         //     System.out.println(Arrays.toString(arr));
	         // }
	        return d[0][0];
	    }
	}
}
