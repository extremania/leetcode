package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0452_Minimum_Number_of_Arrows_to_Burst_Balloons_31_68 {
	class Solution {
	    public int findMinArrowShots(int[][] points) {
	        if(points.length==1) return 1;
	       Arrays.sort(points, (a,b)->{
	           int n = a[0]-b[0]; 
	           return n!=0?n:a[1]-b[1];
	       });
	        int s = Integer.MIN_VALUE;  int e  = Integer.MIN_VALUE;
	        int cnt = 0;
	        for(int[] p:points){
	            if(s<=p[0] && e>=p[0]){
	                s=p[0];
	                e=Math.min(p[1], e);
	            }else{
	                cnt++;
	                s=p[0]; e=p[1];
	            }
	        }
	        return cnt;
	    }
	}
}
