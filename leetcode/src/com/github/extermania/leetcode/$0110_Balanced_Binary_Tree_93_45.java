package com.github.extermania.leetcode;

public class $0110_Balanced_Binary_Tree_93_45 {
	static class Solution {
	    
	    static int d(TreeNode node){
	        return node==null?0:1+Math.max(d(node.right), d(node.left));
	    }
	    
	    public boolean isBalanced(TreeNode root) {
	        return root==null?true:Math.abs(d(root.right)-d(root.left))<=1 && isBalanced(root.right) && isBalanced(root.left);
	    }
	}
}
