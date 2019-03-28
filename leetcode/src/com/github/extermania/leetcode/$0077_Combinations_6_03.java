package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0077_Combinations_6_03 {
	class Solution {
	    void f(List<List<Integer>> rst, int n, int k, List<Integer> cur){
	        if(cur.size()==k){
	            rst.add(new ArrayList<>(cur));
	        }else{
	            int s = cur.size()>0?cur.get(cur.size()-1)+1:1;
	            for(int i=s; i<=n; i++){
	                     List<Integer> set = new ArrayList<>();
	                     set.addAll(cur);
	                     set.add(i);
	                     f(rst, n, k, set);
	            }
	        }
	    }
	    public List<List<Integer>> combine(int n, int k) {
	        if(n==k){
	            List<Integer> a = new ArrayList<>();
	            for(int i=1; i<=n; i++) a.add(i);
	            return Arrays.asList(a);
	        }
	        List<List<Integer>> rst = new ArrayList<>();
	        f(rst, n, k, new ArrayList<>());
	        return rst;
	    }
	    
	}
}
