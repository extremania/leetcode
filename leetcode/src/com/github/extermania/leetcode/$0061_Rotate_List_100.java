package com.github.extermania.leetcode;

public class $0061_Rotate_List_100 {
	class Solution {
	    
	    ListNode rotate(ListNode head){
	        ListNode last = null;
	        ListNode last2 = null;
	        ListNode n = head;
	        while(n.next!=null){
	            last2 = n;
	            n = n.next; 
	        }
	        last = n;
	        last.next = head;
	        last2.next = null;
	        return last;
	    }
	    
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head==null) return null;
	        int len = 1;
	        ListNode n = head; 
	        while(n.next!=null){
	            n = n.next;
	            len++;
	        }
	        if(len==1) return head;
	        int k0=k%len;
	        ListNode rst = head;
	        for(int i=0; i<k0; i++){
	            rst = rotate(rst);
	        }
	        return rst;
	    }
	}
}
