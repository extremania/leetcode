package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1080_Insufficient_Nodes_in_Root_to_Leaf_Paths_15_24 {
	class Solution {
	    class Node{
	        int sum;
	        Node p;
	        TreeNode n;
	        Node(TreeNode n){
	           this.n=n;
	        }
	    }
	    
	    List<Node> nodes;
	    
	    void f(Node n, Node parent){
	        n.p=parent;
	        n.sum=(parent==null?0:parent.sum)+n.n.val;
	        if(n.n.left==null && n.n.right==null) nodes.add(n);
	        if(n.n.left!=null) f(new Node(n.n.left), n);
	        if(n.n.right!=null) f(new Node(n.n.right), n);
	    }

	    
	    public TreeNode sufficientSubset(TreeNode root, int limit) {
	        
	        if(root==null) return null;
	        
	        boolean flag = true;
	        while(flag){
	           Node r = new Node(root);
	           nodes = new ArrayList<>();
	           f(r, null);
	           flag = false;
	            
	           if(nodes.size()==1 && nodes.get(0).n==root && nodes.get(0).n.val<limit) return null;
	          
	           for(Node n:nodes){
	               if(n.sum<limit) {
	                   flag=true;
	                   if(n.p.n.left==n.n) n.p.n.left=null;
	                   else n.p.n.right=null;
	                   while(n.p.n.left==null && n.p.n.right==null){
	                       n = n.p;
	                       if(n==null || n.p==null) break;
	                       if(n.p.n.left==n.n) n.p.n.left=null;
	                       else n.p.n.right=null;
	                   }
	               }
	           }
	        }
	        
	        return root;
	    }
	}
}
