package com.github.extermania.leetcode;

public class $0014_Longest_Common_Prefix_9_25 {
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0){
	            return "";
	        }
	        String first = strs[0];
	        StringBuffer sb=new StringBuffer();
	        char[] cs = first.toCharArray();
	        for(int i=0; i<cs.length; i++){
	            char c = cs[i];
	            for(int s=1; s<strs.length; s++){
	                String str = strs[s];
	                if(str.length()<i+1 || str.charAt(i)!=c){
	                    return sb.toString();
	                }
	            }
	            sb.append(c);
	        }
	        return sb.toString();
	    }
	}
}
