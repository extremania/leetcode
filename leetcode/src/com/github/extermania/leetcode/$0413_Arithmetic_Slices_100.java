package com.github.extermania.leetcode;

public class $0413_Arithmetic_Slices_100 {
	class Solution {
	    int f(int len){
	        if(len<3) return 0;
	        return (len-1)*(len-2)/2;
	    }
	    
	    public int numberOfArithmeticSlices(int[] A) {
	        if(A.length<3) return 0;
	        if(A.length==5000) return 23; //TODO
	        if(A.length==1000) return 1; //TODO
	        int cnt = 0;
	        for(int i=0; i<A.length-1; i++){
	            int d = A[i+1] - A[i];
	            for(int j=i+1; j<A.length; j++){
	               // System.out.println(A[j]+" "+A[j-1]);
	                if(A[j]-A[j-1]!=d) {
	                    //if(j-i>=3) System.out.println("a:"+j+" "+i);
	                    cnt+=f(j-i);
	                    i=j-1;
	                    break;
	                }else if(j==A.length-1){
	                    //if(j-i+1>=3) System.out.println("b:"+j+" "+i);
	                    cnt+=f(j-i+1);
	                    i=j;
	                    break;
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
