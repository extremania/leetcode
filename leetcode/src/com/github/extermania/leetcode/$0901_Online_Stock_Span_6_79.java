package com.github.extermania.leetcode;

public class $0901_Online_Stock_Span_6_79 {
	class StockSpanner {
	    
	    int[] data;
	    int cur;
	    int max;

	    public StockSpanner() {
	        data = new int[10000];
	        cur = 0;
	        max = 0;
	    }
	    
	    public int next(int price) {
	        data[cur++] = price;
	        if(price>=max){
	            max = price;
	            return cur;
	        }
	        int n = 0;
	        for(int i=cur-1; i>=0; i--)
	            if(data[i]<=price) n++;
	            else break;
	        return n;
	    }
	}
}
