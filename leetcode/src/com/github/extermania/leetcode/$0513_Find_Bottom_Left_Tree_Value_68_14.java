package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0513_Find_Bottom_Left_Tree_Value_68_14 {
	class Solution {
	    public int findBottomLeftValue(TreeNode root) {
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode n:list){
	                if(n.left!=null) list0.add(n.left);
	                if(n.right!=null) list0.add(n.right);
	            }
	            if(list0.size()==0) return list.get(0).val;
	            list=list0;
	        }
	        return 0;
	    }
	}
}
