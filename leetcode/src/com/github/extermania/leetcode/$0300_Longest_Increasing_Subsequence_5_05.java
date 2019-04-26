package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0300_Longest_Increasing_Subsequence_5_05 {
	class Solution {
	    class Node {
	        int val;
	        List<Node> cren;
	        Node(int val){
	            this.val = val;
	            cren = new ArrayList<>();
	        }
	        public String toString(){
	            return this.val+"";
	        }
	    }
	    
	    boolean isSorted(int[] arr) {
	        for(int i=1; i<arr.length; i++)
	            if(arr[i]<=arr[i-1]) return false;
	        return true;
	    }
	    
	    public int lengthOfLIS(int[] nums) {
	        if(isSorted(nums)) return nums.length;
	        Node root = new Node(Integer.MIN_VALUE);
	        for(int i=0; i<nums.length; i++)
	             insert(root, nums[i]);
	        int max = -1;
	        List<Node> list = new ArrayList<>();
	        list.add(root);
	        
	        while(list.size()>0){
	            //System.out.println(list);
	            List<Node> list0 = new ArrayList<>();
	            for(Node n:list)
	                list0.addAll(n.cren);
	            list=list0;
	            max++;
	        }
	        
	        return max;
	    }
	    
	    void insert(Node root, int c){
	        for(Node n:root.cren){
	            if(n.val>=c) continue;
	            insert(n, c);
	        }
	        root.cren.add(new Node(c));
	    }
	}
}
