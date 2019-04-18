package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0240_Search_a_2D_Matrix_II_100 {
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix.length==0 || matrix[0].length==0) return false;
	        for(int[] m:matrix){
	            if(m[0]==target || m[m.length-1]==target) return true;
	            if(m[0]<target && m[m.length-1]>target){
	                boolean find = Arrays.binarySearch(m, target)>0;
	                if(find) return true;
	            }
	            if(m[0]>target) return false;
	        }
	        return false;
	    }
	}
}
