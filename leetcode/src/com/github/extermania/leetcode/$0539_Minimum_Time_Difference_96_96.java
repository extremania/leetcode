package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0539_Minimum_Time_Difference_96_96 {
	class Solution {
	    Map<String, Integer> map = new HashMap<>();
	    int conv(String s){
	        Integer i = map.get(s);
	        if(i!=null) return i;
	        String hh = s.substring(0, 2);
	        String mm = s.substring(3);
	        i = Integer.parseInt(hh)*60+Integer.parseInt(mm);
	        map.put(s, i);
	        return i;
	    }
	    public int findMinDifference(List<String> timePoints) {
	        if(timePoints.size()>1440) return 0;
	        
	        boolean[] arr = new boolean[1440];
	        
	        for(String s:timePoints){
	            int i = conv(s);
	            if(arr[i]) return 0;
	            arr[i]=true;
	        }

	        int min = 1440;
	        for(int i=0; i<arr.length*2; i++){
	            if(arr[i%arr.length]){
	                int cur = 1;
	                while(!arr[(++i)%arr.length]) cur++;
	                i--;
	                //System.out.println(i);
	                min = Math.min(min, cur);
	            }
	        }
	        
	        
	        
	        return min;
	    }
	}
}
