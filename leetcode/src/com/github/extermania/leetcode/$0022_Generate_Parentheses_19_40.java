package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0022_Generate_Parentheses_19_40 {
	class Solution {
	    Set<String> f(int n){
	        Set<String> set0 = new HashSet<>();
	        if(n==0) return set0;
	        if(n==1) {
	            set0.add("()");
	            return set0;
	        }
	        
	        for(int i=1; i<=n/2; i++){
	            Set<String> set2 = f(n-i);
	            if(i==1){
	                for(String s2:set2){
	                    set0.add("("+s2+")");
	                    set0.add("()"+s2);
	                    set0.add(s2+"()");
	                }
	            }else{
	                Set<String> set1 = f(i);
	                for(String s1:set1){
	                    for(String s2:set2){
	                        set0.add(s1+s2);
	                        set0.add(s2+s1);
	                    }
	                }
	            }
	        }
	        
	        return set0;
	        
	    }
	    
	    public List<String> generateParenthesis(int n) {
	        return new ArrayList<>(f(n));
	    }
	}
}
