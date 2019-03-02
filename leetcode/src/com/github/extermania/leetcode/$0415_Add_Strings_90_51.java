package com.github.extermania.leetcode;

public class $0415_Add_Strings_90_51 {
	class Solution {   
	    int getInt(char c){
	        switch(c){
	            case '0': return 0;
	            case '1': return 1;
	            case '2': return 2;
	            case '3': return 3;
	            case '4': return 4;
	            case '5': return 5;
	            case '6': return 6;
	            case '7': return 7;
	            case '8': return 8;
	            case '9': return 9;
	            default: return 0;
	        }
	    }
	    
	    
	    public String addStrings(String num1, String num2) {
	        int maxLen = Math.max(num1.length(),num2.length());
	        StringBuilder sb1 = new StringBuilder(num1);
	        StringBuilder sb2 = new StringBuilder(num2);
	        while(sb1.length()<maxLen) sb1.insert(0, "0");
	        while(sb2.length()<maxLen) sb2.insert(0, "0");
	        String s1 = sb1.toString();
	        String s2 = sb2.toString();
	        StringBuilder result=new StringBuilder("");
	        int r=0;
	        for(int i=maxLen-1; i>=0; i--){
	            int sum = getInt(s1.charAt(i))+getInt(s2.charAt(i))+r;
	            if(sum>=10){
	                r=1;
	                sum%=10;
	            }else{
	                r=0;
	            }
	            result.append(sum);
	        }
	        if(r>0){
	             result.append(1);
	        }
	        return result.reverse().toString();
	    }
	}
}
