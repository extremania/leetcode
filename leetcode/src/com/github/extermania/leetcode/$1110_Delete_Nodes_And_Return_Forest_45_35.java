package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $1110_Delete_Nodes_And_Return_Forest_45_35 {
	class Solution {
	    void f(TreeNode node, Set<Integer> set, List<TreeNode> list, boolean pd){
	        if(node==null) return;
	        if(set.contains(node.val)){
	            f(node.left, set, list, true);
	            f(node.right, set, list, true);
	        }else{
	            if(pd) list.add(node);
	            f(node.left, set, list, false);
	            f(node.right, set, list, false);
	        }
	        if(node.left!=null){
	            if(set.contains(node.left.val)) node.left=null;
	        }
	        if(node.right!=null){
	            if(set.contains(node.right.val)) node.right=null;
	        }
	    }
	    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
	        if(root==null) return null;
	        Set<Integer> set = new HashSet<>();
	        List<TreeNode> list = new ArrayList<>();
	        for(int n:to_delete) set.add(n);
	        f(root, set, list, true);
	        return list;
	    }
	}
}
