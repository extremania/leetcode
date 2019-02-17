package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0155_Min_Stack_18_63 {
	class MinStack {

	    List<Integer> list = new ArrayList<>();
	    int min=Integer.MAX_VALUE;
	    int minCnt=0;
	    
	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int x) {
	        if(list.size()==0){
	            min = x;
	            minCnt=1;
	        }else{
	           if(x==min) minCnt++;
	           else if(x<min){
	               min=x;
	               minCnt=1;
	           }
	        }
	        list.add(x);
	    }
	    
	    public void pop() {
	        if(list.size()==0) return;
	        int r = list.remove(list.size()-1);
	        if(r==min){
	            minCnt--;
	        }
	        if(minCnt==0){
	            min=Integer.MAX_VALUE;
	            minCnt=1;
	            for(int i:list){
	                min=Math.min(min, i);
	            }
	        }
	    }
	    
	    public int top() {
	        return list.get(list.size()-1);
	    }
	    
	    public int getMin() {
	        return min;
	    }
	}
}
