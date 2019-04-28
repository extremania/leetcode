package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1033_Moving_Stones_Until_Consecutive_1ms {
	class Solution {
	    public int[] numMovesStones(int a, int b, int c) {
	        int[] arr = new int[]{a, b, c};
	        Arrays.sort(arr);
	        int a0=arr[0]; int b0=arr[1]; int c0=arr[2];
	        int min = Math.min(b0-a0-1,1)+Math.min(c0-b0-1, 1);
	        if(b0-a0==2||c0-b0==2) min = 1;
	        return new int[]{min, b0-a0-1+(c0-b0-1)};
	    }
	}
}
