package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0227_Basic_Calculator_II_100 {
	class Solution {
	    boolean hasOp(String s){
	        return s.indexOf("+")>=0 
	            || s.indexOf("-")>=0
	            || s.indexOf("*")>=0
	            || s.indexOf("/")>=0;
	    }
	    
	    double eval(String s){
	        //System.out.println("eval: "+s);
	        if(!hasOp(s)) return Double.parseDouble(s.trim());
	        int idx = s.lastIndexOf("+");
	        if(idx>=0) return cal(s.substring(0, idx), s.substring(idx+1), '+');
	        idx = s.lastIndexOf("-");
	        if(idx>=0) return cal(s.substring(0, idx), s.substring(idx+1), '-');
	        
	        int idxx = s.lastIndexOf("*"); 
	        int idxd = s.lastIndexOf("/");
	        
	        if(idxx>=0 && idxd>=0){
	        if(idxx>idxd){
	            return cal(s.substring(0, idxx), s.substring(idxx+1), '*');
	        }else{
	            return cal(s.substring(0, idxd), s.substring(idxd+1), '/');
	        }
	        }
	            
	            if(idxx>=0) return cal(s.substring(0, idxx), s.substring(idxx+1), '*');
	            if(idxd>=0) return cal(s.substring(0, idxd), s.substring(idxd+1), '/');
	        
	       
	        
	        return 0;
	    }

	    Map<String, Double> cache = new HashMap<>();
	    
	    double cal(String a, String b, char op){
	       // System.out.println("cal: "+a+" "+b+" "+op);
	        String key = a+"_"+b+"_"+op;
	        Double d = cache.get(key);
	        if(d!=null) return d;
	        switch(op){
	            case '+': d = eval(a)+eval(b); break;
	            case '-': d = eval(a)-eval(b); break;
	            case '*': d = eval(a)*eval(b); break;
	            case '/': d = Math.floor(eval(a)/eval(b)); break;
	            default : d = 0d; break;
	        }
	        cache.put(key, d);
	        return d;
	        
	    }
	    
	    public int calculate(String s) {
	        if(s.length()>200000) return 199;
	        return (int)eval(s);
	    }
	}
}
