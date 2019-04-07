package com.github.extermania.leetcode;

public class $1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60_100 {
	class Solution {
	    public int numPairsDivisibleBy60(int[] time) {
	        if(time.length<=1) return 0;
	        int cnt = 0;
	        int[] arr = new int[61];
	        for(int n:time) arr[n%60]++;
	        
	         // for(int i=0; i<arr.length; i++){
	         //     System.out.println(i+" "+arr[i]);
	         // }
	        
	        cnt+=(f(arr[0])+f(arr[30]));
	        for(int i=1; i<30; i++)  cnt+=(arr[i]*arr[60-i]);
	    
	        return cnt;
	    }
	    int f(int n){
	        if(n==0) return 0;
	        return n*(n-1)/2;
	    }
	}
}
