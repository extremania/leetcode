package com.github.extermania.leetcode;

public class $0100_Same_Tree_100 {
	class Solution {
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p==null && q==null) return true;
	        if(p==null && q!=null) return false;
	        if(p!=null && q==null) return false;
	        return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    }
	}
}
