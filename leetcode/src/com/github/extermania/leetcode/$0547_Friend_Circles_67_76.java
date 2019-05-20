package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0547_Friend_Circles_67_76 {
	class Solution {
	    public int findCircleNum(int[][] M) {
	        boolean[] arr = new boolean[M.length];
	        
	        int cnt = 0;
	        for(int i=0; i<arr.length; i++){
	            if(!arr[i]){
	                cnt++;
	                Set<Integer> set = new HashSet<>();
	                set.add(i);
	                while(set.size()>0){
	                    Set<Integer> set0 = new HashSet<>();
	                    for(int n:set){
	                        arr[n]=true;
	                        for(int t=0; t<M[n].length; t++){
	                            if(M[n][t]==1 && !arr[t]){
	                                arr[t]=true;
	                                set0.add(t);
	                            }
	                        }
	                    }
	                    set=set0;
	                }
	            }
	        }
	        
	        return cnt;
	    }
	}
}
