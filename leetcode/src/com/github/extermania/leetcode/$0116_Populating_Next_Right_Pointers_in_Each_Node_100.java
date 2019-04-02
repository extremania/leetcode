package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0116_Populating_Next_Right_Pointers_in_Each_Node_100 {
	class Solution {
	    public Node connect(Node root) {
	        if(root==null) return null;
	        
	        List<Node> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            
	            List<Node> list2 = new ArrayList<>();
	            
	            for(int i=0; i<list.size(); i++){
	                Node n = list.get(i);
	                if(i<list.size()-1) n.next=list.get(i+1);
	                if(n.left!=null) list2.add(n.left);
	                if(n.right!=null) list2.add(n.right);
	            }
	            
	            list=list2;
	            
	        }
	        
	     
	        return root;
	    }
	}
	
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}

	    public Node(int _val,Node _left,Node _right,Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
}
