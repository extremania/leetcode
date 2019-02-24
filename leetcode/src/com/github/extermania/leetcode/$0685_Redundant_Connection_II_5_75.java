package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0685_Redundant_Connection_II_5_75 {
	static class Solution {
	    
	    private static boolean valid(int[] start, int[] end, int s, int e){
	       
	        boolean startHasZero = false;
	        boolean endHasZero = false;
	        boolean endHasTwo = false;
	        // System.out.println(Arrays.toString(start));
	        // System.out.println(Arrays.toString(end));
	        for(int i=1; i<start.length;i++){
	            if(start[i]==0 && end[i]==0) return false;
	            if(start[i]==0) startHasZero = true;
	            if(end[i]==0) endHasZero = true;
	            if(end[i]==2) endHasTwo = true;
	        }
	        //System.out.println(s+" "+e);
	        // System.out.println(startHasZero+" "+endHasZero+" "+endHasTwo);
	        return startHasZero && endHasZero && !endHasTwo;
	    }
	    
	    // private static int[][] copy(int[][] edges){
	    //     int[] start = new int[edges.length+1];
	    //     int[] end = new int[edges.length+1];
	    //     for(int[] edge:edges){
	    //         start[edge[0]]++;
	    //         end[edge[1]]++;
	    //     }
	    //     return new int[][]{start, end};
	    // }
	    
	    public int[] findRedundantDirectedConnection(int[][] edges) {
	        
	        List<int[]> pair = new ArrayList<>();
	        Set<String> set = new HashSet<>();
	        for(int[] edge : edges){
	           if(set.contains(edge[1]+"-"+edge[0])){
	               pair.add(new int[]{edge[1], edge[0]});
	               pair.add(edge);
	           }else{
	               set.add(edge[0]+"-"+edge[1]);
	           }
	        }
	        int[][] edges0 = edges;
	        if(pair.size()!=0){
	            edges0 = new int[][]{pair.get(0), pair.get(1)};
	        }
	        
	        int[] start = new int[edges.length+1];
	        int[] end = new int[edges.length+1];
	        for(int[] edge:edges){
	            start[edge[0]]++;
	            end[edge[1]]++;
	        }
	        
	        for(int i=edges0.length-1; i>=0; i--){
	            int[] edge = edges0[i];
	            //int[][] copy = copy(edges);
	            //int[] start = copy[0];
	            //int[] end = copy[1];
	            
	            int s = edge[0];
	            int e = edge[1];
	            
	             start[s]--;
	             end[e]--;
	            
	            if(valid(start, end, s, e)){
	                return edge;
	            }
	            
	             start[s]++;
	             end[e]++;
	        }

	        return new int[]{0, 0};
	    }
	}
}
