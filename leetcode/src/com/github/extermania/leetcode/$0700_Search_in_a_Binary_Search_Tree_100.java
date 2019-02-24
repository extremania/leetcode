package com.github.extermania.leetcode;

public class $0700_Search_in_a_Binary_Search_Tree_100 {
	class Solution {
	    public TreeNode searchBST(TreeNode root, int val) {
	        if(root.val==val) return root;
	        if(root.val<val && root.right!=null) return searchBST(root.right, val);
	        if(root.val>val && root.left!=null) return searchBST(root.left, val);
	        return null;
	    }
	}
}
