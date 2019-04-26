package com.github.extermania.leetcode;

public class $0278_First_Bad_Version_8_07 {
	class VersionControl{
		 boolean isBadVersion(int version) {
			 return true;
		 }
	}
	public class Solution extends VersionControl {
	    public int firstBadVersion(int n) {
	        long s = 1;
	        long e = n;
	        int m = 1;
	        while(e>=s){
	            m = (int)((s+e)/2);
	           // System.out.println(s+" "+e+" "+m);
	            boolean bad = isBadVersion(m);
	            boolean bad1 = isBadVersion(m+1);
	            boolean bad2 = isBadVersion(m-1);
	          //  System.out.println(bad+" "+bad1+" "+bad2);
	            if(bad && !bad2) return m;
	            if(bad1 && !bad) return m+1;
	            if(bad) e = m-1; 
	            else s = m+1;
	        }
	        return m;
	    }
	}
}
