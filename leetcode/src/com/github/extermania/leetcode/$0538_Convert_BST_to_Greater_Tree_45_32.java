package com.github.extermania.leetcode;

import java.util.Iterator;
import java.util.LinkedList;

public class $0538_Convert_BST_to_Greater_Tree_45_32 {
	class Solution {
	    void toList(TreeNode node,  LinkedList<TreeNode> list){
	        if(node==null) return;
	        toList(node.right,list);
	        list.add(node);
	        toList(node.left, list); 
	    }
	    public TreeNode convertBST(TreeNode root) {
	        if(root==null) return root;
	        LinkedList<TreeNode> list = new LinkedList<>();
	        toList(root, list);
	        int sum = 0;
	        Iterator<TreeNode> it = list.iterator();
	        while(it.hasNext()){
	            TreeNode next = it.next();
	            next.val+=sum;
	            sum=next.val;
	        }
	        return root;
	    }
	}
}
