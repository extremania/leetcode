package com.github.extermania.leetcode;

public class $1100_Find_K_Length_Substrings_With_No_Repeated_Characters_87_04 {
	class Solution {
	    public int numKLenSubstrNoRepeats(String S, int K) {
	        if(S.length()<K) return 0;
	        int[] arr = new int[26];
	        boolean dup = false;
	        int sum = 0;
	        for(int i=0;i<K;i++){
	            char c = S.charAt(i);
	            if(++arr[c-'a']>1) dup=true;
	        }
	        if(!dup) sum++;
	        for(int i=K; i<S.length(); i++){
	            char cnext = S.charAt(i);
	            char cprev = S.charAt(i-K);
	            arr[cprev-'a']--;
	            arr[cnext-'a']++;
	           
	         //   System.out.println(" "+S.substring(i-K+1, i+1));
	            if(!dup){
	                if(arr[cnext-'a']==1) sum++;
	                else dup = true;
	            }else{
	                dup=false;
	                for(int a:arr) if(a>1) {
	                    dup=true; break;
	                }
	                if(!dup) sum++;
	            }
	        //    for(int a:arr) System.out.print(a);
	           // System.out.println("->"+sum);
	        }
	        return sum;
	    }
	}
}
