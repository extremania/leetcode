package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $1054_Distant_Barcodes_5_06 {
	class Solution {
	    
	    class Node{
	        int val;
	        int cnt;
	        Node(int val){
	            this.val = val;
	        }
	        public boolean equals(Object obj){return this.val==((Node)obj).val;}
	        public int hashCode(){return this.val;}
	    }
	    
	    
	    public int[] rearrangeBarcodes(int[] barcodes){
	        
	        if(barcodes.length<=2) return barcodes;
	        int[] t = new int[10001];
	        for(int n:barcodes) t[n]++;
	        
	        List<Node> list = new ArrayList<>();
	        
	        for(int i=0; i<t.length; i++){
	            if(t[i]==0) continue;
	            Node node = new Node(i);
	            node.cnt = t[i];
	            list.add(node);
	        }
	        
	        Collections.sort(list, (a,b)->{
	            return a.cnt-b.cnt;
	        });

	        int[] arr = new int[barcodes.length];
	        Node last = null;
	        
	        for(int i=0; i<arr.length; i++){
	            Node node = list.get(list.size()-1);
	            if(last!=node){
	                arr[i]=node.val;
	                node.cnt--;
	            }else{
	                node = list.get(list.size()-2);
	                arr[i]=node.val;
	                node.cnt--;
	            }
	            last = node;
	            Collections.sort(list, (a,b)->{
	                return a.cnt-b.cnt;
	            });
	        }
	        
	        return arr;
	    }
	}
}
