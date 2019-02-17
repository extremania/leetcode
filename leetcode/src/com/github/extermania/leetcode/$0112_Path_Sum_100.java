package com.github.extermania.leetcode;

public class $0112_Path_Sum_100 {
	class Solution {
	    public boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null) return false;
	        if(root.right==null && root.left==null) return sum==root.val;
	        return hasPathSum(root.right, sum-root.val) || hasPathSum(root.left, sum-root.val);
	    }
	}
}
