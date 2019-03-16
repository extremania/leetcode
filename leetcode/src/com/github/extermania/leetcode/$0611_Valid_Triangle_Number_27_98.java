package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0611_Valid_Triangle_Number_27_98 {
	class Solution {
	    public int triangleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int cnt=0;
	        for(int i=0; i<nums.length-2; i++){
	            for(int j=i+1; j<nums.length-1; j++){
	                for(int k=j+1; k<nums.length; k++){
	                    if(nums[i]+nums[j]>nums[k]) cnt++;
	                    else break;
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
