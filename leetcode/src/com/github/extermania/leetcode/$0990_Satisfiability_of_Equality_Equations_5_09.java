package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0990_Satisfiability_of_Equality_Equations_5_09 {
	class Solution {
	    public boolean equationsPossible(String[] equations) {
	        Map<String, Set<String>> map = new HashMap<>();
	        Arrays.sort(equations, (o1, o2)->{
	            boolean same1 = (o1.charAt(1)=='=');
	            boolean same2 = (o2.charAt(1)=='=');
	            if(same1 && !same2) return -1;
	            if(same2 && !same1) return 1;
	            return o1.compareTo(o2);
	        }); 
	        //System.out.println(Arrays.toString(equations));
	        for(String eq:equations){
	           // System.out.println(eq);
	           // System.out.println("b:"+map);
	            String a = String.valueOf(eq.charAt(0));
	            String b = String.valueOf(eq.charAt(3));
	            boolean same = (eq.charAt(1)=='=');
	            if(a.equals(b) && !same) return false;
	            Set<String> aset = map.get(a);
	            Set<String> bset = map.get(b);
	            if(same){
	               // System.out.println(aset);
	               // System.out.println(bset);
	                if(aset!=null && bset!=null){
	                    if(aset==bset){continue;}
	                    Set<String> mSet = new HashSet<>();
	                    mSet.addAll(aset);
	                    mSet.addAll(bset);
	                    if(mSet.size()==(aset.size()+bset.size())){
	                        aset.addAll(mSet);
	                        map.put(b, aset);
	                    }else{ 
	                        return false; 
	                    }
	                } 
	                else if(aset!=null && bset==null){ 
	                    aset.add(b); map.put(b, aset);
	                }else if(aset==null && bset!=null){ 
	                    bset.add(a); map.put(a, bset);
	                }else{
	                   // System.out.println("xxx");
	                    Set<String> nSet = new HashSet<>();
	                    nSet.add(a); nSet.add(b);
	                    map.put(a, nSet); map.put(b, nSet);
	                }
	            }else{
	                //System.out.println(aset);
	                //System.out.println(bset);
	                if((aset!=null || bset!=null) && aset==bset) return false;
	                if(aset!=null && aset.contains(b)) return false;
	                if(bset!=null && bset.contains(a)) return false;
	            }
	           // System.out.println("f:"+map);
	        }
	        
	        return true;
	    }
	}
}
