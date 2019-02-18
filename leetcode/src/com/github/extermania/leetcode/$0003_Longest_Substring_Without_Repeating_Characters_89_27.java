package com.github.extermania.leetcode;

public class $0003_Longest_Substring_Without_Repeating_Characters_89_27 {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        if(s.length()==0) return 0;
	        boolean[] arr = new boolean[256];
	        char[] cs = s.toCharArray();
	        int max = 0;
	        for(int i=0; i<cs.length; i++){
	            for(int j=i; j<cs.length; j++){
	               //System.out.println(j+":"+arr[cs[j]]);
	               if(!arr[cs[j]]){
	                   arr[cs[j]]=true;
	               }else{
	                   //System.out.println(i+" "+j+" "+max);
	                   arr = new boolean[256];
	                   max = Math.max(j-i, max);
	                   break;
	               }
	               if(j==cs.length-1) max = Math.max(j-i+1, max);
	            }
	            if(cs.length-i<=max) break;
	        }
	        return max;
	    }
	}
}
