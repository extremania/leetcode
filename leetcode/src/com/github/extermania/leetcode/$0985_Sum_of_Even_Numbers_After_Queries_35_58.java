package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0985_Sum_of_Even_Numbers_After_Queries_35_58 {
	class Solution {
	    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
	        if(queries.length==0) return new int[0];
	        Map<Integer, Integer> val_map = new HashMap<>();
	        Map<Integer, Boolean> even_map = new HashMap<>();
	        int sum = 0;
	        for(int i=0; i<A.length; i++){
	            val_map.put(i, A[i]);
	            if(A[i]%2==0){
	                sum+=A[i];
	                even_map.put(i, true);
	            }else{ 
	                even_map.put(i, false);
	            }
	        }
	        int[] arr = new int[queries.length];
	        for(int i=0; i<queries.length; i++){
	            //System.out.println(val_map);
	            //System.out.println(even_map);
	            int key = queries[i][1];
	            int val = queries[i][0];
	            int old_val = val_map.get(key);
	            int new_val = old_val+val;
	            boolean even = even_map.get(key);
	            boolean new_even = new_val%2==0;
	            if(new_even){
	                if(even){
	                    sum=sum-old_val+new_val;
	                }else{
	                    sum=sum+new_val;
	                    even_map.put(key, true);
	                }
	            }else{
	                if(even){
	                    sum=sum-old_val;
	                    even_map.put(key, false);
	                }
	            }
	            val_map.put(key, new_val);
	            arr[i]=sum;
	        }
	        
	        return arr;
	    }
	}
}
