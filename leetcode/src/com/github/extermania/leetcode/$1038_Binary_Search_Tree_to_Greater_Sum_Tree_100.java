package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1038_Binary_Search_Tree_to_Greater_Sum_Tree_100 {
	class Solution {
	    
	    int sum(TreeNode node){
	        if(node==null) return 0;
	        if(node.left==null && node.right==null) return node.val;
	        return node.val+sum(node.left)+sum(node.right);
	    }
	    
	    void list(TreeNode node, List<TreeNode> list){
	        if(node.left==null && node.right==null){
	            list.add(node);
	        }else{
	            if(node.left!=null) list(node.left, list);
	            list.add(node);
	            if(node.right!=null) list(node.right, list);
	        }
	    }
	    
	    public TreeNode bstToGst(TreeNode root) {
	        if(root==null) return root;
	        int sum = sum(root);
	        
	        List<TreeNode> list = new ArrayList<>();
	        list(root, list);
	        
	        int temp = 0;
	        for(TreeNode node:list){
	            int cur = node.val;
	            node.val = sum-temp;
	            sum-=temp;
	            temp = cur;
	        }

	        return root;
	    }
	}
}
