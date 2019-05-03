package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class $0347_Top_K_Frequent_Elements_46_46 {
	class Solution {
	    class N{
	        int val;
	        int fre;
	         N(int val){
	            this.val = val;
	        }
	    }
	    public List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap<Integer, N> map = new HashMap<>();
	        for(int num:nums){
	            N n=map.get(num);
	            if(n==null){
	                n = new N(num);
	                map.put(num, n);
	            }
	            n.fre++;
	        }
	        List<N> vals = new ArrayList<>(map.values());
	        Collections.sort(vals, (a,b)->{
	           return b.fre-a.fre;
	        });
	        List<Integer> list = new ArrayList<>();
	        for(int i=0; i<k; i++) list.add(vals.get(i).val);
	        return list;
	    }
    }
}
