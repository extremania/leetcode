package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0561_Array_Partition_I_91_95 {
	class Solution {
	    public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int cnt=0;
	        for(int i=0; i<nums.length; i+=2){
	            cnt+=nums[i];
	        }
	        return cnt;
	    }
	}
}
