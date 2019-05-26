package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $0496_Next_Greater_Element_I_96_86 {
	class Solution {
	    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>(nums2.length);
	        for(int i=0; i<nums2.length; i++)
	            map.put(nums2[i], i);
	        int[] arr = new int[nums1.length];
	        Arrays.fill(arr, -1);
	        for(int i=0; i<nums1.length; i++){
	            int n = map.get(nums1[i]);
	            for(int j=n+1; j<nums2.length; j++){
	                if(nums2[j]>nums1[i]){
	                    arr[i]=nums2[j];
	                    break;
	                }
	            }
	        }
	        return arr;
	    }
	}
}
