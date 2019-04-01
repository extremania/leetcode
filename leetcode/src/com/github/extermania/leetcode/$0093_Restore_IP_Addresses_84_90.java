package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0093_Restore_IP_Addresses_84_90 {
	class Solution {
	    void f(Set<String> rst, String pre, String s2, int n){
	        //if(s2.length()<n) return;
	        if(s2.length()==0 || n==4 && (s2.length()>3 || Integer.parseInt(s2)>255)) return;
	        if(n==4){
	            if(s2.startsWith("0") && !s2.equals("0")) return;
	            rst.add((pre+"."+s2).substring(1));
	        }
	        for(int i=1; i<=Math.min(s2.length(), 3); i++){
	            String ss = s2.substring(0, i);
	            if(i==3 && Integer.parseInt(ss)>255) continue;
	            if(ss.startsWith("0") && !ss.equals("0")) continue;
	            f(rst, pre+"."+ss, s2.substring(i), n+1);
	        }
	    }
	    
	    public List<String> restoreIpAddresses(String s) {
	        if(s.length()<4) return new ArrayList<>();
	        Set<String> rst = new HashSet<>();
	        f(rst, "", s, 1);
	        return new ArrayList<>(rst);
	    }
	}
}
