package com.github.extermania.leetcode;

public class $1042_Flower_Planting_With_No_Adjacent_5_01 {
	class Solution {
	    public int[] gardenNoAdj(int N, int[][] paths) {
	        int[] rst = new int[N];
	        
	        for(int i=0; i<rst.length; i++)
	            rst[i]=i%4+1;
	        
	        while(true){
	            boolean change = false;
	            for(int[] p:paths){
	                int a=p[0]; int b=p[1];
	                if(rst[a-1]==rst[b-1]){
	                    rst[b-1]=rst[b-1]%4+1;
	                    change = true;
	                    break;
	                }
	            }
	            if(!change)
	                return rst;
	        }

	    }
	}
}
