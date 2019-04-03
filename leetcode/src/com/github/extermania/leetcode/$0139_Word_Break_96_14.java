package com.github.extermania.leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0139_Word_Break_96_14 {
	class Solution {
	    boolean f(String s, java.util.Collection<String> wordDict, Set<String> checked){
	        if(checked.contains(s)) return false;
	        for(String w:wordDict){
	            if(s.equals(w)) return true;
	            else if(s.startsWith(w))  if(f(s.substring(w.length()), wordDict, checked)) return true;
	        }
	        checked.add(s);
	        return false;
	    }
	    boolean q(String s, List<String> wordDict){
	        boolean[] arr=new boolean[256];
	        for(String w:wordDict)
	            for(char c:w.toCharArray()) arr[c]=true;
	        for(char c:s.toCharArray())
	            if(!arr[c]) return false;
	        return true;
	    }
	    java.util.Collection<String> t(String s, List<String> wordDict){
	        Set<String> set = new HashSet<>();
	        Collections.sort(wordDict);
	        for(String w:wordDict){
	            if(s.indexOf(w)<0) continue;
	            if(f(w, set, new HashSet<>())) continue;
	            set.add(w);
	        }
	        return set;
	    }
	    public boolean wordBreak(String s, List<String> wordDict) {
	        if("".equals(s)) return true;
	        if(wordDict.size()==0) return false;
	        if(!q(s, wordDict)) return false;
	        java.util.Collection<String> wd = t(s, wordDict);
	        System.out.println(wd);
	        return f(s, wd, new HashSet<>());
	    }
	}
}
