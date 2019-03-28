package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0089_Gray_Code_42_75 {
	class Solution {
	    public List<Integer> grayCode(int n) {
	        if(n==0) Arrays.asList(0);
	        int n_excalmatory_mark = (int) Math.pow(2, n);
	        int[][] arr = new int[n_excalmatory_mark][n];
	        int lead = 1;
	        int step = 2;
	        for(int i=n-1; i>=0; i--){
	            int k=lead;
	            while(k<n_excalmatory_mark){
	                for(int j=0; j<step; j++){
	                    //System.out.println(i+" "+(k+j));
	                    if((k+j)>=n_excalmatory_mark) break;
	                    arr[k+j][i]=1;
	                }
	                k+=(2*step);
	            }
	            lead=step;
	            step<<=1;
	        }
	        
	        List<Integer> rst = new ArrayList<>();
	        for(int[] a:arr)
	            rst.add(f(a));
	        
	        return rst;
	    }
	    
	    int f(int[] a){
	        int sum=0;
	        for(int i=a.length-1; i>=0; i--)
	            sum+=(a[i]<<a.length-1-i);
	        return sum;
	    }
	}
}
