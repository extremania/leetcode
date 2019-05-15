package com.github.extermania.leetcode;

public class $0718_Maximum_Length_of_Repeated_Subarray_13_04 {
	class Solution {
	    public int findLength(int[] A, int[] B) {
	        int lena = A.length;
	        int lenb = B.length;
	        int[] s = lena<=lenb?A:B;
	        int[] b = lena<=lenb?B:A;
	            
	        int max = 0;
	        for(int i=0; i<s.length-max; i++){
	            for(int j=0; j<b.length-max; j++){
	                if(s[i]==b[j]){
	                    int i0 = i;
	                    int j0 = j;
	                    int cur = 1;
	                    while(i<s.length-1 && j<b.length-1 && s[++i]==b[++j]) cur++;
	                    max = Math.max(max, cur);
	                    i=i0; j=j0;
	                }
	            }
	            //System.out.println(i);
	        }
	        
	        return max;
	    }
	}
}
