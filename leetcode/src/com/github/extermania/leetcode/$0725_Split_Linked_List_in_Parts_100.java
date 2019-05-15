package com.github.extermania.leetcode;

public class $0725_Split_Linked_List_in_Parts_100 {
	class Solution {
	    public ListNode[] splitListToParts(ListNode root, int k) {
	        int size=0;
	        ListNode n = root;
	        while(n!=null){
	            n = n.next;
	            size++;
	        }
	        
	      
	        
	        int r = size%k;
	        int d = size/k;
	        
	        
	        ListNode[] arr = new ListNode[k];
	        
	        n = root;
	        ListNode pre=null;
	        for(int i=0; i<k; i++){
	            arr[i]=n;
	            if(i<r){
	                for(int j=0; j<=d; j++){
	                    pre=n;
	                    if(n!=null) n=n.next;
	                }
	            }else{
	                 for(int j=0; j<d; j++){
	                    pre=n; 
	                    if(n!=null) n=n.next;
	                } 
	            }
	            if(pre!=null) pre.next=null;
	        }
	        
	        return arr;
	        
	    }
	}
}
