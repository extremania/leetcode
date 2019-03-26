package com.github.extermania.leetcode;

public class $0071_Simplify_Path_100 {
	class Solution {
	    public String simplifyPath(String path) {
	        String[] strs = path.split("/");
	        String[] stack = new String[strs.length];
	        int cur = 0;
	        for(String str:strs){
	            switch(str){
	                case "..": cur=Math.max(cur-1, 0); break;
	                case ".": case "": break;
	                default: stack[cur]=str; cur++; break;
	            }
	        }
	        StringBuilder sb = new StringBuilder("/");
	        for(int i=0; i<cur; i++)
	            sb.append(stack[i]).append("/");
	        String s = sb.toString().substring(0, sb.length()-1);
	        return s.length()==0?"/":s;
	    }
	}
}
