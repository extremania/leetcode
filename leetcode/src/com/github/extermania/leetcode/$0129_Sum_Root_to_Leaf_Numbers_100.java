package com.github.extermania.leetcode;

public class $0129_Sum_Root_to_Leaf_Numbers_100 {
	class Solution {
	    int cal(TreeNode node, int cur){
	        //System.out.println(node.val+" "+cur);
	        if(node.left==null && node.right==null) return cur;
	        int cur0 = 0;
	        if(node.right!=null) cur0+=cal(node.right, cur*10+node.right.val);
	        if(node.left!=null) cur0+=cal(node.left, cur*10+node.left.val);   
	        return cur0;
	    }
	    public int sumNumbers(TreeNode root) {
	        if(root==null) return 0;
	        return cal(root, root.val);
	    }
	}
}
