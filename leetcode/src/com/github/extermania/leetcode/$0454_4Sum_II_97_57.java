package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0454_4Sum_II_97_57 {
	class Solution {

	    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	          Map<Integer, Integer> ab = new HashMap<>();
	          for(int i=0; i<A.length; i++){
	              for(int j=0; j<B.length; j++){
	                  int n = A[i]+B[j];
	                  Integer cnt = ab.get(n);
	                  if(cnt==null) cnt=0;
	                  cnt++;
	                  ab.put(n, cnt);
	              }
	          }
	          int rst = 0;
	        for(int i=0; i<C.length; i++){
	            for(int j=0; j<D.length; j++){
	                int n = C[i]+D[j];
	                Integer cnt = ab.get(-n);
	                if(cnt!=null) rst+=cnt;
	            }
	        }
	        
	        return rst;
	       
	    }
	}
}
