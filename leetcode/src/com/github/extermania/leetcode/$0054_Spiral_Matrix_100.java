package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0054_Spiral_Matrix_100 {
	class Solution {
	    void f(List<Integer> list, int[][] matrix, int ms, int me, int ns, int ne, int dir){
	        if(dir==0){
	            for(int i=ns; i<=ne; i++){
	                list.add(matrix[ms][i]);
	            }
	            dir=1;
	            ms++;
	        }else if(dir==1){
	            for(int i=ms; i<=me; i++){
	                list.add(matrix[i][ne]);
	            }
	            dir=2;
	            ne--;
	        }else if(dir==2){
	            for(int i=ne; i>=ns; i--){
	                list.add(matrix[me][i]);
	            }
	            dir=3;
	            me--;
	        }else if(dir==3){
	            for(int i=me; i>=ms; i--){
	                list.add(matrix[i][ns]);
	            }
	            dir=0;
	            ns++;
	        }
	        //System.out.println(list);
	        if(list.size()==matrix[0].length*matrix.length) return;
	        else f(list, matrix, ms, me, ns, ne, dir);
	    }
	    public List<Integer> spiralOrder(int[][] matrix) {
	        if(matrix.length==0) return new ArrayList<>();
	       List<Integer> list = new ArrayList<>();
	        f(list, matrix, 0, matrix.length-1, 0, matrix[0].length-1, 0);
	        return list;
	    }
	}
}
