package com.github.extermania.leetcode;

public class $1106_Parsing_A_Boolean_Expression_5_26 {
	class Solution {
	    boolean f(String exp){
	        //System.out.println(exp);
	        int idx1 = exp.lastIndexOf("(");
	        int idx2 = exp.indexOf(")", idx1);
	        char op = exp.charAt(idx1-1);
	        String val = exp.substring(idx1+1, idx2);
	        char tf = eval(val, op);
	        String neu = exp.substring(0, idx1-1)+tf+exp.substring(idx2+1);
	        if(neu.length()==1){
	            return neu.charAt(0)=='t'?true:false;
	        }else{
	            return f(neu);
	        }
	    }
	    char eval(String val, char op){
	        if(op=='!'){
	            return val.charAt(0)=='t'?'f':'t';
	        }else if(op=='|'){
	            return val.indexOf("t")>=0?'t':'f';
	        }else if(op=='&'){
	            return val.indexOf("f")>=0?'f':'t';
	        }
	        return ' ';
	    }
	    public boolean parseBoolExpr(String expression) {
	       return f(expression);
	    }
	}
}
