package com.github.extermania.leetcode;

public class $0434_Number_of_Segments_in_a_String_100 {
	class Solution {
	    public int countSegments(String s) {
	        if(s==null || s.length()==0) return 0;
	        String[] strs = s.split(" ");
	        int cnt=0;
	        for(String str:strs){
	            if(str.length()>0) cnt++;
	        }
	        return cnt;
	    }
	}
}
