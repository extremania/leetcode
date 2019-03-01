package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0455_Assign_Cookies_100 {
	class Solution {
	    public int findContentChildren(int[] g, int[] s) {
	        Arrays.sort(g);
	        Arrays.sort(s);
	        int cnt=0;
	        int j = 0;
	        for(int i=0;i<g.length;i++){
	            for(;j<s.length;j++){
	                if(s[j]>=g[i]){
	                    cnt++;
	                    j++;
	                    if(j>=s.length) return cnt;
	                    break;
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
