package com.github.extermania.leetcode;

public class $1052_Grumpy_Bookstore_Owner_88_82 {
	class Solution {
	    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
	        int no = 0;
	        int len = grumpy.length;
	        for(int i=0; i<len; i++)
	            if(grumpy[i]==0) no+=customers[i];
	       
	        if(X>=len){
	            for(int i=0; i<len; i++)
	            if(grumpy[i]==1) no+=customers[i];
	            return no;
	        }
	        
	       //System.out.println(no);
	        
	        int max = 0;
	        int cur = 0;
	        for(int i=0; i<=len-X; i++){
	            if(i==0){
	                for(int j=0; j<=X-1; j++)
	                   if(grumpy[j]==1) max+=customers[j];
	                cur = max;
	                //System.out.println(cur);
	            }else{
	                if(grumpy[i-1]==1) cur-=customers[i-1];
	                if(grumpy[i+X-1]==1) cur+=customers[i+X-1];
	               // System.out.println(cur);
	                max = Math.max(max, cur);
	            }
	        }
	        
	        return no+max; 
	    }
	}
}
