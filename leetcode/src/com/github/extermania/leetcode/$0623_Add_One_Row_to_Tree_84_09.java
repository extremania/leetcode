package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0623_Add_One_Row_to_Tree_84_09 {
	class Solution {
	    public TreeNode addOneRow(TreeNode root, int v, int d) {
	        
	        if(d==1){
	            TreeNode node = new TreeNode(v);
	            node.left=root;
	            return node;
	        }
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        for(int i=1; i<d-1; i++){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            list = list0;
	        }
	        
	       for(TreeNode node:list){
	           TreeNode le = new TreeNode(v);
	           TreeNode ri = new TreeNode(v);
	           le.left=node.left;
	           node.left=le;
	           ri.right=node.right;
	           node.right=ri; 
	       }
	        
	        return root;
	        
	    }
	}
}
