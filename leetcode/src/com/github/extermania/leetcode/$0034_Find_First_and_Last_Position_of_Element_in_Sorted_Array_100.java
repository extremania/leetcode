package com.github.extermania.leetcode;

public class $0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array_100 {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        if(nums.length==0){
	             return new int[]{-1,-1};
	        }
	        else if(nums.length==1){
	            if(nums[0]==target) return new int[]{0,0};
	            else return new int[]{-1,-1};
	        }
	        int s = 0;
	        int e = nums.length-1;
	        int ss = 0;
	       
	        while(s<e){
	            if(s==e && nums[s]!=target) return new int[]{-1, -1};
	            if(s==e-1){
	                if(nums[s]!=target && nums[e]!=target)  return new int[]{-1, -1};
	                else if(nums[s]==target){
	                    ss = s; break;
	                }else if(nums[e]==target){
	                    ss = e; break;
	                }
	            }
	            int mid = (s+e)/2;
	            if(nums[mid]==target){
	                ss = mid;
	                break;
	            }else if(nums[mid]<target){
	                s = mid;
	            }else{
	                e = mid;
	            }
	        }
	        int ee = ss;
	        for(int i=ss+1; i<nums.length; i++){
	            if(nums[i]==target) ee++;
	        }
	        for(int i=ss-1; i>=0; i--){
	            if(nums[i]==target) ss--;
	        }
	      
	        return new int[]{ss, ee};
	    }
	}
}
