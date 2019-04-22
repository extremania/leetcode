package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0437_Path_Sum_III_76_67 {
	class Solution {
	    int f(TreeNode n, int t){
	        if(n==null) return 0;
	          int cnt = 0;
	        if(t==n.val)  cnt++;
	      
	        if(n.left!=null) cnt+=f(n.left, t-n.val);
	        if(n.right!=null) cnt+=f(n.right, t-n.val);
	        return cnt;
	    }
	    public int pathSum(TreeNode root, int sum) {
	        if(root==null) return 0;
	        int cnt = 0;
	        
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            
	            for(TreeNode n:list){
	                cnt+=f(n, sum);
	                if(n.left!=null) list0.add(n.left);
	                if(n.right!=null) list0.add(n.right);
	            }
	            
	            list=list0;
	        }
	        
	        return cnt;
	        
	    }
	}
}
