package com.github.extermania.leetcode;

public class $0387_First_Unique_Character_in_a_String_95_49 {
	class Solution {
	    public int firstUniqChar(String s) {
	        if(s.length()==0) return -1;
	        int[] arr = new int[256];
	        for(char c:s.toCharArray()) arr[c]++;
	        for(int i=0; i<s.length();i++){
	            if(arr[s.charAt(i)]==1) return i;
	        }
	        return -1;
	    }
	}
}
