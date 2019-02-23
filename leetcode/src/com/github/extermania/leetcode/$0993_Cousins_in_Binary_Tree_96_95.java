package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0993_Cousins_in_Binary_Tree_96_95 {
	class Solution {
	    

	    public boolean isCousins(TreeNode root, int x, int y) {
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        Map<Integer, TreeNode> pMap = new HashMap<>();
	        
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            boolean xf = false;
	            boolean yf = false;
	            for(TreeNode n:list){
	                if(n.val==x) xf=true;
	                if(n.val==y) yf=true;
	                if(n.left!=null){
	                    list0.add(n.left);
	                    pMap.put(n.left.val, n);
	                }
	                if(n.right!=null){
	                    list0.add(n.right);
	                    pMap.put(n.right.val, n);
	                }
	                if(xf&&yf) {
	                    if(pMap.get(x)==pMap.get(y)) return false;
	                    return true;
	                }
	            }
	            
	            if(xf||yf) return false;
	            
	            list=list0;
	        }
	        
	        return false;
	        
	    }
	    
	}
}
