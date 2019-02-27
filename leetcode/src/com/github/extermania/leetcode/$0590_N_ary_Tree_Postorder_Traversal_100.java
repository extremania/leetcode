package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0590_N_ary_Tree_Postorder_Traversal_100 {
	static class Solution {
	    
	    private static void tra(Node node, List<Integer> r){

	        if(node.children!=null){
	            for(Node child:node.children){
	                tra(child, r);
	            }
	        }
	        r.add(node.val);
	    }
	    
	    public List<Integer> postorder(Node root) {
	        List<Integer> r = new ArrayList<>();
	        if(root==null) return r;
	        tra(root, r);
	        return r;
	    }
	}
}
