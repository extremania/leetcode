package com.github.extermania.leetcode;

public class $0806_Number_of_Lines_To_Write_String_100 {
	class Solution {
	    public int[] numberOfLines(int[] widths, String S) {
	        int line = 1;
	        int cur = 0;
	        char[] cs = S.toCharArray();
	        for(char c:cs){
	            int w = widths[c-'a'];
	            if(cur+w>100){
	                line++;
	                cur=w;
	            }else{
	                cur+=w;
	            }
	        }
	        return new int[]{line, cur};
	    }
	}
}
