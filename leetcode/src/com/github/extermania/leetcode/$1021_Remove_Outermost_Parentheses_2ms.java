package com.github.extermania.leetcode;

public class $1021_Remove_Outermost_Parentheses_2ms {
	class Solution {
	    
	    public String removeOuterParentheses(String S) {
	        boolean[] stack = new boolean[S.length()];
	        int cur=0;
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(char c:S.toCharArray()){
	            if(cur==0){
	                stack[cur++]=true;
	            }else{
	                if(c=='(')
	                    stack[cur++]=true;
	                else
	                    cur--;
	                if(cur>0)
	                    sb.append(c);
	            }
	        }
	        
	        return sb.toString();
	        
	    }
	}
}
