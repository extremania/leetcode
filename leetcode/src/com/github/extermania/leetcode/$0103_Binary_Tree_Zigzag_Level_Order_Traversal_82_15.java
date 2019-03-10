package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0103_Binary_Tree_Zigzag_Level_Order_Traversal_82_15 {
	class Solution {
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        if(root==null) return new ArrayList<>();
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        boolean order = true;
	        List<List<Integer>> rst = new ArrayList<>();
	        while(list.size()>0){
	            List<Integer> vals = new ArrayList<>();
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                vals.add(node.val);
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            if(!order){ Collections.reverse(vals); }
	            rst.add(vals);
	            order=!order;
	            list = list0;
	        }
	        return rst;
	    }
	}
}
