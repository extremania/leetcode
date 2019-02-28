package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0508_Most_Frequent_Subtree_Sum_57_17 {
	static class Solution {
	    private static int sum(TreeNode node, Map<TreeNode, Integer> sums){
	        if(node==null) return 0;
	        Integer value = sums.get(node);
	        if(value!=null) return value;
	        value = node.val+sum(node.right, sums)+sum(node.left, sums);
	        sums.put(node, value);
	        return value;
	    }
	    
	    private static void freq(TreeNode node, Map<Integer, Integer> freq, Map<TreeNode, Integer> sums){
	        if(node==null) return;
	        int sum = sum(node, sums);
	        Integer cnt = freq.get(sum);
	        if(cnt==null){
	            cnt = 1;
	        }else{
	            cnt = cnt+1;
	        }
	        freq.put(sum, cnt);
	        freq(node.left, freq, sums);
	        freq(node.right, freq, sums);
	    }
	    
	    public int[] findFrequentTreeSum(TreeNode root) {
	        if(root==null) return new int[]{};
	        if(root.right==null && root.left==null){
	            return new int[]{root.val};
	        }
	        
	        
	     Map<TreeNode, Integer> sums = new HashMap<>();
	     Map<Integer, Integer> freq = new HashMap<>();
	        
	        freq(root, freq, sums);
	        int max = 0;
	        for(Map.Entry<Integer, Integer> entry:freq.entrySet()){
	            max = Math.max(max, entry.getValue());
	        }
	        List<Integer> result = new ArrayList<>();
	        for(Map.Entry<Integer, Integer> entry:freq.entrySet()){
	           if(entry.getValue()==max){
	               result.add(entry.getKey());
	           }
	        }
	        int[] r = new int[result.size()];
	        int ii=0;
	        for(Integer i:result){
	            r[ii++]=i;
	        }
	        return r;
	    }
	}
}
