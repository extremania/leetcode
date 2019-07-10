package com.github.extermania.leetcode;

public class $1108_Defanging_an_IP_Address_100 {
	class Solution {
	    public String defangIPaddr(String address) {
	        StringBuilder sb = new StringBuilder();
	        for(char c:address.toCharArray())
	            sb.append(c=='.'?"[.]":c);
	        return sb.toString();
	    }
	}
}
