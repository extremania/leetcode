package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0349_Intersection_of_Two_Arrays_98_71 {
	class Solution {
	    public int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> result = new HashSet<>();
	        for(int i:nums1) set.add(i);
	        for(int i:nums2) if(set.contains(i)) result.add(i);
	        int[] arr = new int[result.size()];
	        int i=0;
	        for(int n:result) arr[i++]=n;
	        return arr;
	    }
	}
}
