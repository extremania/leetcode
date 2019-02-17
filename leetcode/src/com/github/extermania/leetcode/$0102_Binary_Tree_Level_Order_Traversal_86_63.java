package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0102_Binary_Tree_Level_Order_Traversal_86_63 {
	class Solution {
	    private void update(TreeNode node, List<List<Integer>> result, Integer lv){
	        if(result.size()<=lv){
	            result.add(new ArrayList<>());
	        }
	        List<Integer> list = result.get(lv);
	        list.add(node.val);
	        if(node.left!=null) update(node.left, result, lv+1);
	        if(node.right!=null) update(node.right, result, lv+1);
	    }
	    
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        if(root==null){
	            return result;
	        }
	        result.add(new ArrayList<>());
	        update(root, result, 0);
	        return result;
	    }
	}
}
