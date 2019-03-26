package com.github.extermania.leetcode;

public class $1020_Partition_Array_Into_Three_Parts_With_Equal_Sum_28_05 {
	class Solution {
	    public boolean canThreePartsEqualSum(int[] A) {
	        int sum = 0;
	        for(int a:A) sum+=a;
	        System.out.println(sum);
	        if(sum%3!=0) return false;
	        int n=sum/3;
	        int k=0;
	        for(int i=0, cur=0; i<A.length; i++){
	            cur+=A[i];
	           // if(cur>n) return false;
	            if(cur==n){
	                cur=0; k++;
	                      }
	        }
	        return k==3;
	    }
	}
}
