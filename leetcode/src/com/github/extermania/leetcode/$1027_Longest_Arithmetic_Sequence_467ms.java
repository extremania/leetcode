package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $1027_Longest_Arithmetic_Sequence_467ms {
	class Solution {
	    public int longestArithSeqLength(int[] A) {
	        int max = 0;
	        Set<String> checked = new HashSet<>();
	        for(int i=0; i<A.length-1; i++){
	            for(int j=i+1; j<A.length; j++){
	                int max0=2;
	                int s = A[i]-A[j];
	                if(checked.contains(s+" "+j)) continue;
	                checked.add(s+" "+j);
	                int last = A[j];
	                for(int k=j+1; k<A.length; k++){
	                    if(last-A[k]==s){
	                        last=A[k];
	                        max0++;
	                    }
	                }
	                max=Math.max(max, max0);
	            }
	        }
	        return max;
	    }
	}
}
