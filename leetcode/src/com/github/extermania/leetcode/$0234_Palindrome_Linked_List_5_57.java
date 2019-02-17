package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0234_Palindrome_Linked_List_5_57 {
	class Solution {
	    public boolean isPalindrome(ListNode head) {
	        List<Integer> list = new ArrayList<>();
	        ListNode node = head;
	        while(node!=null){
	            list.add(node.val);
	            node = node.next;
	        }
	        System.out.println(list);
	        for(int i=0; i<list.size()/2; i++){
	            if(!list.get(i).equals(list.get(list.size()-1-i))) return false;
	        }
	        return true;
	    }
	}
}
