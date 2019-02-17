package com.github.extermania.leetcode;

public class $0026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int p = nums[0];
       int i = 1;
            for(int j=1; j<nums.length; j++){
                if(nums[j]>p)
                    p=nums[i++]=nums[j];
            }
            return i;
    }
}
