package com.github.extermania.leetcode;

public class $0023_Merge_k_Sorted_Lists_7_08 {
	class Solution {
	    public ListNode mergeKLists(ListNode[] lists) {
	        ListNode node = null;
	        ListNode root = null;
	        while(true){
	            int min = Integer.MAX_VALUE;
	            int mindx = -1;
	            for(int i=0; i<lists.length; i++){
	                ListNode n = lists[i];
	                if(n==null) continue;
	                if(n.val<min){
	                    min=n.val;
	                    mindx=i;
	                }
	            }
	            if(mindx>=0){
	                    if(node==null){
	                        node = new ListNode(min);
	                        root = node;
	                    }else{
	                        node.next = new ListNode(min);
	                        node = node.next;
	                    }
	                    lists[mindx]=lists[mindx].next;
	                }else{
	                    return root;
	            }
	        }
	    }
	    
	}
}
