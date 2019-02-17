package com.github.extermania.leetcode;

public class $0021_Merge_Two_Sorted_Lists {
	class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1==null) return l2;
	        if(l2==null) return l1;
	        ListNode n1 = l1;
	        ListNode n2 = l2;
	        ListNode root;
	        if(n1.val<n2.val){
	            root = n1;
	            n1 = n1.next;
	        }else{
	            root = n2;
	            n2 = n2.next;
	        }
	        ListNode temp = root;
	        while(n1!=null || n2!=null){
	            if(n1==null){
	                temp.next=n2; return root;
	            }
	            if(n2==null){
	                temp.next=n1; return root;
	            }
	            if(n1.val<n2.val){
	                temp.next=new ListNode(n1.val);
	                n1 = n1.next;
	            }else{
	                 temp.next=new ListNode(n2.val);
	                n2 = n2.next;
	            }
	            temp = temp.next;
	        }
	        return root;
	    }
	}
}
