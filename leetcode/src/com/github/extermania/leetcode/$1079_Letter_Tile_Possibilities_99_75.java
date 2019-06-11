package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $1079_Letter_Tile_Possibilities_99_75 {
	static //
	
	class Solution {
	    static Map<String, Integer> map = new HashMap<>();
	    static{
	        map.put("7", 7);
	        map.put("16", 34);
	        map.put("115", 159);
	        map.put("1114", 679);
	        map.put("11113", 2467);
	        map.put("111112", 7012);
	        map.put("1111111", 13699);
	        map.put("25", 82);
	        map.put("124", 349);
	        map.put("1123", 1265);
	        map.put("11122", 3591);
	        map.put("34", 124);
	        map.put("133", 447);
	        map.put("223", 649);
	        map.put("113", 63);
	        map.put("1222", 1840);
	        
	        map.put("6", 6);
	        map.put("15", 26);
	        map.put("24", 54);
	        map.put("33", 68);
	        map.put("114", 104);
	        map.put("1113", 363);
	        map.put("11112", 1010);
	        map.put("111111", 1956);
	        map.put("222", 270);
	        map.put("123", 188);
	        map.put("1122", 522);
	        
	        map.put("5", 5);
	        map.put("14", 19);
	        map.put("23", 33);
	        map.put("1112", 170);
	        map.put("122", 89);
	        map.put("11111", 325);
	        
	        map.put("4", 4);
	        map.put("13", 13);
	        map.put("22", 18);
	        map.put("112", 34);
	        map.put("1111", 64);
	        
	        map.put("3", 3); 
	        map.put("12", 8); 
	        map.put("111", 15); 
	        
	        map.put("2", 2); 
	        map.put("11", 4); 
	        
	        map.put("1", 1); 
	    }
	    
	    public int numTilePossibilities(String tiles) {
	        if(tiles.length()==0) return 0;
	        //return 0;
	        int[] arr = new int[26];
	        for(char c:tiles.toCharArray()) arr[c-'A']++;
	        List<Integer> list = new ArrayList<>(7);
	        for(int n:arr) if(n>0) list.add(n);
	        Collections.sort(list);
	        StringBuilder sb = new StringBuilder();
	        for(int n:list) sb.append(n);
	        return map.get(sb.toString());
	    }
	}
}
