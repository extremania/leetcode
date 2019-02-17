package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0104_Maximum_Depth_of_Binary_Tree_21_97 {
	class Solution {
	    
	    public int maxDepth(TreeNode root) {
	        if(root == null) return 0;
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        int n = 0;
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            list=list0;
	            n++;
	        }
	        return n;
	    }
	}
}
