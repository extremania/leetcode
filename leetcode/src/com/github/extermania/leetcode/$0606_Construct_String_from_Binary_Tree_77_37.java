package com.github.extermania.leetcode;

public class $0606_Construct_String_from_Binary_Tree_77_37 {
	class Solution {
	    public String tree2str(TreeNode t) {
	        if(t==null) return "";
	        if(t.left==null && t.right==null) return String.valueOf(t.val);
	        if(t.right!=null)
	            return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
	        else 
	            return t.val+"("+tree2str(t.left)+")";
	    }
	}
}
