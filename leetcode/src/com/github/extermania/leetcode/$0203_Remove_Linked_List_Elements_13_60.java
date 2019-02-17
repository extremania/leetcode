package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0203_Remove_Linked_List_Elements_13_60 {
	class Solution {
	    public ListNode removeElements(ListNode head, int val) {
	        if(head==null){
	            return null;
	        }
	        
	        List<Integer> list = new ArrayList<>();
	        ListNode n = head;
	        while(n!=null){
	            list.add(n.val);
	            n=n.next;
	        }
	        
	        ListNode root = null;
	        ListNode rst = null;
	        
	        for(int i:list){
	            if(i!=val){
	                if(root==null) {
	                    root=new ListNode(i);
	                    rst = root;
	                }
	                else {
	                    root.next=new ListNode(i);
	                    root = root.next;
	                }
	            }
	        }
	        
	        return rst;
	    }
	}
}
