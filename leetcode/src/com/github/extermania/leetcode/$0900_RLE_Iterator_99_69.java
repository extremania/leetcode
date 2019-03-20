package com.github.extermania.leetcode;

public class $0900_RLE_Iterator_99_69 {
	class RLEIterator {
	    
	    class Node{
	        int cnt;
	        int val;
	        Node(int cnt, int val){
	            this.cnt=cnt;
	            this.val=val;
	        }
	        Node next;
	    }
	    
	    Node cur;

	    public RLEIterator(int[] A) {
	        if(A.length==0) return;
	        cur = new Node(A[0], A[1]);
	        Node n = cur;
	        for(int i=2; i<A.length; i+=2){
	            Node neu = new Node(A[i], A[i+1]);
	            n.next=neu;
	            n=neu;
	        }
	    }
	    
	    public int next(int n) {
	        if(cur==null) return -1;
	        int n0 = n;
	        while(cur!=null && n0>cur.cnt){
	            n0-=cur.cnt;
	            cur=cur.next;
	        }
	        if(cur==null) return -1;
	        cur.cnt-=n0;
	        //if(cur.cnt==0) cur=cur.next;
	        //if(cur==null) return -1;
	        return cur.val;
	    }
	}
}
