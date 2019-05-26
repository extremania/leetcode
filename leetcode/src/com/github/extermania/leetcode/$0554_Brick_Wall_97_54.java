package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0554_Brick_Wall_97_54 {
	class Solution {
	    public int leastBricks(List<List<Integer>> wall) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int max = 0;
	        for(List<Integer> row:wall){
	            int gap = 0;
	            for(int i=0; i<row.size()-1; i++){
	                gap = gap+row.get(i);
	                Integer cnt = map.get(gap);
	                if(cnt==null) cnt = 0;
	                max = Math.max(max, ++cnt);
	                map.put(gap, cnt);
	            }
	        }
	        //System.out.println(map);
	        return wall.size()-max;
	    }
	}
}
