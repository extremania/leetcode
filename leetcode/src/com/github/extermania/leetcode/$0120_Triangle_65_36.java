package com.github.extermania.leetcode;

import java.util.List;

public class $0120_Triangle_65_36 {
	class Solution {
	    int min(List<Integer> list){
	        int min = Integer.MAX_VALUE;
	        for(int n:list) min = Math.min(n, min);
	        return min;
	    }
	    public int minimumTotal(List<List<Integer>> triangle) {
	        if(triangle.size()==0) return 0;
	        if(triangle.size()==1) return min(triangle.get(0));
	        if(triangle.size()==2) return min(triangle.get(1))+triangle.get(0).get(0);
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<triangle.size(); i++){
	            List<Integer> list = triangle.get(i);
	            if(i==0) continue;
	            else if(i==1) {
	                int n = triangle.get(0).get(0);
	                for(int j=0; j<list.size(); j++){
	                    list.set(j, list.get(j)+n);
	                }
	            }else{
	                List<Integer> list0 = triangle.get(i-1);
	                for(int j=0; j<list.size(); j++){
	                    int n0 = 0;
	                    if(j==0) n0=list0.get(0);
	                    else if(j==list.size()-1) n0=list0.get(list0.size()-1);
	                    else n0 = Math.min(list0.get(j), list0.get(j-1));
	                    int n = list.get(j)+n0;
	                    if(i==triangle.size()-1) min = Math.min(min, n);                
	                    list.set(j, n);
	                }
	            }
	        }
	        return min;
	    }
	}
}
