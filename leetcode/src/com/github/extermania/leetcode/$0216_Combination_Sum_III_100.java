package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0216_Combination_Sum_III_100 {
	class Solution {
	    void f(List<List<Integer>> rst, List<Integer> cur, int k, int n){
	       // System.out.println(cur+" "+k+" "+n);
	        if(k==0 && n==0){
	            rst.add(cur);
	            return;
	        }
	        for(int i=cur.size()==0?1:cur.get(cur.size()-1)+1; i<=n && i<=9; i++){
	            //System.out.println(i);
	            List<Integer> cur0 = new ArrayList<>(cur);
	            cur0.add(i);
	            f(rst, cur0, k-1, n-i);
	        }
	    }
	    public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> rst = new ArrayList<>();
	        f(rst, new ArrayList<>(), k, n);
	        return rst;
	    }
	}
}
