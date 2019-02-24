package com.github.extermania.leetcode;

public class $0780_Reaching_Points_8_51 {
	class Solution {

		public boolean reachingPoints(int sx, int sy, int tx, int ty) {
	        int tx0 = tx;
	        int ty0 = ty;
	        while(true){
	            if(tx0==sx && ty0==sy) return true;
	            if(tx0<sx) return false;
	            if(ty0<sy) return false;
	            if(ty0>tx0){
	                ty0-=tx0;
	            }else if(tx0>ty0){
	                tx0-=ty0;
	            }else if(tx0==ty0){
	                if(sx==0 && sy==0) return true;
	                else return false;
	            }
	        }
		}
	}
}
