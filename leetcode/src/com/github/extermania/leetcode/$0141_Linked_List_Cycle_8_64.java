package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0141_Linked_List_Cycle_8_64 {
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	        Set<ListNode> set = new HashSet<>();
	        while(head!=null){
	            if(set.contains(head)) return true;
	            set.add(head);
	            head=head.next;
	        }
	        return false;
	    }
	}
}
