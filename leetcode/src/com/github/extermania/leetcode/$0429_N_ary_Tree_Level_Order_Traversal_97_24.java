package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0429_N_ary_Tree_Level_Order_Traversal_97_24 {
	class Solution {
	    public List<List<Integer>> levelOrder(Node root) {
	        if(root==null) return new ArrayList<>();
	        List<Node> list = new ArrayList<>();
	        list.add(root);
	        List<List<Integer>> r = new ArrayList<>();
	        while(list.size()>0){
	            List<Node> list0 = new ArrayList<>();
	            List<Integer> vs = new ArrayList<>();
	            for(Node n:list){
	                vs.add(n.val);
	                if(n.children!=null) list0.addAll(n.children);
	            }
	            r.add(vs);
	            list=list0;
	        }
	        return r;
	    }
	}
}
