package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0506_Relative_Ranks_29_40 {
	class Solution {
	    class N{
	        int val;
	        int ind;
	        N(int val, int ind){
	            this.val=val;
	            this.ind=ind;
	        }
	    }
	    public String[] findRelativeRanks(int[] nums) {
	        N[] all = new N[nums.length];
	        for(int i=0; i<nums.length; i++)
	            all[i]=new N(nums[i], i);
	        Arrays.sort(all, (n1, n2)->{
	            return n2.val-n1.val;
	        });
	        String[] rst = new String[nums.length];
	        for(int i=0; i<all.length;i++){
	            if(i>=3) rst[all[i].ind]=String.valueOf(i+1);
	            else if(i==0) rst[all[i].ind]="Gold Medal";
	            else if(i==1) rst[all[i].ind]="Silver Medal";
	            else if(i==2) rst[all[i].ind]="Bronze Medal";
	        }
	        return rst;
	    }
	}
}
