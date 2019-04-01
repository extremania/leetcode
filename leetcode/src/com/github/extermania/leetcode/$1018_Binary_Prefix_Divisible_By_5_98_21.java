package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1018_Binary_Prefix_Divisible_By_5_98_21 {
	class Solution {
	    public List<Boolean> prefixesDivBy5(int[] A) {
	        
	        List<Boolean> list = new ArrayList<>();
	        
	        int n = 0;
	        for(int i=0; i<A.length; i++){
	            //System.out.println(n);
	            int pre = n+A[i];
	            list.add(pre%5==0);
	            n=(pre<<1)%5;
	        }
	        
	        
	        return list;
	    }
	}
}
