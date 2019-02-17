package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0111_Minimum_Depth_of_Binary_Tree_30_41 {
	class Solution {
	    public int minDepth(TreeNode root) {
	        if(root==null) return 0;
	        List<TreeNode> list = new ArrayList<>();
	        int n = 0;
	        list.add(root);
	        while(list.size()>0){
	            n++;
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                if(node.left==null && node.right==null) return n;
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            list=list0;
	        }
	        return n;
	    }
	}
}
