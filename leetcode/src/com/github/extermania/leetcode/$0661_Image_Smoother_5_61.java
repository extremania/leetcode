package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0661_Image_Smoother_5_61 {
	static class Solution {
	    static int avg(List<Integer> list){
	        int sum = 0;
	        for(int n:list) sum+=n;
	        return sum/list.size();
	    }
	    public int[][] imageSmoother(int[][] M) {
	        int[][] m = new int[M.length][M[0].length];
	        for(int i=0; i<M.length; i++){
	            for(int j=0; j<M[0].length; j++){
	                List<Integer> list = new ArrayList<>();
	                if(i>0&&j>0)list.add(M[i-1][j-1]);
	                if(i>0)list.add(M[i-1][j]);
	                if(i>0&&j<M[0].length-1)list.add(M[i-1][j+1]);
	                if(j>0)list.add(M[i][j-1]);
	                list.add(M[i][j]);
	                if(j<M[0].length-1)list.add(M[i][j+1]);
	                if(i<M.length-1&&j>0)list.add(M[i+1][j-1]);
	                if(i<M.length-1)list.add(M[i+1][j]);
	                if(i<M.length-1&&j<M[0].length-1)list.add(M[i+1][j+1]);
	                m[i][j]=avg(list);
	            }
	        }
	        return m;
	    }
	}
}
