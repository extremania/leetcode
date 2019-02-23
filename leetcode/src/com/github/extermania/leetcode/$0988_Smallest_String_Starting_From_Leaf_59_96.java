package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0988_Smallest_String_Starting_From_Leaf_59_96 {
	class Solution {
	    public String smallestFromLeaf(TreeNode root) {
	        if(root==null) return "";
	        int min = 25;
	        List<TreeNode> minodes = new ArrayList<>();
	        List<TreeNode> cur = new ArrayList<>();
	        Map<TreeNode, TreeNode> pa = new HashMap<>();
	        cur.add(root);
	        while(cur.size()>0){
	            List<TreeNode> next = new ArrayList<>();
	            for(TreeNode node:cur){
	                if(node.left==null && node.right==null){
	                    if(node.val<min){
	                        minodes = new ArrayList<>();
	                        minodes.add(node);
	                        min=node.val;
	                    }else if(node.val==min){
	                        minodes.add(node);
	                    }
	                }else{
	                    if(node.left!=null){
	                        next.add(node.left);
	                        pa.put(node.left, node);
	                    }
	                    if(node.right!=null){
	                        next.add(node.right);
	                        pa.put(node.right, node);
	                    }
	                }
	            }
	            cur=next;
	        }
	        String[] arr = new String[minodes.size()];
	        int i=0;
	        for(TreeNode node:minodes){
	            arr[i++]=getStr(pa, node);
	        }
	        Arrays.sort(arr);
	        return arr[0];
	    }
	    String getStr(Map<TreeNode, TreeNode> pa, TreeNode node){
	        StringBuilder sb = new StringBuilder();
	        while(node!=null){
	            sb.append((char) ('a' + node.val));
	            node = pa.get(node);
	        }
	        return sb.toString();
	    }
	}
}
