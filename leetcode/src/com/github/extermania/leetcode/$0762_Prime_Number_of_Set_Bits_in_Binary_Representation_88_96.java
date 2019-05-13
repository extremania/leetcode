package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0762_Prime_Number_of_Set_Bits_in_Binary_Representation_88_96 {
	class Solution {
	    public int countPrimeSetBits(int L, int R) {
	        int[] arr=new int[]{2,3,5,7,11,13,17,19,23,29,31};
	        int cnt=0;
	        for(int i=L; i<=R; i++)
	            if(Arrays.binarySearch(arr, Integer.bitCount(i))>=0) cnt++;
	        return cnt;
	    }
	}
}
