package com.github.extermania.leetcode;

public class $0150_Evaluate_Reverse_Polish_Notation_99_70 {
	class Solution {
	    boolean isop(String s){
	        return "+-*/".indexOf(s)>=0;
	    } 
	    int cal(int a, int b, String op){
	        switch(op){
	            case "+":
	                return b+a;
	            case "-":
	                return b-a;
	            case "*":
	                return b*a;
	            case "/":
	                return b/a;
	            default:
	                return 0;
	        }
	    }
	    public int evalRPN(String[] tokens) {
	        if(tokens.length==0) return 0;
	        if(tokens.length==1) return Integer.parseInt(tokens[0]);
	        if(tokens.length==2) return Integer.parseInt(tokens[1]);
	        int cur = 0;
	        int[] stack = new int[tokens.length];
	        for(int i=0; i<tokens.length; i++){
	            //System.out.println(Arrays.toString(stack));
	            String s = tokens[i];
	            if(isop(s)){
	                int a = stack[--cur];
	                int b = stack[--cur];
	                int c = cal(a, b, s);
	                //System.out.println(a+" "+b+" "+c);
	                if(i==tokens.length-1) return c;
	                else stack[cur++]=c;
	            }else{
	                stack[cur++]=Integer.parseInt(s);
	            }
	        } 
	        return 0;
	    }
	}
}
