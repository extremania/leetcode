package com.github.extermania.leetcode;

public class $0101_Symmetric_Tree_94_60 {
	static class Solution {
	    static boolean isSame(TreeNode n1, TreeNode n2){
	        if(n1!=null && n2==null) return false;
	        if(n1==null && n2!=null) return false;
	        if(n1==null && n2==null) return true;
	        return n1.val==n2.val && isSame(n1.left, n2.right) && isSame(n1.right, n2.left);
	    }
	    public boolean isSymmetric(TreeNode root) {
	        if(root==null) return true;
	        return isSame(root.left, root.right);
	    }
	}
}
