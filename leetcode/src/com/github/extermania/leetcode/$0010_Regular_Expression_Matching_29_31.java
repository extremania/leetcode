package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0010_Regular_Expression_Matching_29_31 {
	class Solution {
	    boolean isMatch(char[] cs, int i, char[] ps, int j, Map<Integer, Boolean> map){
	        int key = cs.length*i+j;
	        Boolean bo = map.get(key);
	        if(bo!=null){
	            return bo;
	        }
	            
	        //System.out.println(new String(cs)+","+i+","+new String(ps)+","+j);
	        int lens = cs.length-i;
	        int lenp = ps.length-j;
	        //System.out.println(lens+","+lenp);
	        if(lens==0 && lenp==0) {
	            map.put(key, true);
	            return true;
	        }
	        if(lens==0 && lenp>0) {
	            if(lenp==1){
	                map.put(key, false);
	                return false;
	            }else if(lenp==2){
	                if(ps[j+1]=='*') {
	                    map.put(key, true);
	                    return true;
	                } else { 
	                    map.put(key, false);
	                    return false;
	                }
	            }
	            if(ps[j+1]!='*'){
	                   map.put(key, false);
	                 return false;
	            }
	            return isMatch(cs, i, ps, j+2, map);
	        }
	        if(lens>0 && lenp==0) {
	               map.put(key, false);
	            return false;
	        }
	        if(lens<0 || lenp<0) {
	               map.put(key, false);
	            return false;
	        }
	        if(lens==1 && lenp==1){
	            boolean rst =  cs[i]==ps[j] || ps[j]=='.';
	            map.put(key, rst);
	            return rst;
	        } 
	        if(lenp==2) if(ps[j]=='.' && ps[j+1]=='*'){
	            map.put(key, true);
	            return true;
	        } 
	        if(ps[j]=='.'){
	            if(lenp>1 && ps[j+1]=='*'){
	                //System.out.println("c1");
	                return isMatch(cs, i+1, ps, j, map)  || isMatch(cs, i+1, ps, j+2, map) || isMatch(cs, i, ps, j+2, map);
	            }else{
	               // System.out.println("c2");
	                return isMatch(cs, i+1, ps, j+1, map);
	            }
	        }else{
	            if(lenp>1 && ps[j+1]=='*'){
	                if(cs[i]!=ps[j]){
	                   // System.out.println("c3");
	                    return isMatch(cs, i, ps, j+2, map);
	                }else{
	                   // System.out.println("c4");
	                    return isMatch(cs, i+1, ps, j, map) || isMatch(cs, i+1, ps, j+2, map) || isMatch(cs, i, ps, j+2, map);
	                }
	            }else{
	               // System.out.println("c5");
	                if(cs[i]!=ps[j]) {
	                       map.put(key, false);
	                    return false;
	                }
	                return isMatch(cs, i+1, ps, j+1, map);
	            }
	        }
	    }
	    
	    boolean quick(String s, char[] ps){
	        //char[] req = new char[ps.length];
	        for(int i=0; i<ps.length; i++){
	            if(ps[i]=='*' || ps[i]=='.') continue;
	            if(i==ps.length-1 || ps[i+1] != '*'){
	                if(s.indexOf(ps[i])<0) return false;
	            }
	        }
	        return true;
	    }
	    
	    public boolean isMatch(String s, String p) {
	        char[] cs = s.toCharArray();
	        char[] ps = p.toCharArray();
	         if(!quick(s, ps)){
	             return false;
	         }
	        Map<Integer, Boolean> map = new HashMap<>();
	        return isMatch(cs, 0, ps, 0, map);
	    }
	}
}
