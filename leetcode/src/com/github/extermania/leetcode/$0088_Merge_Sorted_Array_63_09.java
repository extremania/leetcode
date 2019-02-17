package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0088_Merge_Sorted_Array_63_09 {
	class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        for(int i=m,j=0; j<n; i++,j++)
	            nums1[i]=nums2[j];
	        Arrays.sort(nums1);
	    }
	}
}
