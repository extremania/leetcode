package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $1122_Relative_Sort_Array_9_40 {
	class Solution {
	    public int[] relativeSortArray(int[] arr1, int[] arr2) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int i=0;
	        for(int a:arr2) map.put(a, i++);
			List<Integer> list = new ArrayList<>(arr1.length);
	        for(int a:arr1) list.add(a);
	        Collections.sort(list, (a, b)->{
	            Integer a0 = map.get(a);
	            Integer b0 = map.get(b);
	            if(a0==null && b0==null) return a-b;
	            else if(a0==null) return 1;
	            else if(b0==null) return -1;
	            return a0-b0;
	        }); 
	        int[] arr = new int[list.size()]; i=0;
	        for(int a:list) arr[i++]=a;
	        return arr;
	    }
	}
}
