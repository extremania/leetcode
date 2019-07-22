package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $1123_Lowest_Common_Ancestor_of_Deepest_Leaves_9_42 {
	class Solution {
	    public TreeNode lcaDeepestLeaves(TreeNode root) {
	        if(root==null) return null;
	        
	        Map<TreeNode, TreeNode> map = new HashMap<>();
	        Set<TreeNode> set = new HashSet<>();
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            boolean last = true;
	            for(TreeNode node:list){
	                if(node.left!=null){
	                    map.put(node.left, node);
	                    list0.add(node.left);
	                    last=false;
	                }
	                if(node.right!=null){
	                    map.put(node.right, node);
	                    list0.add(node.right);
	                    last=false;
	                }
	            }
	            if(last) set = new HashSet<>(list);
	            list = list0;
	        }
	        
	        while(set.size()!=1){
	            Set<TreeNode> set0 = new HashSet<>();
	            for(TreeNode node:set)
	                set0.add(map.get(node));
	            set = set0;
	        }
	        
	        return set.iterator().next();
	    }
	}
}
