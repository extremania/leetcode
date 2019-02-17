package com.github.extermania.leetcode;

public class $0237_Delete_Node_in_a_Linked_List_100 {
	class Solution {
	    public void deleteNode(ListNode node) {
	        ListNode curr = node;
	        ListNode next = curr.next;
	        curr.val = next.val; 
	        curr.next = next.next; 
	    }
	}
}
