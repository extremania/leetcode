package com.github.extermania.leetcode;

public class $1004_Max_Consecutive_Ones_III_16_41 {
	class Solution {
	    int ocnt(int[] A){
	        int cnt=0;
	        for(int i:A)if(i==1)cnt++;
	        return cnt;
	    }
	    int zcnt(int[] A){
	        int cnt=0;
	        for(int i:A)if(i==0)cnt++;
	        return cnt;
	    }
	    public int longestOnes(int[] A, int K) {
	        if(K==0) return ocnt(A);
	        int zcnt=zcnt(A);
	        if(K>=zcnt) return A.length;
	        int[] arr = new int[A.length];
	        int c = 0; int cnt=0;
	        for(int i=0; i<A.length; i++){
	            if(A[i]==0){
	                arr[c++]=cnt;
	                cnt=0;
	            }else{
	                cnt++;
	                if(i==A.length-1) arr[c++]=cnt;
	            }
	        }
	        //System.out.println(Arrays.toString(arr));
	        //System.out.println(c);
	        //System.out.println(c-K+1);
	        
	        int max=0;
	        for(int i=0; i<c-K+1; i++){
	            int sum=0;
	            for(int j=i; j<=i+K; j++) sum+=arr[j];
	            max=Math.max(max, sum+K);
	        }
	        return max;
	    }
	}
}
