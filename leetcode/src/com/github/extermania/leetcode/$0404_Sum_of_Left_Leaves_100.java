package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0404_Sum_of_Left_Leaves_100 {
	static class Solution {
	    public int sumOfLeftLeaves(TreeNode root) {
	        if(root==null) return 0;
	        int cnt = 0;
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                if(node.left!=null){
	                    if(node.left.right==null && node.left.left==null){
	                         cnt+= node.left.val;
	                    }
	                    list0.add(node.left); }
	                if(node.right!=null) {list0.add(node.right); }
	              
	            }
	              list = list0;
	        }
	        return cnt;
	    }
	}
}
