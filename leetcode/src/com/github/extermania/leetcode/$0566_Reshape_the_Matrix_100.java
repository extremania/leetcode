package com.github.extermania.leetcode;

public class $0566_Reshape_the_Matrix_100 {
	class Solution {
	    public int[][] matrixReshape(int[][] nums, int r, int c) {
	        if(nums.length==0 || nums[0].length==0) return new int[r][c];
	        if(nums.length==r && nums[0].length==c) return nums;
	        if(nums.length*nums[0].length!=r*c) return nums;
	        int[][] arr = new int[r][c];
	        int k = 0;
	        int l = 0;
	        for(int i=0; i<nums.length; i++){
	            for(int j=0; j<nums[0].length; j++){
	                arr[k][l]=nums[i][j];
	                if(++l==c){
	                    k++; l=0;
	                }
	            }
	        }
	        
	        return arr;
	    }
	}
}
