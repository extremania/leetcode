package com.github.extermania.leetcode;

public class $0002_Add_Two_Numbers_67_88 {
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode n1 = l1;
	        ListNode n2 = l2;
	        boolean ex = false;
	        ListNode root = null;
	        ListNode node = null;
	        while(n1!=null && n2!=null){
	            int val = n1.val+n2.val+(ex?1:0);
	            if(val>=10){
	                val = val-10;
	                ex=true;
	            }else{
	                ex=false;
	            }
	            if(root==null){
	                root = new ListNode(val);
	                node = root;
	            }else{
	                node.next=new ListNode(val);
	                node=node.next;
	            }
	           
	            n1=n1.next;
	            n2=n2.next;
	        }
	        while(n1!=null){
	            int val = n1.val+(ex?1:0);
	            if(val>=10){
	                val = val-10;
	                ex=true;
	            }else{
	                ex=false;
	            }
	            if(root==null){
	                root = new ListNode(val);
	                node = root;
	            }else{
	                node.next=new ListNode(val);
	                node=node.next;
	            }
	            
	            n1=n1.next;
	        }
	        while(n2!=null){
	            int val = n2.val+(ex?1:0);
	            if(val>=10){
	                val = val-10;
	                ex=true;
	            }else{
	                ex=false;
	            }
	            if(root==null){
	                root = new ListNode(val);
	                node = root;
	            }else{
	                node.next=new ListNode(val);
	                node=node.next;
	            }
	            
	            n2=n2.next;
	        }
	        if(ex) node.next = new ListNode(1);
	        return root;
	    }
	}
}
