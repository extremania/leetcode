package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $1032_Stream_of_Characters_13_45 {
	class StreamChecker {
	    
	    StringBuilder sb;
	    Map<Integer, Map<Integer, Set<String>>> dict;
	   // int min = 100000;
	    //int max = -1;
	    Set<Integer> last;

	    public StreamChecker(String[] words) {
	        sb=new StringBuilder();
	        last = new HashSet<>();
	        dict = new HashMap<>();
	        for(String w:words){
	            int len = w.length();
	            int c = w.charAt(w.length()-1)-'a';
	            Map<Integer, Set<String>> dd = dict.get(len);
	            last.add(c);
	            if(dd==null){
	                dd = new HashMap<>();
	                dict.put(len, dd);
	               // min = Math.min(len, min);
	               // max = Math.max(len, max);
	            }
	            Set<String> d = dd.get(c);
	            if(d==null){
	                d = new HashSet<>();
	                dd.put(c, d);
	            }
	            d.add(w);
	        }
	    }
	    
	    public boolean query(char letter) {
	        sb.append(letter);
	        int c = letter - 'a';
	        if(!last.contains(c)) return false;
	        //if(sb.length()<min) return false;
	        //if(sb.length()>max) sb.deleteCharAt(0);
	        for(Map.Entry<Integer, Map<Integer, Set<String>>> entry:dict.entrySet()){
	            Integer len = entry.getKey();
	            if(len>sb.length()) return false;
	            Map<Integer, Set<String>> dd = entry.getValue();
	            Set<String> d = dd.get(c);
	            if(d==null) continue;
	            boolean b = d.contains(sb.substring(sb.length()-len));
	            if(b) return true;
	        }
	        return false;
	    }
	}

}
