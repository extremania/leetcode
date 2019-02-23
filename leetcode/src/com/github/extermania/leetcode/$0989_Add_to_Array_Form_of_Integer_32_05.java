package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0989_Add_to_Array_Form_of_Integer_32_05 {
	class Solution {
	    public List<Integer> addToArrayForm(int[] A, int K) {
	        char[] cs = new char[A.length];
	        for(int i=0; i<A.length; i++) cs[i]=(char)('0'+A[i]);
	        String str = new java.math.BigInteger(new String(cs)).add(new java.math.BigInteger(String.valueOf(K))).toString();
	        List<Integer> rst = new ArrayList<>();
	        for(char c:str.toCharArray()) rst.add(c-'0');
	        return rst;
	    }
	}
}
