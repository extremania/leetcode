package com.github.extermania.leetcode;

public class $0876_Middle_of_the_Linked_List_84_24 {
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        if(head==null || head.next==null) return head;
	        int len=1;
	        ListNode node=head;
	        while(node.next!=null){
	            len++;
	            node=node.next;
	        }
	        node = head;
	        for(int i=0; i<len/2; i++){
	            node = node.next;
	        }
	        return node;
	    }
	}
}
