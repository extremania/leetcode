package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class $0148_Sort_List_13_41 {
	class Solution {
	    public ListNode sortList(ListNode head) {
	        Map<Integer, ListNode> map = new TreeMap<>();
	        Map<Integer, Integer> cntmap = new HashMap<>();
	        ListNode node = head;
	        while(node!=null){
	            map.put(node.val, node);

	            Integer cnt = cntmap.get(node.val);
	            if(cnt==null) cntmap.put(node.val, 1);
	            else cntmap.put(node.val, cnt+1);
	            
	            node=node.next;
	        }
	        ListNode last = null;
	        ListNode h = null;
	        for(Map.Entry<Integer, ListNode> entry:map.entrySet()){
	            //System.out.println(entry.getKey());
	            node = entry.getValue();
	            int key = entry.getKey();
	            int cnt = cntmap.get(key);

	            for(int i=0; i<cnt; i++){
	                ListNode n = new ListNode(node.val);
	                if(last!=null) last.next=n;
	                if(h==null) h = n;
	                last = n;
	            }
	        }
	        if(last!=null) last.next=null;
	        return h;
	    }
	}
}
