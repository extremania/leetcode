package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $1030_Matrix_Cells_in_Distance_Order_51_57 {
	class Solution {
	    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
	        if(R==0 || C==0) return null;
	        boolean[][] bb = new boolean[R][C];
	        int i=0;
	        int len = R*C;
	        Set<Integer> list = new HashSet<>();
	        list.add(r0*1000+c0);
	        int[][] rst = new int[len][2];
	        bb[r0][c0]=true;
	        while(list.size()>0){
	            Set<Integer> list0 = new HashSet<>();
	            for(Integer n:list){
	                int r = n/1000;
	                int c = n%1000;
	                rst[i++]=new int[]{r,c};
	                f(bb, r, c, n, list0);
	            }
	            list=list0;
	        }
	        return rst;
	    }
	    void f(boolean[][] bb, int r, int c, int n, Set<Integer> list0){
	        if(r>0){
	            if(!bb[r-1][c]){
	                bb[r-1][c]=true;
	                list0.add(n-1000);
	            }
	        }
	        if(c>0){
	            if(!bb[r][c-1]){
	                bb[r][c-1]=true;
	                list0.add(n-1);
	            }
	        }
	        if(r<bb.length-1){
	            if(!bb[r+1][c]){
	                bb[r+1][c]=true;
	                list0.add(n+1000);
	            }  
	        }
	       if(c<bb[0].length-1){
	            if(!bb[r][c+1]){
	                bb[r][c+1]=true;
	                list0.add(n+1);
	            }
	        }
	    }
	}
}
