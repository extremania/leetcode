package com.github.extermania.leetcode;

public class $0965_Univalued_Binary_Tree_99_71 {
	class Solution {
	    
	    int v = 0;
	    
	    private boolean f(TreeNode root){
	        if(root==null) return true; 
	        return root.val==v && f(root.left) && f(root.right);
	    }
	    public boolean isUnivalTree(TreeNode root) {
	        if(root==null) return true;    
	        v = root.val;
	        return f(root);
	    }
	}
}
