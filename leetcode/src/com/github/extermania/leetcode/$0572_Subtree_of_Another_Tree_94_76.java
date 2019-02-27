package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0572_Subtree_of_Another_Tree_94_76 {
	static class Solution {
	    
	    static boolean sub(TreeNode s, TreeNode t){
	        if(s==null && t==null) return true;
	        if(s==null && t!=null) return false;
	        if(s!=null && t==null) return false;
	        return s.val==t.val && sub(s.right, t.right) && sub(s.left, t.left);
	    }    

	    public boolean isSubtree(TreeNode s, TreeNode t) {
	        if(s==null && t==null) return true;
	        if(s==null && t!=null) return false;
	        if(s!=null && t==null) return false;
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(s);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                if(node.val == t.val && sub(node, t)){
	                   return true;
	                }
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            list=list0;
	        }
	        
	        return false;
	    }
	}
}
