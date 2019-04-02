package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0113_Path_Sum_II_34_98 {
	class Solution {
	    void f(List<List<Integer>> rst, List<Integer> cur, TreeNode node, int cursum, int sum){
	        if(node.left==null && node.right==null){
	            if(cursum+node.val==sum){
	                List<Integer> cur2 = new ArrayList<>(cur);
	                cur2.add(node.val);
	                rst.add(cur2);
	            }
	            return;
	        }else{
	            List<Integer> cur2 = new ArrayList<>(cur);
	            cur2.add(node.val);
	            if(node.left!=null) f(rst, cur2, node.left, cursum+node.val, sum);
	            if(node.right!=null) f(rst, cur2, node.right, cursum+node.val, sum);
	        }
	    }
	    
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	         List<List<Integer>> rst = new ArrayList<>();
	        
	        if(root==null) return rst;
	        
	        f(rst, new ArrayList<>(), root, 0, sum);
	        
	        return rst;
	    }
	}
}
