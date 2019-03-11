package com.github.extermania.leetcode;

public class $1008_Construct_Binary_Search_Tree_from_Preorder_Traversal_83_90 {
	class Solution {
	    void insert(TreeNode root, int val){
	        if(val>root.val){
	            if(root.right!=null) insert(root.right, val);
	            else root.right = new TreeNode(val);
	        }else{
	            if(root.left!=null) insert(root.left, val);
	            else root.left = new TreeNode(val);
	        }
	    }
	    public TreeNode bstFromPreorder(int[] preorder) {
	        if(preorder.length==0) return null;
	        TreeNode root = new TreeNode(preorder[0]);
	        for(int i=1; i<preorder.length; i++)
	            insert(root, preorder[i]);
	        return root;
	    }
	}
}
