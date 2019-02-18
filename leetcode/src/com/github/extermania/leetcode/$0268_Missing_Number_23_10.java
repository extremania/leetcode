package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0268_Missing_Number_23_10 {
	class Solution {
	    public int missingNumber(int[] nums) {
	        if(nums.length==1) 
	            return nums[0]==1?0:1;
	        Arrays.sort(nums);
	        if(nums[0]!=0) return 0;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i+1]-nums[i]>1) return nums[i]+1;
	        }
	        return nums.length;
	    }
	}
}
