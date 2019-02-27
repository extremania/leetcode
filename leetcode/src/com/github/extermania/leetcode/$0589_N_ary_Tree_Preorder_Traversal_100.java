package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0589_N_ary_Tree_Preorder_Traversal_100 {
	class Solution {
	    private void tra(Node node, List<Integer> r){
	        r.add(node.val);
	        if(node.children!=null){
	            for(Node child:node.children){
	                tra(child, r);
	            }
	        }
	    }
	    
	    public List<Integer> preorder(Node root) {
	        List<Integer> r = new ArrayList<>();
	        if(root==null) return r;
	        tra(root, r);
	        return r;
	    }
	}
}
