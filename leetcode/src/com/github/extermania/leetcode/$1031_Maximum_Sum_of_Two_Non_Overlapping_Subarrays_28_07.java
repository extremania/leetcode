package com.github.extermania.leetcode;

public class $1031_Maximum_Sum_of_Two_Non_Overlapping_Subarrays_28_07 {
	class Solution {
	    int sum(int[] A, int s, int e){
	        int sum=0;
	        for(int i=s; i<=e; i++) sum+=A[i];
	        return sum;
	    }
	    boolean inter(int i, int j, int l, int m){
	       return i>=j && i<=(j+m-1) || (i+l-1)>=j && (i+l-1)<=(j+m-1) || j>=i && j<=(i+l-1) || (j+m-1)>=i && (j+m-1)<=(i+l-1);
	    }
	    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
	        if(A.length==0) return 0;
	        int[] larr = new int[A.length-L+1];
	        larr[0]=sum(A, 0, L-1);
	        for(int i=1; i<larr.length; i++)
	            larr[i]=larr[i-1]-A[i-1]+A[i+L-1];
	        int[] marr = new int[A.length-M+1];
	        marr[0]=sum(A, 0, M-1);
	        for(int i=1; i<marr.length; i++)
	            marr[i]=marr[i-1]-A[i-1]+A[i+M-1];
	        
	       // System.out.println(Arrays.toString(larr));
	       // System.out.println(Arrays.toString(marr));
	        
	        int max = 0;
	        for(int i=0; i<larr.length; i++)
	            for(int j=0; j<marr.length; j++){
	                if(inter(i,j,L,M)) continue;
	               // System.out.println(i+" "+j);
	                max = Math.max(larr[i]+marr[j], max);
	               // System.out.println(max);
	            }
	        

	        return max;
	    }
	}
}
