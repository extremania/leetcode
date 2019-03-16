package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0515_Find_Largest_Value_in_Each_Tree_Row_94_60 {
	class Solution {
	    public List<Integer> largestValues(TreeNode root) {
	        List<Integer> rst = new ArrayList<>();
	        if(root==null) return rst;
	        List<TreeNode> list = new ArrayList<>(); list.add(root);
	       
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            int max = Integer.MIN_VALUE;
	            for(TreeNode n:list){
	                max=Math.max(max, n.val);
	                if(n.left!=null) list0.add(n.left);
	                if(n.right!=null) list0.add(n.right);
	            }
	            rst.add(max);
	            list=list0;
	        }
	        return rst;
	    }
	}
}
