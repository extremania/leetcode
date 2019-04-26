package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class $0352_Data_Stream_as_Disjoint_Intervals_93_46 {

	 class SummaryRanges {
	     
	     Map<Integer, Interval> smap;
	     Map<Integer, Interval> emap;
	     Set<Integer> added;

	     /** Initialize your data structure here. */
	     public SummaryRanges() {
	         smap = new TreeMap<>();
	         emap = new TreeMap<>();
	         added = new HashSet<>();
	     }
	     
	     public void addNum(int val) {
	         
	         if(added.contains(val)) return;
	         added.add(val);
	         
	         Interval s = smap.get(val+1);
	         Interval e = emap.get(val-1);
	         
	         smap.remove(val+1);
	         emap.remove(val-1);
	  
	         Interval n = new Interval(e!=null?e.start:val, s!=null?s.end:val);
	         smap.put(n.start, n);
	         emap.put(n.end, n);
	     }
	     
	     public List<Interval> getIntervals() {
	         return new ArrayList<>(smap.values());
	     }
	 }
}
