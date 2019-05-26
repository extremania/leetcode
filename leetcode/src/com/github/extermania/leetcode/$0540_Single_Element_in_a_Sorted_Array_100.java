package com.github.extermania.leetcode;

public class $0540_Single_Element_in_a_Sorted_Array_100 {
	class Solution {
	    public int singleNonDuplicate(int[] nums) {
	        int s = 0;
	        for(int n:nums) s^=n;
	        return s;
	    }
	}
}
