package com.github.extermania.leetcode;

public class $1103_Distribute_Candies_to_People_89_42 {
	class Solution {
	    public int[] distributeCandies(int candies, int num_people) {
	        int[] arr = new int[num_people];
	        int i=0;
	        int left = candies;
	        int cur=0;
	        while(true){
	            cur++;
	            if(cur>=left){
	                arr[i++]+=left;
	                return arr;
	            }
	            arr[i++]+=cur;
	            left-=cur;
	            if(i==num_people) i=0;
	        }
	    }
	}
}
