package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1047_Remove_All_Adjacent_Duplicates_In_String_67_15 {
	class Solution {
	    public String removeDuplicates(String S) {
	         List<Character> list = new ArrayList<>();
	        for(char c:S.toCharArray()) list.add(c);
	        for(int i=0; i<list.size()-1; i++)
	            if(list.get(i)==list.get(i+1)){
	                list.remove(i+1); list.remove(i); i=Math.max(-1, i-2);
	            }
	        StringBuilder sb = new StringBuilder();
	        for(char c:list) sb.append(c);
	        return sb.toString();
	    }
	}
}
