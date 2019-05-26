package com.github.extermania.leetcode;

public class $0495_Teemo_Attacking_52_64 {
	class Solution {
	    public int findPoisonedDuration(int[] timeSeries, int duration) {
	        if(timeSeries.length==0) return 0;
	        int s = 0; int e = 0; int sum = 0;
	        for(int i=0; i<timeSeries.length; i++){
	            if(i>0 && timeSeries[i]==timeSeries[i-1]) continue;
	            sum+=(timeSeries[i]>s&&timeSeries[i]<e)?(timeSeries[i]-s):duration;
	            s = timeSeries[i]; e = timeSeries[i] + duration;
	        }
	        return sum;
	    }
	}
}
