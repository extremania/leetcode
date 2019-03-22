package com.github.extermania.leetcode;

public class $0024_Swap_Nodes_in_Pairs_99_97 {
	class Solution {
	    public ListNode swapPairs(ListNode head) {
	        if(head==null) return null;
	        if(head.next==null) return head;
	        ListNode node = head;
	        head = head.next;
	        ListNode n0 = null;
	        while(node!=null && node.next!=null){
	            ListNode temp2 = node.next.next;
	            ListNode temp1 = node.next;
	            if(n0!=null) n0.next=temp1;
	            temp1.next=node;
	            node.next=temp2;
	            n0 = node;
	            node=temp2;
	        }
	        return head;
	    }
	}
}
