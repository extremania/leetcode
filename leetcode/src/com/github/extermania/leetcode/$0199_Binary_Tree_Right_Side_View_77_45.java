package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0199_Binary_Tree_Right_Side_View_77_45 {
	class Solution {
	    public List<Integer> rightSideView(TreeNode root) {
	        if(root==null) return Arrays.asList();
	        List<Integer> rst = new ArrayList<>();
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            rst.add(list.get(list.size()-1).val);
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode n:list){
	                if(n.left!=null) list0.add(n.left);
	                if(n.right!=null) list0.add(n.right);
	            }
	            list=list0;
	        }
	        
	        return rst;
	        
	    }
	}
}
