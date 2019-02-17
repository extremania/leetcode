package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class $0056_Merge_Intervals_47_93 {
	static class Solution {
	     
	    private static boolean canMerge(Interval a, Interval b){
	        if(b.start>a.end) return false;
	        if(a.start>b.end) return false;
	        return true;
	    }
	    
	    private static Interval merge(Interval a, Interval b){
	        int[] vals = new int[]{a.start, a.end, b.start, b.end};
	        int start=a.start;
	        int end=a.start;
	        for(int val:vals){
	            start = Math.min(val, start);
	            end = Math.max(val, end);
	        }
	        return new Interval(start, end);
	    }
	    
	    private static void sort(List<Interval> intervals){
	        Collections.sort(intervals, new Comparator<Interval>(){
	            public int compare(Interval a, Interval b){
	                return a.start-b.start;
	            }
	        });
	    }
	    
	    public List<Interval> merge(List<Interval> intervals) {
	        if(intervals.size()==0) return intervals;
	        sort(intervals);
	        List<Interval> result = new ArrayList<>();
	        result.add(intervals.get(0));
	        for(int i=1; i<intervals.size(); i++){
	            Interval last = result.get(result.size()-1);
	            Interval neu = intervals.get(i);
	            if(canMerge(last,neu)){
	                Interval merge = merge(last,neu);
	                result.set(result.size()-1, merge);
	            }else{
	                result.add(neu);
	            }
	        }
	        return result;
	    }
	}
}
