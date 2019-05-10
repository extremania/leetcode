package com.github.extermania.leetcode;

public class $1037_Valid_Boomerang_100 {
	class Solution {
	    public boolean isBoomerang(int[][] points) {

	        int[] p1 = points[0];
	        int[] p2 = points[1];
	        int[] p3 = points[2];
	        
	        if(p1[0]==p2[0] && p1[1]==p2[1] || p1[0]==p3[0] && p1[1]==p3[1] || p3[0]==p2[0] && p3[1]==p2[1]) return false;
	        if(p1[0]==p2[0] && p1[0]==p3[0] || p1[1]==p2[1] && p1[1]==p3[1]) return false;
	        
	        p2[0]=p2[0]-p1[0]; p2[1]=p2[1]-p1[1];
	        p3[0]=p3[0]-p1[0]; p3[1]=p3[1]-p1[1];
	        
	        //System.out.println((double)p2[0]/(double)p2[1]);
	       // System.out.println((double)p3[0]/(double)p3[1]);
	        
	        return !((double)p2[0]/(double)p2[1] == (double)p3[0]/(double)p3[1]);
	        
	    } 
	}
}
