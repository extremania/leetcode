package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0804_Unique_Morse_Code_Words_100 {
	static
	 class Solution {
	    
	    private static String[] arr=new String[]{
	        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
	    };
	    
	    public int uniqueMorseRepresentations(String[] words) {
	        StringBuilder sb = new StringBuilder();
	        Set<String> set = new HashSet<>();
	        for(String word:words){
	            for(char c:word.toCharArray()){
	                sb.append(arr[c-'a']);
	            }
	            set.add(sb.toString());
	            sb = new StringBuilder();
	        }
	        return set.size();
	    }
	}
}
