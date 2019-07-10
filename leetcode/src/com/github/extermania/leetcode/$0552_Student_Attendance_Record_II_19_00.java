package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0552_Student_Attendance_Record_II_19_00 {
	static//
	class Solution {
	    static Map<Integer, Long> map = new HashMap<>();
	    long f(int n, int prevl, boolean onea){
	        Integer key = (n*100000+prevl)*(onea?1:-1);
	        if(map.containsKey(key)) return map.get(key);
	        if(n==1){
	            long rst = 1;
	            if(prevl<2) rst++;
	            if(!onea) rst++;
	            return rst;
	        }
	        long r = 0;
	        if(prevl==0){
	            if(onea){
	                r+=f(n-1, 0, true); //p
	                r+=f(n-1, 1, true); //l
	            }else{
	                r+=f(n-1, 0, false); //p
	                r+=f(n-1, 1, false); //l
	                r+=f(n-1, 0, true); //a
	            }
	        }else if(prevl==1){
	            if(onea){
	                r+=f(n-1, 0, true); //p
	                r+=f(n-1, 2, true); //l
	            }else{
	                r+=f(n-1, 0, false); //p
	                r+=f(n-1, 2, false); //l
	                r+=f(n-1, 0, true); //a
	            }
	        }else if(prevl==2){
	            if(onea){
	                r+=f(n-1, 0, true); //p
	            }else{
	                r+=f(n-1, 0, false); //p
	                r+=f(n-1, 0, true); //a
	            }
	        }
	        r%=1000000007;
	        map.put(key, r);
	        return r;
	    }
	    public int checkRecord(int n) {
	        long r = f(n, 0, false);
	        return (int) r%1000000007;
	    }
	}
}
