package com.github.extermania.leetcode;

public class $0083_Remove_Duplicates_from_Sorted_List_100 {
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        if(head == null) return null;
	        int cur = head.val;
	        ListNode node = head;
	        while(node!=null && node.next!=null){
	            while(node.next!=null && node.next.val == cur)
	                node.next=node.next.next;
	            node = node.next;
	            if(node!=null)cur = node.val;
	        }
	        return head;
	    }
	}
}
