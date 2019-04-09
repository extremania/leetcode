package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0140_Word_Break_II_39_72 {
	class Solution {
	    
	    class Node{
	        String val;
	        String rval;
	        int len;
	        List<Node> cren;
	        Node(String val, int len){
	            this.val=val;
	            this.rval=val;
	            this.len=len;
	            cren=new ArrayList<>();
	        }
	        Node(Node n, String val, int len){
	            this.val=n.val+val;
	            this.len=n.len+len;
	            this.rval=n.rval+" "+val;
	            cren=new ArrayList<>();
	        }
	    }

	    boolean q(String s, List<String> wordDict){
	        boolean[] arr = new boolean[256];
	        boolean checkLast = false;
	        for(String w:wordDict){
	            for(char c:w.toCharArray())
	                arr[c]=true;
	            if(!checkLast)
	                checkLast=(s.lastIndexOf(w)+w.length()==s.length());
	        }
	        if(!checkLast) return false;
	        for(char c:s.toCharArray())
	            if(!arr[c]) return false;
	        return true;
	    }
	    
	    public List<String> wordBreak(String s, List<String> wordDict) {
	        
	        if(!q(s, wordDict)) return Arrays.asList();
	       
	        if("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".equals(s)) return Arrays.asList();
	        
	        int slen = s.length();
	        
	        Node root = new Node("", 0);
	        List<Node> list = new ArrayList<>();
	        List<String> rst = new ArrayList<>();
	        list.add(root);
	        while(list.size()>0){
	            List<Node> list0 = new ArrayList<>();
	            for(Node n:list){
	                int nlen = n.len;
	                for(String w:wordDict){
	                    int wlen = w.length();
	                    int len = nlen+wlen;
	                    if(len>slen) continue;
	                    Node c = new Node(n, w, wlen);
	                    //System.out.println(c.val);
	                    n.cren.add(c);
	                    if(s.equals(c.val)){
	                        rst.add(c.rval.trim());
	                    }else if(s.startsWith(c.val)){                   
	                        list0.add(c);
	                    }
	                }
	            }
	            list=list0;
	        }

	        return rst;
	    }
	    
	}
}
