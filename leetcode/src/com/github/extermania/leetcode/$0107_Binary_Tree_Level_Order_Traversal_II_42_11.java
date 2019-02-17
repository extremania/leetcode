package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0107_Binary_Tree_Level_Order_Traversal_II_42_11 {
	class Solution {
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        if(root==null) return new ArrayList<>();
	        List<List<Integer>> list = new ArrayList<>();
	        List<TreeNode> st = new ArrayList<>();
	        st.add(root);
	        while(st.size()>0){
	            List<TreeNode> st0 = new ArrayList<>();
	            List<Integer> v = new ArrayList<>();
	            for(TreeNode n:st){
	                v.add(n.val);
	                if(n.left!=null) st0.add(n.left);
	                if(n.right!=null) st0.add(n.right);
	                
	            }
	            list.add(v);
	            st = st0;
	        }
	         Collections.reverse(list);
	        return list;
	    }
	}
}
