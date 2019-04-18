package com.github.extermania.leetcode;

public class $0617_Merge_Two_Binary_Trees_100 {
	class Solution {
	    TreeNode m(TreeNode t1, TreeNode t2){
	        if(t1==null) return t2;
	        if(t2==null) return t1;
	        TreeNode n = new TreeNode((t1==null?0:t1.val)+(t2==null?0:t2.val));
	        n.left=m(t1.left==null?null:t1.left, t2.left==null?null:t2.left);
	        n.right=m(t1.right==null?null:t1.right, t2.right==null?null:t2.right);
	        return n;
	    }
	    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        return m(t1, t2);
	    }
	}
}
