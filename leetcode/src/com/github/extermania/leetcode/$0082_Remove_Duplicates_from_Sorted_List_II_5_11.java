package com.github.extermania.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class $0082_Remove_Duplicates_from_Sorted_List_II_5_11 {
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        if(head==null) return head;
	        Map<Integer, Integer> map = new LinkedHashMap<>();
	        ListNode node = head;
	        while(node!=null){
	            Integer cnt = map.get(node.val);
	            if(cnt==null){
	                map.put(node.val, 1);
	            }else{
	                map.put(node.val, cnt+1);
	            }
	            node = node.next;
	        }
	        ListNode dummy = new ListNode(0);
	         ListNode node0 = dummy;
	        for(Map.Entry<Integer, Integer> e:map.entrySet()){
	            if(e.getValue()==1){
	                    node0.next = new ListNode(e.getKey());
	                    node0 = node0.next;
	                }
	        }
	        return dummy.next;
	    }
	}
}
