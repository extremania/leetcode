package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0173_Binary_Search_Tree_Iterator_99_04 {
	class BSTIterator {
	    
	    List<TreeNode> stack;

	    public BSTIterator(TreeNode root) {
	        stack = new ArrayList<>();
	        TreeNode cur = root;
	        while(cur!=null){
	            stack.add(cur);
	            cur=cur.left;
	        }
	    }
	    
	    /** @return the next smallest number */
	    public int next() {
	        TreeNode n = stack.remove(stack.size()-1);
	        
	        TreeNode cur = n.right;
	        while(cur!=null){
	            stack.add(cur);
	            cur=cur.left;
	        }
	        
	        return n.val;
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return stack.size()>0;
	    }
	}
}
