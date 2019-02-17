package com.github.extermania.leetcode;

public class $0226_Invert_Binary_Tree_100 {
	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        if(root==null) return null;
	        TreeNode temp = root.right;
	        root.right=root.left;
	        root.left=temp;
	        invertTree(root.left);
	        invertTree(root.right);
	        return root;
	    }
	}
}
