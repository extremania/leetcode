package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0950_Reveal_Cards_In_Increasing_Order_99_83 {
	class Solution {
	    
	    class Node {
	        int val;
	        Node next;
	        Node prev;
	        Node(int val){
	            this.val = val;
	        }
	    }
	    
	    public int[] deckRevealedIncreasing(int[] deck) {
	        if(deck.length==1) return deck;
	        Arrays.sort(deck);
	        if(deck.length==2) return new int[]{deck[0], deck[1]};
	        
	        Node node1 = new Node(deck[deck.length-1]);
	        Node node2 = new Node(deck[deck.length-2]);
	        node2.next=node1;
	        node1.prev=node2;
	        
	        Node head = node2;
	        Node tail = node1;
	        
	        for(int i=deck.length-3; i>=0; i--){
	            Node neu = new Node(deck[i]);
	            Node temp = tail.prev;
	            tail.prev.next=null;
	            tail.prev=neu;
	            tail.next=head;
	            head.prev=tail;
	            neu.next=tail;
	            head = neu;
	            tail = temp;
	        }
	        
	        int[] arr = new int[deck.length];
	        for(int i=0; i<deck.length; i++){
	            arr[i] = head.val;
	            head = head.next;
	        }
	        
	        return arr;
	    }
	}
}
