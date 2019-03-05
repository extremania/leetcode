package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0315_Count_of_Smaller_Numbers_After_Self_10_61 {
	class Solution {

		public  List<Integer> countSmaller(int[] nums) {
			List<Integer> list = new ArrayList<>();
			if (nums.length == 0)
				return list;
			if (nums.length == 1)
				return Arrays.asList(0);
			for(int i=0; i<nums.length-1;i++){
	            int cnt=0;
	            for(int j=i+1; j<nums.length; j++){
	                if(nums[i]>nums[j]) cnt++;
	            }
	            list.add(cnt);
	        }
	        list.add(0);
			return list;
		}


	}
}
