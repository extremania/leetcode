package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0752_Open_the_Lock_59_35 {
	class Solution {
	    public int openLock(String[] deadends, String target) {
	       // Set<String> set = new HashSet<>(deadends.length);
	        Set<String> added = new HashSet<>();
	        for(String d:deadends) added.add(d);
	        if(added.contains("0000")) return -1;
	        
	        Set<String> cur = new HashSet<>();
	        cur.add("0000");
	        added.add("0000");
	        
	        int cnt = 0;
	        
	        while(cur.size()>0){
	            
	            Set<String> cur0 = new HashSet<>();
	            for(String c:cur){
	                if(c.equals(target)) {
	                    return cnt;
	                }
	                cur0.addAll(next(c, added, target));
	            }
	            
	            cnt++;
	            
	            cur=cur0;
	            
	        }

	        return -1;
	        
	    }
	    
	    Set<String> next(String c, Set<String> added, String target){
	        Set<String> set = new HashSet<>();
	        for(int i=0; i<4; i++){
	            char[] cs = c.toCharArray();
	            char ci = cs[i];
	            char a;
	            char b;
	            if(ci=='0'){
	                a='1'; b='9';
	            }else if(ci=='9'){
	                a='0'; b='8';
	            }else{
	                a=(char)(ci+1); 
	                b=(char)(ci-1);
	            }
	            cs[i]=a; 
	            String astr = new String(cs);
	            cs[i]=b;
	            String bstr = new String(cs);
	            if(astr.equals(target)){
	                set.clear(); set.add(astr); return set;
	            }
	            if(bstr.equals(target)){
	                set.clear(); set.add(bstr); return set;
	            }
	            if(!added.contains(astr)){
	                added.add(astr);
	                set.add(astr);
	            }
	            if(!added.contains(bstr)){
	                added.add(bstr);
	                set.add(bstr);
	            }
	        }
	        return set;
	    }
	}
}
