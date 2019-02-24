package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0690_Employee_Importance_44_33 {
	class Solution {
	    public int getImportance(List<Employee> employees, int id) {
	       // Map<Employee, Integer> e2im = new HashMap<>();
	        Map<Integer, Employee> id2e = new HashMap<>();
	        for(Employee e: employees){
	            //e2im.put(e, e.importance);
	            id2e.put(e.id, e); 
	        }
	        return getIm(id2e, id);
	    }
	    int getIm(Map<Integer, Employee> id2e, int id){
	        int im = 0;
	        Employee e = id2e.get(id);
	        im+=e.importance;
	        if(e.subordinates!=null){
	            for(int i:e.subordinates){
	                im+=getIm(id2e, i);
	            }
	        }
	        return im;
	    }
	}
}
