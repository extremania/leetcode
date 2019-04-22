package com.github.extermania.leetcode;

public class $0445_Add_Two_Numbers_II_74_92 {
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1==null && l2==null) return null;
	        String a = "";
	        String b = "";
	        ListNode cur = l1;
	        while(cur!=null){
	            a = a+cur.val;
	            cur = cur.next;
	        }
	        cur = l2;
	        while(cur!=null){
	            b = b+cur.val;
	            cur = cur.next;
	        }
	       java.math.BigDecimal c = new java.math.BigDecimal(a).add(new java.math.BigDecimal(b));
	        char[] cs = c.toString().toCharArray();
	        ListNode root = new ListNode(cs[0]-'0');
	        cur = root;
	        for(int i=1; i<cs.length; i++){
	            ListNode node = new ListNode(cs[i]-'0');
	            cur.next=node;
	            cur = node;
	        }
	        return root;
	    }
	}
}
