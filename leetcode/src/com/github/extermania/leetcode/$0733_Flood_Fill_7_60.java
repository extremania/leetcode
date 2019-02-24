package com.github.extermania.leetcode;

public class $0733_Flood_Fill_7_60 {
	static class Solution {
	    private static void doo(int[][] image, int sr, int sc, int newColor, int oriColor){
	        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length) return;
	        if(oriColor!=image[sr][sc]) return;
	        if(image[sr][sc]==newColor) return;
	        image[sr][sc]=newColor;
	        doo(image, sr, sc-1, newColor, oriColor);
	        doo(image, sr, sc+1, newColor, oriColor);
	        doo(image, sr-1, sc, newColor, oriColor);
	        doo(image, sr+1, sc, newColor, oriColor);
	    }
	    
	    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	        doo(image, sr, sc, newColor, image[sr][sc]);
	        return image;
	    }
}
}
