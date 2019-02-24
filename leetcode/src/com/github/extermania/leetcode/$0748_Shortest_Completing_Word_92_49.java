package com.github.extermania.leetcode;

public class $0748_Shortest_Completing_Word_92_49 {
	class Solution {
	    public String shortestCompletingWord(String licensePlate, String[] words) {
	        char[] cs = licensePlate.toLowerCase().toCharArray();
	        int len = 16;
	        String word = "";
	        for(String w:words){
	            if(w.length()>=len) continue;
	            int[] arr = new int[26];
	            for(char c:w.toCharArray()){
	                arr[c-'a']++;
	            }
	            boolean y = true;
	            for(char c:cs){
	                if(c>='a' && c<='z')
	                if(--arr[c-'a']<0){
	                    y = false;
	                    break;
	                }
	            }
	            if(y){ word=w;
	                  len = word.length();
	                 }
	        }
	        return word;
	    }
	}
}
