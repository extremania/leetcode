package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $1005_Maximize_Sum_Of_Array_After_K_Negations_16_67 {
	class Solution {
	    public int largestSumAfterKNegations(int[] A, int K) {
	        boolean hasZero = false;
	        List<Integer> pos=new ArrayList<>();
	        List<Integer> neg=new ArrayList<>();
	        int sum = 0;
	        for(int n:A){
	            if(n<0) neg.add(n);
	            else if(n>0) pos.add(n);
	            else hasZero=true;
	            sum+=n;
	        }
	        Collections.sort(pos);
	        Collections.sort(neg);
	        for(int i=0; i<K; i++){
	            if(neg.size()>0){
	                pos.add(-neg.get(0));
	                sum+=(-2*neg.get(0));
	                neg.remove(0);
	                Collections.sort(pos);
	            }else if(hasZero){
	                return sum;
	            } else {
	                neg.add(-pos.get(0));
	                sum-=(2*pos.get(0));
	                pos.remove(0);
	                Collections.sort(neg);
	            }
	        }
	        return sum;
	    }
	}
}
