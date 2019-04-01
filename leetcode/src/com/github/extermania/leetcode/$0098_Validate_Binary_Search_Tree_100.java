package com.github.extermania.leetcode;

public class $0098_Validate_Binary_Search_Tree_100 {
	class Solution {
	    boolean f(TreeNode node, long le, long ri){
	        //System.out.println(node.val+" "+le+" "+ri);
	        if(node.val<=le || node.val>=ri) return false;
	        if(node.left!=null){
	            if(node.left.val>=node.val) return false;
	            if(node.left.val>=ri) return false;
	            if(!f(node.left, le, node.val)) return false; 
	        }
	        if(node.right!=null){
	            if(node.right.val<=node.val) return false;
	            if(node.right.val<=le) return false;
	            if(!f(node.right, node.val, ri)) return false; 
	        }
	        return true;
	    }
	    public boolean isValidBST(TreeNode root) {
	        if(root==null) return true;
	        return f(root, Long.MIN_VALUE, Long.MAX_VALUE);
	    }
	    
	}
}
