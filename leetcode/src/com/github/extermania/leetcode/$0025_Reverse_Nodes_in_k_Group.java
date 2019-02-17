package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0025_Reverse_Nodes_in_k_Group {
	class Solution {
	    public ListNode reverseKGroup(ListNode head, int k) {
	        if(head==null) return null;
	        if(k==1) return head;
	        
	        Map<Integer, ListNode> all = new HashMap<>();
	        int i=1;
	        int size=1;
	        all.put(i, head);
	        ListNode node = head;
	        while(node.next!=null){
	            node = node.next;
	            all.put(++i, node);
	            size++;
	        }
	        
	        if(size<k) return head;
	        
	        ListNode root = null;
	        for(Map.Entry<Integer, ListNode> entry:all.entrySet()){
	            Integer key=entry.getKey();
	            ListNode value=entry.getValue();
	            //System.out.println(key+"->"+value.val);
	            if(key==k){
	                root = value;
	                value.next=all.get(k-1);
	            }else if(size%k+key>size){
	                continue;
	            }else if(key%k==1){
	                if(key+2*k-1>size){
	                    value.next=all.get(key+k);
	                }else{
	                    value.next=all.get(key+2*k-1);
	                }
	            }else{
	                value.next=all.get(key-1);
	            }
	        }
	        
	        
	        return root;
	    }
	}
}
