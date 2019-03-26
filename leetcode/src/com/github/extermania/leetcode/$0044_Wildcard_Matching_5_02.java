package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0044_Wildcard_Matching_5_02 {
	class Solution {
	    boolean starCheck(String str1, String str2){
	        if(str2.startsWith(str1) && str2.length()>str1.length()){
	            for(int i=str1.length(); i<str2.length(); i++){
	                if(str2.charAt(i)!='*') return false;
	            }
	            return true;
	        }else{
	            return false;
	        }
	    }
	    boolean allStar(String str2){
	            for(int i=0; i<str2.length(); i++){
	                if(str2.charAt(i)!='*') return false;
	            }
	        return true;
	    }
	    
	    boolean preCheck(String str1, String str2){
	        int[] arr = new int[26];
	        for(char c:str1.toCharArray()){
	            arr[c-'a']++;
	        }
	        for(char c:str2.toCharArray()){
	            if(c=='?' || c=='*') continue;
	            if(--arr[c-'a']<0) return false;
	        }
	        return true;
	    }
	    
	    Map<String, Boolean> map = new HashMap<>();
	    boolean match(String str1, String str2){
	      //  System.out.println(str1+"-"+str2);
	       if(str1.equals(str2)) return true;
	       if(str2.equals("*")) return true;
	       if(str1.length()==0){
	           if(allStar(str2)) return true;
	           else return false;
	       }
	       if(str1.length()>0 && str2.length()==0) return false;
	       if(!preCheck(str1, str2)) return false;
	       if(str1.length()==1){
	           if(str2.equals("*") 
	              || str2.equals("?") 
	              || starCheck(str1, str2)
	              || str2.equals("*?") 
	              || str2.equals("?*")) return true;
	           else if(str2.startsWith("?")){
	               return match("", str2.substring(1));
	           }else if(str2.startsWith("*")){
	               return match(str1, str2.substring(1));
	           }
	           else return false;
	       }
	       if(str2.length()==0) return false;
	       String key = str1+"-"+str2;
	       Boolean b = map.get(key);
	       if(b!=null) return b;
	       if(str2.startsWith("?")){
	           b = match(str1.substring(1), str2.substring(1));
	           map.put(key, b);
	           return b;
	       }else if(str2.startsWith("*")){
	           b = match(str1.substring(1), str2.substring(1)) 
	               || match(str1, str2.substring(1))
	               || match(str1.substring(1), str2);
	           map.put(key, b);
	           return b;
	       }else if(str1.charAt(0)==str2.charAt(0)){
	           b = match(str1.substring(1), str2.substring(1));
	           map.put(key, b);
	           return b;
	       }
	       map.put(key, false);
	       return false;
	    }
	    public boolean isMatch(String s, String p) {
	        return match(s, p);
	    }
	}
}
