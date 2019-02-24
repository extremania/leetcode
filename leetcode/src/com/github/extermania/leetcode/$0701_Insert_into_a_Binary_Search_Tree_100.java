package com.github.extermania.leetcode;

public class $0701_Insert_into_a_Binary_Search_Tree_100 {
	class Solution {
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root==null) return new TreeNode(val);
	        if(val>root.val){
	            if(root.right == null) { root.right = new TreeNode(val); return root;}
	            else insertIntoBST(root.right, val);
	        }
	        if(val<root.val){
	            if(root.left == null) { root.left = new TreeNode(val); return root; }
	            else insertIntoBST(root.left, val);
	        }
	        return root;
	    }
	}
}
