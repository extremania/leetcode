package com.github.extermania.leetcode;

public class $0949_Largest_Time_for_Given_Digits_100 {
	class Solution {
	    boolean valid(int[] a){
	        return (a[0]*10+a[1])<24 && (a[2]*10+a[3])<60;
	    }
	    int compare(int[] a, int[] b){
	        return (a[0]*1000+a[1]*100+a[2]*10+a[3]) -
	               (b[0]*1000+b[1]*100+b[2]*10+b[3]);
	        // return a[0]-b[0]<0?-1:
	        //              (
	        //                  a[1]-b[1]<0?-1:
	        //                  (
	        //                      a[2]-b[2]<0?-1:
	        //                      (
	        //                          a[3]-b[3]
	        //                      )
	        //                  )
	        //              );
	    }
	    public String largestTimeFromDigits(int[] A) {
	        int[][] arr = new int[][]{
	            {A[0], A[1], A[2], A[3]},
	            {A[0], A[1], A[3], A[2]},
	            {A[0], A[2], A[1], A[3]},
	            {A[0], A[2], A[3], A[1]},
	            {A[0], A[3], A[1], A[2]},
	            {A[0], A[3], A[2], A[1]},

	            {A[1], A[0], A[2], A[3]},
	            {A[1], A[0], A[3], A[2]},
	            {A[1], A[2], A[0], A[3]},
	            {A[1], A[2], A[3], A[0]},
	            {A[1], A[3], A[0], A[2]},
	            {A[1], A[3], A[2], A[0]},
	            
	            {A[2], A[1], A[0], A[3]},
	            {A[2], A[1], A[3], A[0]},
	            {A[2], A[0], A[1], A[3]},
	            {A[2], A[0], A[3], A[1]},
	            {A[2], A[3], A[1], A[0]},
	            {A[2], A[3], A[0], A[1]},
	            
	            {A[3], A[1], A[2], A[0]},
	            {A[3], A[1], A[0], A[2]},
	            {A[3], A[2], A[1], A[0]},
	            {A[3], A[2], A[0], A[1]},
	            {A[3], A[0], A[1], A[2]},
	            {A[3], A[0], A[2], A[1]},
	        };
	        
	        int[] min = null;
	        for(int[] i:arr){
	            if(!valid(i)) continue;
	            if(min==null) min=i;
	            else min = (compare(min, i)<0?i:min);
	            //System.out.println(Arrays.toString(min));
	        }
	        
	        return min==null?"":""+min[0]+min[1]+":"+min[2]+min[3];
	    }
	}
}
