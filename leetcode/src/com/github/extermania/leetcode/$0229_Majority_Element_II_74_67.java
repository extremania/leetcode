package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0229_Majority_Element_II_74_67 {
	class Solution {
	    public List<Integer> majorityElement(int[] nums) {
	        if(nums.length==0) return Arrays.asList();
	        Arrays.sort(nums);
	        List<Integer> rst = new ArrayList<>();
	        float t=nums.length/3f;
	        int cnt = 1;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i]!=nums[i+1]){
	                if(cnt>t) rst.add(nums[i]);
	                cnt=0;
	            }
	            cnt++;
	        }
	        //System.out.println(cnt+" "+t);
	        if(cnt>t) rst.add(nums[nums.length-1]);
	        
	        return rst;
	    }
	}
}
