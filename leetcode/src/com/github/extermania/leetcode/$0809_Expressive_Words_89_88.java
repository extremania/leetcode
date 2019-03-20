package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0809_Expressive_Words_89_88 {
	class Solution {
	    class Node{
	        char c;
	        int len;
	        Node(char c){
	            this.c =c;
	        }
	        public String toString(){
	            return c+"_"+len;
	        }
	    }
	    List<Node> toList(String s){
	        char[] cs = s.toCharArray();
	        Node node = null;
	        int len = 0;
	        char cur = 0;
	        List<Node> list = new ArrayList<>();
	        for(int i=0; i<cs.length; i++){
	            if(cur!=cs[i]){
	                node = new Node(cs[i]);
	                list.add(node);
	                cur=cs[i];
	            }
	            node.len++;
	        }
	        return list;
	    }
	    boolean f(List<Node> sNode, List<Node> wNode){
	       // System.out.println("s:"+sNode);
	       // System.out.println("w:"+wNode);    
	        if(sNode.size()!=wNode.size()) return false;
	        int len = sNode.size();
	        for(int i=0; i<len; i++){
	            Node sn = sNode.get(i);
	            Node wn = wNode.get(i);
	           // System.out.println(sn+" vs "+wn);
	            if(sn.c!=wn.c) return false;
	            if(sn.len==wn.len) continue;
	            if(sn.len<wn.len) return false;
	            if(sn.len==2) return false;
	            if(sn.len>=3) continue;
	        }
	        return true;
	    }
	    public int expressiveWords(String S, String[] words) {
	        List<Node> sNode = toList(S);
	        
	        int cnt = 0;
	        for(String w:words)
	            if(f(sNode, toList(w))) {
	               //System.out.println(w);
	                cnt++;
	             }
	        
	        
	        return cnt;
	    }
	}
}
