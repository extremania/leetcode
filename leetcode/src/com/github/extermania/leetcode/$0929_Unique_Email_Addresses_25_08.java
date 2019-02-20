package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0929_Unique_Email_Addresses_25_08 {
	static class Solution {
	    
	    private static String getKey(String str){
	        String[] parts = str.split("@");
	        String[] pp = parts[0].split("\\+");
	        String l = pp[0].replace(".", "");
	        String r = parts[1];
	        return l+"-"+r;
	    }
	    
	    public int numUniqueEmails(String[] emails) {
	        Set<String> set = new HashSet<>();
	        for(String email:emails){
	            set.add(getKey(email));
	        }
	        return set.size();
	    }
	}
}
