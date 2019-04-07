package com.github.extermania.leetcode;

public class $1022_Sum_of_Root_To_Leaf_Binary_Numbers_100 {
	class Solution {
	    int f(TreeNode node, int cur){
	        if(node==null) return 0;
	        int cur0 = (cur<<1)+node.val;
	        //System.out.println(cur0);
	        if(node.left==null && node.right==null)
	             return cur0;
	        return f(node.left, cur0) + f(node.right, cur0);
	        
	    }
	    public int sumRootToLeaf(TreeNode root) {
	        return f(root, 0);
	    }
	}
}
