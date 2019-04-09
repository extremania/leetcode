package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $1024_Video_Stitching_89_94 {
	class Solution {
	    public int videoStitching(int[][] clips, int T) {
	        boolean[][] dp = new boolean[clips.length][101];  
	        
	        boolean hasEnd=false;
	        
	       for(int i=0; i<clips.length; i++){
	           int[] r=clips[i];
	           for(int j=r[0]; j<=r[1]; j++){
	               dp[i][j]=true;
	               if(j==T) hasEnd=true;
	           }
	       }
	        
	        if(!hasEnd) return -1;

	       Set<Integer> pp = new HashSet<>();
	       Set<Integer> p = new HashSet<>();
	       for(int i=0; i<dp.length; i++)
	           if(dp[i][0]) p.add(i); 
	        

	       int cnt=0;
	       int max=0;
	       while(p.size()>0 && max<T){
	           //System.out.println(max);
	           //System.out.println("P:"+p);
	           pp.addAll(p);
	           for(int q:p){
	              for(int i=max; i<=T; i++){
	                  if(dp[q][i]) max=i;
	                  else break;
	              }
	           }
	           p=new HashSet<>();
	           for(int i=0; i<dp.length; i++) 
	               if(dp[i][max] && !pp.contains(i)) p.add(i); 
	  
	           cnt++; 
	       }
	        
	       if(T<=max) return cnt;
	        return -1;
	    }
	}
}
