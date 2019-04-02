package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0119_Pascals_Triangle_II_84_38 {
	class Solution {
	    List<Integer> f(List<Integer> pre){
	        List<Integer> list = new ArrayList<>();
	        for(int i=0; i<=pre.size(); i++){
	            if(i==0 || i==pre.size()) list.add(pre.get(0));
	            else list.add(pre.get(i)+pre.get(i-1));
	        }
	        return list;
	    }
	    public List<Integer> getRow(int rowIndex) {
	        if(rowIndex==0) return Arrays.asList(1);
	        if(rowIndex==1) return Arrays.asList(1, 1);
	        List<Integer> list = Arrays.asList(1, 2, 1);
	        for(int i=1; i<rowIndex-1; i++)
	            list = f(list);
	        return list;
	    }
	}
}
