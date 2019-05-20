package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $1046_Last_Stone_Weight_49_48 {
	class Solution {
	    public int lastStoneWeight(int[] stones) {
	        List<Integer> list = new ArrayList<>();
	        for(int n:stones) list.add(n);
	        while(list.size()>1){
	            Collections.sort(list);
	           Integer a = list.remove(list.size()-1);
	           Integer b = list.remove(list.size()-1);
	            if(a!=b){
	                int c = a-b;
	                list.add(0, c);
	            }
	        }
	        return list.size()==0?0:list.get(0);
	    }
	}
}
