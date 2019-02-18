package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0257_Binary_Tree_Paths_78_36 {
	static class Solution {
	    static void f(TreeNode node, String str, List<String> list){
	        if(node==null) return;
	        String str0 = (str+"->"+node.val);
	        if(node.right==null && node.left==null) {
	            list.add(str0);
	        }
	        f(node.left, str0, list);
	        f(node.right, str0, list);
	    }
	    public List<String> binaryTreePaths(TreeNode root) {
	        List<String> list = new ArrayList<>();
	        if(root==null) return list;
	        
	        if(root.right==null && root.left==null){
	            return Arrays.asList(String.valueOf(root.val));
	        }
	        
	        f(root.left, String.valueOf(root.val), list);
	        f(root.right, String.valueOf(root.val), list);
	        
	        return list;
	        
	    }
	}
}
