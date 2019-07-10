package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0599_Minimum_Index_Sum_of_Two_Lists_96_98 {
	class Solution {
	    public String[] findRestaurant(String[] list1, String[] list2) {
	        List<String> rst = new ArrayList<>();
	        int min = 2000;
	        for(int i=0; i<list1.length; i++){
	            int sum = i;
	            for(int j=0; j<list2.length; j++){
	                sum=i+j;
	                //System.out.println(i+" "+j+" "+sum);
	                if(sum>min) break;
	                //System.out.println(list1[i]+" "+list2[j]);
	                if(list1[i].equals(list2[j])){
	                    if(sum<min) rst = new ArrayList<>();
	                    rst.add(list1[i]);
	                    min = sum;
	                    break;
	                }
	            }
	        }
	        
	        return rst.toArray(new String[rst.size()]);
	       
	        
	    }
	}
}
