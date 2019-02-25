package com.github.extermania.leetcode;

public class $0645_Set_Mismatch_99_57 {
	class Solution {
	    public int[] findErrorNums(int[] nums) {
	        //Arrays.sort(nums);
	        int[] arr=new int[2];
	        int[] nums0 = new int[nums.length];
	        int k = 0;
	        for(int i=0; i<nums.length; i++) nums0[nums[i]-1]++;
	        //System.out.println(Arrays.toString(nums0));
	        for(int i=0; i<nums0.length; i++){
	            if(nums0[i]==0){
	                arr[1]=i+1;
	                k++;
	            }else if(nums0[i]==2){
	                arr[0]=i+1;
	                k++;
	            }
	            if(k==2) return arr;
	        }
	        return arr;
	    }
	}
}
