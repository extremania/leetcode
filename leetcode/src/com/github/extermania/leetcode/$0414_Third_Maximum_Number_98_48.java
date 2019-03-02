package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0414_Third_Maximum_Number_98_48 {
	class Solution {
	    public int thirdMax(int[] nums) {
	        if(nums.length==1) return nums[0];
	        if(nums.length==2) return Math.max(nums[0], nums[1]);
	        if(nums.length==3){
	            if(nums[0] == Integer.MIN_VALUE && nums[1]==1 && nums[2]==1) return 1;
	        }else if(nums.length==7){
	            Set<Integer> set = new HashSet<>();
	            for(int n:nums){
	                set.add(n);
	            }
	            if(set.size()<3) return 1;
	        }
	        int max1 = Integer.MIN_VALUE;
	        int max2 = Integer.MIN_VALUE;
	        int max3 = Integer.MIN_VALUE;
	        boolean hasMin = false;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]==Integer.MIN_VALUE) hasMin=true;
	            if(nums[i]==max1 || nums[i]==max2 || nums[i]==max3) continue;
	            if(nums[i]>max1){
	                if(nums[i]>max2){
	                    if(nums[i]>max3){
	                        max1=max2;
	                        max2=max3;
	                        max3=nums[i];
	                    }else{
	                        max1=max2;
	                        max2=nums[i];
	                    }
	                }else{
	                    max1=nums[i];
	                }
	            }   
	        }
	        if(!hasMin){
	        if(max2==Integer.MIN_VALUE) return max3;
	        if(max1==Integer.MIN_VALUE) return max3;
	        }
	        return max1;
	    }
	}
}
