package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class $0057_Insert_Interval_28_36 {
	static class Solution {
	    
	    private static boolean canMerge(Interval a, Interval b){
	        return !(a.start<b.start && a.end<b.start || b.start<a.start&&b.end<a.start); 
	    }
	    
	    private static Interval merge(Interval a, Interval b){
	        return new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end));
	    }
	    
	    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
	        List<Interval> result = new ArrayList<>();
	        if(intervals.size()==0){
	            result.add(newInterval);
	            return result;
	        }
	        Interval first = intervals.get(0);
	        if(!canMerge(first, newInterval) && newInterval.start<first.start){
	            result.add(newInterval);
	            result.addAll(intervals);
	            return result;
	        }
	        Interval last = intervals.get(intervals.size()-1);
	        if(!canMerge(last, newInterval) && newInterval.start>last.start){
	            result.addAll(intervals);
	            result.add(newInterval);
	            return result;
	        }
	        ////////////////////////////////////////////////////
	        Iterator<Interval> it=intervals.iterator();
	        boolean added=false;
	        while(it.hasNext()){
	            Interval next = it.next();
	            //  System.out.println("newInterval?"+newInterval.start+" "+newInterval.end);
	            if(canMerge(next, newInterval)){
	            //   System.out.println("can?"+next.start+" "+next.end);
	               newInterval = merge(next, newInterval);
	               //   System.out.println("merge?"+newInterval.start+" "+newInterval.end);
	                while(it.hasNext()){
	                    next = it.next();
	                    if(next.start>newInterval.start && next.start>newInterval.end){
	                       if(!added){
	                                result.add(newInterval);
	                                added=true;
	                            }
	                        result.add(next);
	                    }else{
	                        if(canMerge(newInterval, next)){
	                            newInterval = merge(next, newInterval);
	                        }else{
	                            if(!added){
	                                result.add(newInterval);
	                                added=true;
	                            }
	                            result.add(next);
	                        }
	                    }
	               }
	            }else{
	              if(next.start>newInterval.start && next.start>newInterval.end){
	                  if(!added){
	                      result.add(newInterval);
	                      added=true;
	                  }
	              }
	              //  System.out.println("can not?"+next.start+" "+next.end);
	              result.add(next);
	            }
	        }
	        if(!added){
	            result.add(newInterval);
	        }
	        return result;
	    }
	}
}
