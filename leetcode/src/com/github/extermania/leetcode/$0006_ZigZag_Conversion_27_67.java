package com.github.extermania.leetcode;

public class $0006_ZigZag_Conversion_27_67 {
	class Solution {
	    public String convert(String s, int numRows) {
	        if(s.length()<=1 || numRows==1) return s;
	        char[][] map = new char[numRows][s.length()];
	        int row=0;
	        int col=0;
	        boolean mode=false; //false: top-down, //true: down-top
	        for(char c:s.toCharArray()){
	            //System.out.println(c+" "+row+" "+col);
	            map[row][col]=c;
	            if(mode){
	                row--; col++;
	                if(row<=0){
	                    row=0;
	                    mode=false;
	                }
	            }else{
	                row++;
	                if(row==numRows-1){
	                    mode=true;
	                }
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<map.length; i++){
	            for(int j=0; j<map[0].length; j++){
	                if(map[i][j]!=0){
	                    sb.append(map[i][j]);
	                }
	            }
	        }
	        return sb.toString();
	    }
	}
}
