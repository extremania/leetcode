package com.github.extermania.leetcode;

public class $1109_Corporate_Flight_Bookings_35_65 {
	class Solution {
	    public int[] corpFlightBookings(int[][] bookings, int n) {
	        int[] arr = new int[n];
	        for(int[] b:bookings) for(int i=b[0]-1; i<b[1]; i++) arr[i]+=b[2];
	        return arr;
	    }
	}
}
