package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class $1129_Shortest_Path_with_Alternating_Colors_175ms {
	class Solution {
	    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
	        
	        int[] rst = new int[n];
	        Arrays.fill(rst, -1);
	        rst[0]=0;
	        
	        
	        boolean[][] red = new boolean[n][n];
	        boolean[][] blue = new boolean[n][n];
	        
	        for(int[] r:red_edges) red[r[0]][r[1]] = true;
	        for(int[] b:blue_edges) blue[b[0]][b[1]] = true;
	        
	        f(rst, n, red_edges.length+blue_edges.length, red, blue, true);
	        f(rst, n, red_edges.length+blue_edges.length, red, blue, false);
	        
	        return rst;
	    }
	    
	    void f(int[] rst, int n, int cnt, boolean[][] red, boolean[][] blue, boolean rflag){
	        int chkcnt = 1;
	        Set<Integer> next = new HashSet<>();
	        next.add(0);
	        for(int i=1; i<=cnt; i++){
	            //System.out.println(rflag+":"+next);
	            if(next.size()==0) break;
	            Set<Integer> next0 = new HashSet<>();
	            for(int ne:next){
	                for(int j=0; j<n; j++){
	                    boolean n0 = rflag?red[ne][j]:blue[ne][j];
	                    if(n0){
	                            next0.add(j);
	                            if(rst[j]==-1) rst[j]=i;
	                            else{
	                                rst[j]=Math.min(rst[j], i);
	                                
	                            } 
	                    }  
	                }
	            }
	            rflag= !rflag;
	            next=next0; 
	        }
	    }
	}
}
