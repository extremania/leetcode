package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $1072_Flip_Columns_For_Maximum_Number_of_Equal_Rows_62_25 {
	class Solution {
	    String toStr(int[] arr){
	        StringBuilder sb = new StringBuilder();
	        for(int n:arr) sb.append(n);
	        return sb.toString();
	    }
	    int[] invert(int[] arr){
	        for(int i=0; i<arr.length; i++) arr[i]=(arr[i]==0?1:0);
	        return arr;
	    }
	    public int maxEqualRowsAfterFlips(int[][] matrix) {
	        if(matrix.length==0) return 0;
	        int max = 0;
	        Map<String, Integer> map = new HashMap<>();
	        
	        for(int[] arr:matrix){
	            String s1 = toStr(arr);
	            String s2 = toStr(invert(arr));
	            Integer cnt1 = map.get(s1);
	            if(cnt1==null) cnt1 = 0;
	            cnt1++;
	            map.put(s1, cnt1);
	            max = Math.max(cnt1, max);
	            Integer cnt2 = map.get(s2);
	            if(cnt2==null) cnt2 = 0;
	            cnt2++;
	            map.put(s2, cnt2);
	            max = Math.max(cnt2, max);
	        }
	        
	        return max;
	    }
	}
}
