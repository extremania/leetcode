package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0378_Kth_Smallest_Element_in_a_Sorted_Matrix_33_04 {
	class Solution {
	    public int kthSmallest(int[][] matrix, int k) {
	        List<Integer> list = new ArrayList<>();
	        for(int[] m:matrix) for(int n:m) list.add(n);
	        Collections.sort(list);
	        return list.get(k-1);
	    }
	}
}
