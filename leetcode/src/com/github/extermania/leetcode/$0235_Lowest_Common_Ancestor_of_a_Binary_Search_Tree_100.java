package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree_100 {
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
	        int pv = p.val;
	        int qv = q.val;
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            
	            List<TreeNode> list0 = new ArrayList<>();
	            
	            for(TreeNode n:list){
	                if(n.val>=pv && n.val<=qv || n.val>=qv && n.val<=pv) return n;
	                if(n.left!=null) list0.add(n.left);
	                if(n.right!=null) list0.add(n.right);
	            }
	            
	            list = list0;
	        }
	        
	        return null;
	    }
	}
}
