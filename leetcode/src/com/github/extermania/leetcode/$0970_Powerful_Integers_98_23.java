package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0970_Powerful_Integers_98_23 {
	class Solution {
	    public List<Integer> powerfulIntegers(int x, int y, int bound) {
	        if(bound==0) return new ArrayList<>();
	        int[] xp = new int[7];
	        int x0 = x;
	        xp[0] = 1;
	        int k=1;
	        if(x>1)
	        while(x0<=bound){
	            xp[k++]=x0;
	            x0=x0*x;
	        }
	        Set<Integer> set = new HashSet<>();
	        int[] yp = new int[7];
	        int y0 = y;
	        yp[0] = 1;
	        k = 1;
	        if(y>1)
	        while(y0<=bound){
	            yp[k++]=y0;
	            y0=y0*y;
	        }
	        //System.out.println(xp);
	        //System.out.println(yp);
	        for(int i=0; i<xp.length; i++){
	            if(xp[i]==0) break;
	            for(int j=0; j<yp.length; j++){
	                if(yp[j]==0) break;
	                int sum = xp[i]+yp[j];
	                if(sum>bound) break;
	                set.add(sum);
	            }
	        }
	        return new ArrayList<>(set);
	    }
	}
}
