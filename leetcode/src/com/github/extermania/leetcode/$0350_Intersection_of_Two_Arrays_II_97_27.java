package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0350_Intersection_of_Two_Arrays_II_97_27 {
	class Solution {
	    public int[] intersect(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int n:nums1){
	            Integer cnt = map.get(n);
	            if(cnt==null){
	                cnt=0;
	            }
	            cnt++;
	            map.put(n, cnt);
	        }
	        List<Integer> list = new ArrayList<>();
	        for(int n:nums2){
	            Integer cnt = map.get(n);
	            if(cnt!=null && cnt>0){
	                list.add(n);
	                map.put(n, --cnt);
	            }
	        }
	        int[] arr = new int[list.size()];
	        for(int i=0; i<list.size(); i++) arr[i]=list.get(i);
	        return arr;
	    }
	}
}
