package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1090_Largest_Values_From_Labels_56_04 {
	class Solution {
	    class P {
	        int v;
	        int l;
	        P(int v, int l){
	            this.v=v;
	            this.l=l;
	        }
	    }
	    
	    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
	        P[] arr = new P[values.length];
	        for(int i=0; i<arr.length; i++)
	            arr[i]=new P(values[i], labels[i]);
	        Arrays.sort(arr, (p1, p2)->{
	            return p2.v-p1.v;
	        });
	        int cnt=num_wanted;
	        int[] used = new int[20001];
	        int sum = 0;
	        for(P p:arr){
	            //System.out.println(p.v+" "+p.l);
	            if(used[p.l]++<use_limit){
	                //System.out.println(p.v);
	                sum+=p.v;
	                cnt--;
	            }
	            if(cnt==0) return sum;
	        }
	        return sum;
	    }
	}
}
