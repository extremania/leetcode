package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0236_Lowest_Common_Ancestor_of_a_Binary_Tree_20_43 {
	static class Solution {
	    static class N extends TreeNode {
	        N parent;
	        N(int val){
	            super(val);
	        }
	        static N from(TreeNode t){
	            N n = new N(t.val);
	            n.left=t.left;
	            n.right=t.right;
	            return n;
	        }
	    }
	    
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
	        List<N> list = new ArrayList<>();
	        list.add(N.from(root));
	        
	        N p0=null;
	        N q0=null;
	        
	       while(list.size()>0){
	    
	            List<N> list0 = new ArrayList<>();
	            
	            for(N n:list){
	                if(n.val==p.val) p0=n;
	                else if(n.val==q.val) q0=n;
	                if(p0!=null && q0!=null) break;
	                if(n.left!=null){
	                    N left = N.from(n.left);
	                    left.parent=n;
	                    list0.add(left);
	                }
	                if(n.right!=null){
	                    N right =  N.from(n.right);
	                    right.parent=n;
	                    list0.add(right);
	                }
	            }
	            
	            list = list0;
	        }
	        
	        list = new ArrayList<>();
	        while(p0!=null){
	            list.add(p0);
	            p0=p0.parent;
	        }
	        while(q0!=null){
	            if(list.contains(q0)) return q0;
	            q0=q0.parent;
	        }
	        
	        return null;
	        
	    }
	}
}
