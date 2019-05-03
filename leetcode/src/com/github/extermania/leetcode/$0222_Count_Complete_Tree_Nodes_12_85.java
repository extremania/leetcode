package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0222_Count_Complete_Tree_Nodes_12_85 {
	class Solution {
	    public int countNodes(TreeNode root) {
	        if(root==null) return 0;
	        int cnt =1;
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode n:list){
	                if(n.left!=null){
	                    list0.add(n.left); cnt++;
	                } 
	                if(n.right!=null){
	                    list0.add(n.right); cnt++;
	                } 
	                else{
	                    return cnt;
	                }
	            }
	            list = list0;
	        }
	        return cnt;
	    }
	}
}
