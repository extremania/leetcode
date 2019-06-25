package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $1095_Find_in_Mountain_Array_21_84 {

	 // This is MountainArray's API interface.
	 // You should not implement it, or speculate about its implementation
	  interface MountainArray {
	     public int get(int index);
	      public int length();
	  }
	 
	 
	class Solution {
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    int bsrch(int target, int s, int e, MountainArray mountainArr){
	        
	        if(s>e) return -1;
	        
	        Integer vs = map.get(s);  if(vs==null) vs = mountainArr.get(s); map.put(s, vs);
	        Integer ve = map.get(e);  if(ve==null) ve = mountainArr.get(e); map.put(e, ve);
	        int m = (s+e)/2; Integer vm = map.get(m); if(vm==null) vm = mountainArr.get(m); map.put(m, vm);
	        
	        if(vs==target) return s;
	        if(ve==target) return e;
	        if(vm==target) return m;

	        if(target>vm){
	            return bsrch(target, m+1, e-1, mountainArr);
	        }else{
	            return bsrch(target, s+1, m-1, mountainArr);
	        }
	    }
	    
	    int fp(MountainArray mountainArr){
	        int p = 0; 
	        int r = mountainArr.length() - 1;
	        while(p<r){
	            int m = (p+r)/2;
	            Integer vm = map.get(m); if(vm==null) vm = mountainArr.get(m); map.put(m, vm); 
	            Integer vm1 = map.get(m+1); if(vm1==null) vm1 = mountainArr.get(m+1); map.put(m+1, vm1);
	            if(vm>vm1) r = m;
	            else p = m+1;
	        }
	        return p;
	    }

	    public int findInMountainArray(int target, MountainArray mountainArr) {
	        int p = fp(mountainArr);
	        Integer vp = map.get(p);  if(vp==null) vp = mountainArr.get(p); map.put(p, vp);
	        if(vp==target) return p;
	        int a = bsrch(target, 0, p-1, mountainArr);
	        if(a>=0) return a;
	        int b = bsrch(target, p+1, mountainArr.length()-1, mountainArr);
	        if(b>=0) return b;
	        return -1;
	    }
	}
}
