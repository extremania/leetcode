package com.github.extermania.leetcode;

public class $1007_Minimum_Domino_Rotations_For_Equal_Row_86_58 {
	class Solution {
	    public int minDominoRotations(int[] A, int[] B) {
	        int len = A.length;
	        int cnt1 = 0;
	        for(int i=0; i<len; i++){
	            if(A[i]==A[0]) continue;
	            else if(B[i]==A[0]) cnt1++;
	            else {cnt1 = Integer.MAX_VALUE; break; }
	        }
	        int cnt2 = 0;
	        for(int i=0; i<len; i++){
	            if(B[i]==B[0]) continue;
	            else if(A[i]==B[0]) cnt2++;
	            else {cnt2 = Integer.MAX_VALUE; break; }
	        }
	        int cnt3 = 0;
	        for(int i=0; i<len; i++){
	            if(A[i]==B[0]) continue;
	            else if(B[i]==B[0]) cnt3++;
	            else {cnt3 = Integer.MAX_VALUE; break; }
	        }
	        int cnt4 = 0;
	        for(int i=0; i<len; i++){
	            if(B[i]==A[0]) continue;
	            else if(A[i]==A[0]) cnt4++;
	            else {cnt4 = Integer.MAX_VALUE; break; }
	        }
	        int cnt = Math.min(Math.min(cnt1, cnt2), Math.min(cnt3, cnt4));
	        return cnt==Integer.MAX_VALUE?-1:cnt;
	    }
	}
}
