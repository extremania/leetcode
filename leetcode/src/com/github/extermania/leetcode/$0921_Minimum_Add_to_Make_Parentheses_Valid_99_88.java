package com.github.extermania.leetcode;

public class $0921_Minimum_Add_to_Make_Parentheses_Valid_99_88 {
	class Solution {
	    public int minAddToMakeValid(String S) {
	        int[] stack = new int[S.length()];
	        int cur = 0;
	        for(int c:S.toCharArray()){
	            if(c=='('){
	                stack[cur++] = c; 
	            }else{
	                if(cur==0 || stack[cur-1]==')') stack[cur++] = c; 
	                else cur--;
	            }
	        }
	        return cur;
	    }
	}
}
