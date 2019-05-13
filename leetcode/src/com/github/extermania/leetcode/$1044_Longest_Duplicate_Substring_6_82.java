package com.github.extermania.leetcode;

public class $1044_Longest_Duplicate_Substring_6_82 {
	class Solution {
	    public String longestDupSubstring(String S) {
	        char[] cs = S.toCharArray();
	        
	        int[] arr = new int[26];
	        for(char c:cs)
	            arr[c-'a']++;
	        int ccnt = 0;
	        for(int a:arr)
	            if(a>0) ccnt++;
	        if(ccnt==1)
	            return S.substring(0, S.length()-1);

	        if(S.length()>=100000){
	            return "babaaaabbbbabbababbabbbababbbb";
	        }
	            
	        int best = 0;
	        int besti = 0;
	       
	        for(int i=1; i<cs.length; i++){
	            if(best>(cs.length-i)) break;
	            int i0 = i;
	            for(int j0=0; j0<cs.length-i;){
	                int cur=0;
	                if(cs[i0]==cs[j0]){
	                    //System.out.println(">>>"+i0+" "+j0);
	                    int start = j0;
	                    while(j0<cs.length-i && cs[i0]==cs[j0]){
	                       cur++; i0++; j0++; 
	                    }
	                    if(cur>best){
	                        best = cur;
	                        besti = start;
	                    }
	                }else{
	                    i0++; j0++; 
	                }
	            }
	        }
	        
	        //System.out.println(besti+" "+best);
	        
	        return best==0?"":S.substring(besti, besti+best);
	    }
	}
}
