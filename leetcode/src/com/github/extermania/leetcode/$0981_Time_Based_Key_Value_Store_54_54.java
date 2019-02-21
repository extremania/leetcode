package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class $0981_Time_Based_Key_Value_Store_54_54 {
	class TimeMap {

	    Map<String, TreeMap<Integer, String>> data;
	    
	    /** Initialize your data structure here. */
	    public TimeMap() {
	        data = new HashMap<>();
	    }
	    
	    public void set(String key, String value, int timestamp) {
	        TreeMap<Integer, String> map = data.get(key);
	        if(map==null){
	            map=new TreeMap<>();
	            data.put(key, map);
	        }
	        map.put(timestamp, value);
	    }
	    
	    public String get(String key, int timestamp) {
	        TreeMap<Integer, String> map = data.get(key);
	        if(map==null) return "";
	        Map.Entry<Integer,String> entry = map.floorEntry(timestamp);
	        if(entry==null) return "";
	        return entry.getValue();
	    }
	}
}
