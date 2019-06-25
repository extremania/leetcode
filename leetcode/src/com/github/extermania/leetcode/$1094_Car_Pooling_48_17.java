package com.github.extermania.leetcode;

public class $1094_Car_Pooling_48_17 {
	class Solution {
	    public boolean carPooling(int[][] trips, int capacity) {
	        int[] d = new int[1000];
	        for(int[] t:trips){
	            for(int i=t[1]; i<t[2]; i++){
	                d[i]+=t[0];
	                if(d[i]>capacity) return false;
	            }
	        }
	        return true;
	    }
	}
}
