package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0264_Ugly_Number_II_26_29 {
    static List<Integer> list  = new ArrayList<>();
    static{
        for(int i=0; i<50; i++)
            for(int j=0; j<30; j++)
                for(int k=0; k<20; k++)
                   list.add((int)(Math.pow(2, i)*Math.pow(3, j)*Math.pow(5, k)));
        Collections.sort(list); 
        //System.out.println(list);
    }
	class Solution {
	    
	    public int nthUglyNumber(int n) {
	        return list.get(n-1);
	    }
	}
}
