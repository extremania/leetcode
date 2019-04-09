package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0132_Palindrome_Partitioning_II_29_59 {
	class Solution {
	    
	    void f(boolean[][] dp, int[] bound, int s, int e, char[] cs){
	        //System.out.println(s+" "+e);
	        if(s==e) dp[s][e]=true;
	        if(s>0 && e<cs.length-1)
	            if(dp[s-1][e+1]) {dp[s][e]=true; bound[s]=e; return;}
	        for(int i=s; i<(s+e)/2+1; i++)
	            if(cs[i]!=cs[e+s-i]) return;
	        dp[s][e]=true;
	        bound[s]=e;
	    }
	    
	    int t(boolean[][] dp, int[] bound){
	        //System.out.println(Arrays.toString(bound));
	        int[] cut = new int[dp.length];
	        Arrays.fill(cut, dp.length);
	        
	        //System.out.println(Arrays.toString(cut));
	        
	        for(int i=0; i<dp.length; i++){
	            for(int j=i; j<dp.length; j++){
	                if(dp[i][j])
	                    if(i==0) cut[j]=0;
	                    else cut[j] = Math.min(cut[j], cut[i-1]+1);
	               // else
	                    //cut[j]=Math.min(cut[j], i+1);
	            }
	            //System.out.println(i+":"+Arrays.toString(cut));
	        }
	       
	        return cut[dp.length-1];
	    }
	    
	    public int minCut(String s) {
	        if(s.length()<=1) return 0;
	        boolean[][] dp = new boolean[s.length()][s.length()];
	        int[] bound = new int[s.length()];
	         
	        char[] cs = s.toCharArray();
	        for(int i=0; i<cs.length;i++)
	            for(int j=i; j<cs.length; j++)
	                f(dp, bound, i, j, cs);

	        
	        // for(int i=0; i<dp.length; i++){
	        //     System.out.println(i+": "+Arrays.toString(dp[i]));
	        // }
	        // System.out.println(Arrays.toString(bound));
	        

	       return t(dp, bound);
	        
	       //return 0;
	    }
	}
}
