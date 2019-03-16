package com.github.extermania.leetcode;

public class $0503_Next_Greater_Element_II_5_01 {
	class Solution {
	    public int[] nextGreaterElements(int[] nums) {
	        int[] arr = new int[nums.length];
	        boolean found = false;
	        for(int i=0; i<nums.length; i++){
	            for(int j=(i+1)%nums.length; j!=i; j=(j+1)%nums.length){
	                if(nums[j]>nums[i]){
	                    arr[i]=nums[j];
	                    found=true;
	                    break;
	                }
	            }
	            if(!found) arr[i]=-1;
	            found=false;
	        }
	        return arr;
	    }
	}
}
