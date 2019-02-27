package com.github.extermania.leetcode;

import java.util.List;

public class $0559_Maximum_Depth_of_N_ary_Tree_99_95 {
	static class Solution {
	    private static int dep(Node n, int d){
	        if(n==null) return d;
	        List<Node> ns = n.children;
	        if(ns==null || ns.size()==0) return d;
	        int max = 0;
	        for(Node node:ns){
	            int d2 = dep(node, d+1);
	            max = Math.max(max, d2);
	        }
	        return max;
	    }
	    public int maxDepth(Node root) {
	        if(root==null) return 0;
	        return dep(root, 1);
	    }
	}
}
