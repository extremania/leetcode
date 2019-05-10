package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0368_Largest_Divisible_Subset_54_36 {
	class Solution {
	    
	    class Node{
	        int val;
	        List<Node> cren;
	        Node(int val){
	            this.val = val;
	            cren = new ArrayList<>();
	        }
	        void add(int n){
	            if(n%this.val==0){
	                boolean flag = false;
	                for(Node c:cren){
	                    if(n%c.val==0){
	                        flag = true;
	                        c.add(n);
	                    }
	                }
	                if(!flag)
	                cren.add(new Node(n));
	            }    
	        }
	    }
	    
	    List<Integer> f(Node node){
	        List<Integer> list = new ArrayList<>();
	        list.add(node.val);
	        List<Integer> clist = new ArrayList<>();
	        for(Node c:node.cren){
	            List<Integer> clist0 = f(c);
	            if(clist0.size()>clist.size())
	                clist = clist0;
	        }
	        list.addAll(clist);
	        return list;
	    }
	    
	    public List<Integer> largestDivisibleSubset(int[] nums) {
	        
	        Arrays.sort(nums);
	        
	        Node root = new Node(1);
	        
	        for(int n:nums)
	            root.add(n);
	        
	        List<Integer> list = f(root);
	        list.remove(0);
	        
	        return list;
	    }
	}
}
