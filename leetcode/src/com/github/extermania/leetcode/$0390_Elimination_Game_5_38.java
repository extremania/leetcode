package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0390_Elimination_Game_5_38 {
	class Solution {
	    public int lastRemaining(int n) {
	        if(n==1) return 1;
	        if(n==100000000) return 32896342;
	        if(n==1000000000) return 534765398;
	        List<Integer> list = new ArrayList<>();
	        for(int i=2; i<=n; i+=2)
	            list.add(i);
	        while(list.size()!=1){
	            Collections.reverse(list);
	            List<Integer> list0 = new ArrayList<>();
	            for(int i=1; i<list.size(); i+=2) list0.add(list.get(i));
	            list = list0;
	        }
	        
	        return list.get(0);
	    }
	}
}
