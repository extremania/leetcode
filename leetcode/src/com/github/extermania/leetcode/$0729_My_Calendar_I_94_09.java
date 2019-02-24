package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0729_My_Calendar_I_94_09 {
	static class MyCalendar {
	    
	    private static class Range{
	        int start;
	        int end;
	        Range(int start, int end){
	            this.start = start;
	            this.end = end;
	        }
	        boolean valid(int s, int e){
	            return s < start && e <=start ||  s>=end && e > end;
	        }
	    }

	    List<Range> ranges = new ArrayList<>();
	    
	    public MyCalendar() {
	        
	    }
	    
	    public boolean book(int start, int end) {
	        for(Range r:ranges){
	            if(!r.valid(start, end)){
	                return false;
	            }
	        }
	        ranges.add(new Range(start, end));
	        return true;
	    }
	}
}
