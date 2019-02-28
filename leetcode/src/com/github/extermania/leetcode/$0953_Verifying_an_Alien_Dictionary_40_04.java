package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0953_Verifying_an_Alien_Dictionary_40_04 {
	class Solution {
	    String convert(String str, int[] map){
	        StringBuilder sb = new StringBuilder();
	        for(char c:str.toCharArray())sb.append(map[c-'a']);
	        return sb.toString();
	    }
	    public boolean isAlienSorted(String[] words, String order) {
	        int[] map=new int[26];
	        int i=100;
	        for(char c:order.toCharArray()) map[c-'a']=(i++);
	        String[] words1 = new String[words.length];
	        String[] words2 = new String[words.length];
	        i = 0;
	        for(String word:words){
	            String con = convert(word, map);
	            words1[i] = con;
	            words2[i] = con;
	            i++;
	        }
	        Arrays.sort(words2);
	        
	        for(int k=0; k<words.length; k++){
	            if(!words1[k].equals(words2[k])) return false;
	        }
	        
	        return true;
	    }
	}
}
