package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0637_Average_of_Levels_in_Binary_Tree_25_17 {
	class Solution {
	    public List<Double> averageOfLevels(TreeNode root) {
	        List<Double> rst = new ArrayList<>();
	        
	        if(root==null) return rst;
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            Double sum = 0d;
	            for(TreeNode node:list){
	                sum+=node.val;
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            rst.add(sum/list.size());
	            list=list0;
	        }
	        
	        return rst;
	    }
	}
}
