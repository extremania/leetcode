package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0501_Find_Mode_in_Binary_Search_Tree_35_58 {
	class Solution {
	    public int[] findMode(TreeNode root) {
	        if(root==null) return new int[0];
	        Map<Integer, Integer> map = new HashMap<>();
	        int max = 0;
	        List<TreeNode> list = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<TreeNode> list0 = new ArrayList<>();
	            for(TreeNode node:list){
	                Integer n = map.get(node.val);
	                if(n==null){
	                    n = 0;
	                }
	                n++;
	                max=Math.max(max, n);
	                map.put(node.val, n);
	                if(node.left!=null) list0.add(node.left);
	                if(node.right!=null) list0.add(node.right);
	            }
	            list=list0;
	        }
	        List<Integer> rst = new ArrayList<>();
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	            Integer key = entry.getKey();
	            Integer n = entry.getValue();
	            if(n==max){
	                rst.add(key);
	            }
	        }
	        
	        int[] arr = new int[rst.size()];
	        for(int i=0; i<rst.size(); i++){
	            arr[i]=rst.get(i);
	        }
	        return arr;
	    }
	}
}
