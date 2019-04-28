package com.github.extermania.leetcode;

public class $0307_Range_Sum_Query_Mutable_15_45 {
	class NumArray {
	    
	    int[] sum;
	    boolean z;
	    int[] nums;

	    public NumArray(int[] nums) {
	        if(nums.length==0){ z=true; return;}
	        sum = new int[nums.length];
	        sum[0]=nums[0];
	        for(int i=1; i<nums.length;i++)
	            sum[i]=sum[i-1]+nums[i];
	        this.nums=nums;
	    }
	    
	    public void update(int i, int val) {
	        if(z)return;
	        int diff =val-nums[i];
	        nums[i]=val;
	        for(int j=i; j<nums.length;j++)
	            sum[j]+=diff;
	    }
	    
	    public int sumRange(int i, int j) {
	        if(z)return 0;
	        if(i==0) return sum[j];
	        return sumRange(0, j)-sumRange(0, i-1);
	    }
	}
}
