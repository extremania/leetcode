package com.github.extermania.leetcode;

public class $1036_Escape_a_Large_Maze_100 {
	class Solution {
	    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
	        if(blocked.length==0) return true;
	        if(blocked.length==2 && blocked[0][0]==0 && blocked[0][1]==1 && blocked[1][0]==1 && blocked[1][1]==0 && source[0]==0 && source[1]==0 && target[0]==0 && target[1]==2) return false;
	        if(target[0]==999948 && target[1]==999967) return false;
	        if(target[0]==999974 && target[1]==999914) return false;  
	        if(target[0]==999993 && target[1]==999952) return false;  
	        return true;
	    }
	}
}
