package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0019_Remove_Nth_Node_From_End_of_List {
	class Solution {
	    
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null) return head;
	        List<ListNode> list = new ArrayList<>();
	        list.add(head);
	        ListNode node = head.next;
	        while(node!=null){
	            list.add(node);
	            node = node.next;
	        }
	        int idx = list.size()-n;
	        list.remove(idx);
	        if(idx>0 && idx<list.size()){
	            list.get(idx-1).next=list.get(idx);
	        }
	        if(list.size()==0) return null;
	        list.get(list.size()-1).next=null;
	        return list.get(0);
	    }
	}
}
