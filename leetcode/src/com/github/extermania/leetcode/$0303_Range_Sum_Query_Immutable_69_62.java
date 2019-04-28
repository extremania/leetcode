package com.github.extermania.leetcode;

public class $0303_Range_Sum_Query_Immutable_69_62 {
	class NumArray {
	    
	    int[] sum;
	  
	    public NumArray(int[] nums) {
	        if(nums.length==0) return;
	        sum=new int[nums.length];
	        sum[0]=nums[0];
	        for(int i=1; i<nums.length; i++)
	            sum[i]=sum[i-1]+nums[i];
	    }
	    
	    int f(int i, int j){
	        if(i==0) return sum[j];
	        else return f(0, j)-f(0, i-1);
	    }
	    
	    public int sumRange(int i, int j) {
	      if(sum.length==0) return 0;
	       return f(i, j);
	    }
	}
}
