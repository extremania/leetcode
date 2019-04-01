package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1019_Next_Greater_Node_In_Linked_List_8_62 {
	class Solution {
	    public int[] nextLargerNodes(ListNode head) {
	        List<Integer> list = new ArrayList<>();
	        ListNode n1 = head;
	        while(n1!=null){
	            int cur = n1.val;
	           // System.out.println(cur);
	            ListNode n2=n1.next;
	            if(n2==null){
	                list.add(0);
	            }else{
	            while(n2!=null){
	                if(n2.val>cur){
	                    list.add(n2.val); break;
	                }
	                n2 = n2.next;
	                if(n2==null) list.add(0);
	            }
	            }
	            n1 = n1.next;
	        }
	        int[] arr = new int[list.size()];
	        for(int i=0; i<list.size(); i++) arr[i]=list.get(i);
	        return arr;
	    }
	}
}
