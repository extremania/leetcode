package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0209_Minimum_Size_Subarray_Sum_4_55 {
	class Solution {
	    public int minSubArrayLen(int s, int[] nums) {
	        if(nums.length==0) return 0;
	        if(s<=0) return 0;
	        if(nums.length==1) return nums[0]>=s?0:1;
	        int[] sub = new int[nums.length - 1];
			int[] neu = new int[nums.length - 1];
	        for(int n:nums){
	            if(n>=s) return 1;
	        }
	        int cnt=2;
			while (true) {
				for (int i = 0; i < neu.length; i++) {
					neu[i] = nums[i] + nums[i + 1] - sub[i];
					if (neu[i] >= s) {
						return cnt;
					}
				}
				if (neu.length == 1)
					return 0;
				sub = Arrays.copyOfRange(nums, 1, nums.length - 1);
				nums = neu;
				neu = new int[nums.length - 1];
	            cnt++;
			}
	    }
	}
}
