package com.github.extermania.leetcode;

public class $1124_Longest_Well_Performing_Interval_5_02 {
	class Solution {
	    public int longestWPI(int[] hours) {
	        int max = 0;
	        for(int i=0; i<hours.length; i++){
	            if(hours.length-i<=max) break;
	            int t = 0; int nt = 0;
	            for(int j=i; j<hours.length; j++){
	                if(hours[j]>8) t++;
	                else nt++;
	                //System.out.println(i+" "+j+" "+t+" "+nt+"");
	                if(t>nt) max = Math.max(j-i+1, max);
	                if(t-nt+(hours.length-j)<=0) break;
	            }
	        }
	        return max;
	    }
	}
}
