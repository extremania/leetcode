package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0108_Convert_Sorted_Array_to_Binary_Search_Tree_45_73 {
	class Solution {
	    public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length==0) return null;
	        int mid=nums.length/2;
	        TreeNode root = new TreeNode(nums[mid]);
	        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
	        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, nums.length));
	        return root;
	    }
	}
}
