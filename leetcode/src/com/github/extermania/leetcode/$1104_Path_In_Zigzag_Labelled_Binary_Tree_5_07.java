package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class $1104_Path_In_Zigzag_Labelled_Binary_Tree_5_07 {
	class Solution {
	    class Node{
	        Node parent;
	        int val;
	        Node(int val){
	            this.val = val;
	        }
	    }
	    
	    public List<Integer> pathInZigZagTree(int label) {
	        if(label<=1) return Arrays.asList(label);
	        List<Node> list0 = new ArrayList<>();
	        Node root = new Node(1);
	        list0.add(root); list0.add(root);
	        Iterator<Node> it = list0.iterator();
	        Node last = null;
	        list0 = new ArrayList<>();
	        for(int i=2; i<=label; i++){
	            last = new Node(i);
	            if(it.hasNext()){
	                Node next = it.next();
	                //System.out.println(i+" "+next.val);
	                last.parent = next;
	                list0.add(last); list0.add(last);
	            }else{
	                //System.out.println(i+" xxx");
	                i--;
	                Collections.reverse(list0);
	                it = list0.iterator();
	                list0 = new ArrayList<>();
	            }
	        }
	        List<Integer> r = new ArrayList<>();
	        r.add(last.val);
	        while(last.parent!=null){
	            last = last.parent;
	            r.add(last.val);
	        }
	        Collections.reverse(r);
	        return r;
	    }
	}
}
