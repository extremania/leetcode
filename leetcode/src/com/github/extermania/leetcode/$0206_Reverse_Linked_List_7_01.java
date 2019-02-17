package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0206_Reverse_Linked_List_7_01 {
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        if(head==null) return null;
	        List<ListNode> list = new ArrayList<>();
	        ListNode p = head;
	        while(p!=null){
	            list.add(p);
	            p = p.next;
	        }
	        Collections.reverse(list);
	        for(int i=0; i<list.size()-1; i++){
	            list.get(i).next = list.get(i+1);
	        }
	        list.get(list.size()-1).next=null;
	        return list.get(0);
	    }
	}
}
