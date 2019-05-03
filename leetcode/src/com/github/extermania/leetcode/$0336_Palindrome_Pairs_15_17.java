package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0336_Palindrome_Pairs_15_17 {
	class Solution {
	    public List<List<Integer>> palindromePairs(String[] words) {
	        List<List<Integer>> list = new ArrayList<>();
	        for(int i=0; i<words.length; i++)
	            for(int j=0; j<words.length; j++)
	                if(i==j) continue;
	                else if(isPalin(words[i], words[j])) list.add(Arrays.asList(i, j));
	        return list;
	    }
	    boolean isPalin(String a, String b){
	        int min = Math.min(a.length(), b.length());
	        for(int i=0; i<min; i++)
	             if(a.charAt(i)!=b.charAt(b.length()-i-1)) return false;
	        String c = a+b;
	        return new StringBuilder(c).reverse().toString().equals(c);
	    }
	  
	}
}
