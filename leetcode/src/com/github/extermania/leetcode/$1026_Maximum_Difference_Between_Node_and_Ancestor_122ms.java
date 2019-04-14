package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1026_Maximum_Difference_Between_Node_and_Ancestor_122ms {
	class Solution {
	    int f(TreeNode n, List<TreeNode> ans){
	        if(n==null) return 0;
	        int max=0;
	            for(TreeNode t:ans)
	                max=Math.max(max, Math.abs(t.val-n.val));
	        List<TreeNode> ans0 = new ArrayList<>(ans);
	        ans0.add(n);
	        int max0 = Math.max(f(n.left, ans0), f(n.right, ans0));
	        return Math.max(max0, max);
	    }
	    public int maxAncestorDiff(TreeNode root) {
	        return f(root, new ArrayList<>());
	    }
	}
}
