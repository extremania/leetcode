package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $0310_Minimum_Height_Trees_11_35 {
	class Solution {
	    
	    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
	        
	        if(n==1) return Arrays.asList(0);
	        if(edges.length==1) return Arrays.asList(edges[0][0], edges[0][1]);
	        
	        Map<Integer, Set<Integer>> map = new HashMap<>();
	        for(int[] edge:edges){
	            int a = edge[0]; int b = edge[1];
	            Set<Integer> seta = map.get(a);
	            if(seta==null){
	                seta = new HashSet<>();
	                map.put(a, seta);
	            }
	            seta.add(b);
	            Set<Integer> setb = map.get(b);
	            if(setb==null){
	                setb = new HashSet<>();
	                map.put(b, setb);
	            }
	            setb.add(a);
	        }
	        
	        while(map.size()>2){
	            Set<Integer> leaves = new HashSet<>();
	            Iterator<Integer> it = map.keySet().iterator();
	            while(it.hasNext()){
	                Integer next = it.next();
	                if(map.get(next).size()==1) 
	                    //map.remove(next);
	                    leaves.add(next);
	            }
	            for(Integer leaf:leaves)
	                map.remove(leaf);
	            for(Set<Integer> set:map.values())
	                set.removeAll(leaves);
	        }
	        
	     
	        return new ArrayList<>(map.keySet());
	    }
	    
	  
	}
}
