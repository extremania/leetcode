package com.github.extermania.leetcode;

public class $0121_Best_Time_to_Buy_and_Sell_Stock_9_82 {
	class Solution {
	    public int maxProfit(int[] prices) {
	        int max = 0;
	        for(int i=0; i<prices.length-1; i++)
	            for(int j=i+1; j<prices.length; j++)
	                max = Math.max(prices[j]-prices[i], max);
	        return max;
	    }
	}
}
