package com.github.extermania.leetcode;

public class $0062_Unique_Paths_100 {
	class Solution {
	    void f(int[][] d, int m, int n){
	        //System.out.println(m+" "+n);
	        if(m<0 || n<0) return;
	        if(d[m][n]==0){
	            d[m][n]=d[m+1][n]+d[m][n+1];
	            for(int i=m; i>=0; i--) d[i][n]=d[i+1][n]+d[i][n+1];
	            for(int i=n; i>=0; i--) d[m][i]=d[m+1][i]+d[m][i+1];
	            f(d, m-1, n-1);
	        }
	    }
	    public int uniquePaths(int m, int n) {
	        if(m==0 && n==0) return 1;
	        if(m==0 || n==0) return 1;
	        int[][] d = new int[m][n];
	        for(int i=0; i<n; i++) d[m-1][i]=1;
	        for(int i=0; i<m; i++) d[i][n-1]=1;
	        f(d, m-2, n-2);
	        // for(int[] arr:d){
	        //     System.out.println(Arrays.toString(arr));
	        // }
	        return d[0][0];
	    }
	}
}
