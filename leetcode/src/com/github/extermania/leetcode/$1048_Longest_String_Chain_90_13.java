package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $1048_Longest_String_Chain_90_13 {
	class Solution {
	    boolean match(String s1, String s2){
			if(s1.startsWith(s2) || s1.endsWith(s2)) return true;
			for(int i=1; i<s2.length(); i++) 
				if(s1.startsWith(s2.substring(0, i)) && s1.endsWith(s2.substring(i))) return true;
			return false;
		}
	    public int longestStrChain(String[] words) {
	        if(words.length==0) return 0;
	        Map<Integer, Set<String>> map = new HashMap<>();
	        int lv = 0;
	        boolean[] arr = new boolean[17];
	        for(String w:words){
	            int len = w.length();
	            Set<String> set = map.get(len);
	            if(set==null){
	                set=new HashSet<>(); map.put(len, set);
	            }
	            set.add(w);
	            arr[len]=true;
	            lv = Math.max(lv, len);
	        }
	        
	        int max = 1;
	        for(int i=0; i<lv; i++){
	            int pmax = 0;
	            for(int h=i; h<17; h++){
	                if(arr[h]) pmax++;
	                else break;
	            }
	            if(pmax<=max) continue;
	            Set<String> set = map.get(i);
	            if(set==null) continue;
	            Set<String> cur = new HashSet<>(set);
	            int cnt=1;
	            int j=i+1;
	            Set<String> checked = new HashSet<>();
	            while(cur.size()>0){
	                //System.out.println(cur);
	                Set<String> cur0 = new HashSet<>();
	                Set<String> next = map.get(j);
	                if(next==null || next.size()==0) break;
	                for(String s1:cur){
	                    if(checked.contains(s1)) continue;
	                    else checked.add(s1);
	                    for(String s2:next){
	                        if(!cur0.contains(s2))
	                            if(match(s2, s1)) cur0.add(s2);
	                    }
	                }
	                if(cur0.size()>0) cnt++;
	                cur = cur0;
	                max = Math.max(max, cnt);
	                j++;
	            }
	        }
	        return max;
	        
	    }
	}
}
