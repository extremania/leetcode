package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0020_Valid_Parentheses_48_83 {
	static class Solution {
	    private static class Stack{
	        List<Integer> list = new ArrayList<>();
	        int cur=0;
	        Stack(){}
	        void push(int i){
	            if(list.size()<=cur){
	                list.add(i);
	                cur++;
	            }else{
	                list.set(cur++, i);
	            }
	        }
	        Integer pull(){
	            if(cur==0){
	                return -1;
	            }
	            return list.get(--cur);
	        }
	    }
	    
	    public boolean isValid(String s) {
	        if(s.length()==0) return true;
	        Stack stack = new Stack();
	        for(char c:s.toCharArray()){
	            if(c=='(' || c=='[' || c=='{') stack.push(c);
	            else if(c==')' && stack.pull()!='(') return false;
	            else if(c==']' && stack.pull()!='[') return false;
	            else if(c=='}' && stack.pull()!='{') return false;
	        }
	        //System.out.println(stack.cur);
	        if(stack.cur!=0) return false;
	        return true;
	    }
	}
}
