package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0948_Bag_of_Tokens_99_39 {
	class Solution {
	    public int bagOfTokensScore(int[] tokens, int P) {
	        Arrays.sort(tokens);
	        int s = 0;
	        int e = tokens.length-1;
	        int cnt = 0;
	        int p = P;
	        int max = 0;
	        while(s<=e){
	            //System.out.println(cnt+" "+p);
	            if(p>=tokens[s]){
	                p-=tokens[s];
	                cnt++; s++;
	                max = Math.max(cnt, max);
	            }else if(cnt>0){
	                p+=tokens[e];
	                cnt--; e--;
	            }else{
	                break;
	            }
	        }
	        
	        return max;
	    }
	}
}
