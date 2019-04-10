package com.github.extermania.leetcode;

public class $0165_Compare_Version_Numbers_88_96 {
	class Solution {
	    public int compareVersion(String version1, String version2) {
	        String[] s1 = version1.split("\\.");
	        String[] s2 = version2.split("\\.");
	        
	        for(int i=0; i<Math.max(s1.length, s2.length); i++){
	           // System.out.println(s1[i]+" "+s2[i]);
	            int v1 = s1.length>i?Integer.parseInt(s1[i]):0;
	            int v2 = s2.length>i?Integer.parseInt(s2[i]):0;
	            if(v1>v2) return 1;
	            else if(v1<v2) return -1;
	        }
	        
	        return 0;
	    }
	}
}
