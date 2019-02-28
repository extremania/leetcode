package com.github.extermania.leetcode;

public class $0520_Detect_Capital_100 {
	class Solution {
	    public boolean detectCapitalUse(String word) {
	        if(word==null || word.length()==1) return true;
	        char[] cs = word.toCharArray();
	        boolean firstUp = (cs[0]>='A' && cs[0]<='Z');
	        boolean secUp = (cs[1]>='A' && cs[1]<='Z');
	        if(firstUp && secUp){
	            for(int i=2; i<cs.length;i++){
	                if(!(cs[i]>='A' && cs[i]<='Z')){
	                    return false;
	                }
	            }
	        }else if(firstUp && !secUp || !firstUp && !secUp){
	              for(int i=2; i<cs.length;i++){
	            if((cs[i]>='A' && cs[i]<='Z')){
	                    return false;
	            }
	              }
	        } else {
	            return false;   
	        }
	        return true;
	    }
	}
}
