package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $1001_Grid_Illumination_99ms {
	class Solution {
	    class Point{
	        int x; int y;
	        Point(int x, int y){this.x=x; this.y=y;}
	        public boolean equals(Object o){
	            Point p = (Point) o;
	            return p.x==this.x && p.y==this.y;
	        }
	        public int hashCode(){return this.x+this.y;}
	    }
	    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
	        Set<Point> ps = new HashSet<>();
	        Map<Integer, Integer> xMap = new HashMap<>();
	        Map<Integer, Integer> yMap = new HashMap<>();
	        Map<Integer, Integer> xyMap = new HashMap<>(); //x+y
	        Map<Integer, Integer> yxMap = new HashMap<>(); //y-x
	        for(int[] lamp:lamps){
	            int x = lamp[0]; int y = lamp[1];
	            ps.add(new Point(x, y));
	            Integer cnt = null;
	            int xy = x+y; int yx = y-x;
	            cnt = xMap.get(x); if(cnt==null){cnt=0;} cnt++; xMap.put(x, cnt);
	            cnt = yMap.get(y); if(cnt==null){cnt=0;} cnt++; yMap.put(y, cnt);
	            cnt = xyMap.get(xy); if(cnt==null){cnt=0;} cnt++; xyMap.put(xy, cnt);
	            cnt = yxMap.get(yx); if(cnt==null){cnt=0;} cnt++; yxMap.put(yx, cnt);
	        }
	        int[] rst = new int[queries.length];
	        for(int i=0; i<queries.length; i++){
	            int[] q = queries[i];
	            int x = q[0]; int y = q[1];
	            int xy = x+y; int yx = y-x;
	            rst[i] = xMap.containsKey(x) || yMap.containsKey(y) || xyMap.containsKey(xy) || yxMap.containsKey(yx)?1:0;
	            adjust(ps, xMap, yMap, xyMap, yxMap, x, y, xy, yx, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x, y-1, xy-1, yx-1, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x, y+1, xy+1, yx+1, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x-1, y, xy-1, yx-1, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x+1, y, xy+1, yx+1, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x-1, y-1, xy-2, yx, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x-1, y+1, xy, yx+2, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x+1, y-1, xy, yx-2, N);
	            adjust(ps, xMap, yMap, xyMap, yxMap, x+1, y+1, xy+2, yx, N);
	        }
	        return rst;
	    }
	    void adjust(
	        Set<Point> ps, 
	        Map<Integer, Integer> xMap, 
	        Map<Integer, Integer> yMap,  
	        Map<Integer, Integer> xyMap, 
	        Map<Integer, Integer> yxMap,
	        int x, int y, int xy, int yx,
	        int N
	    ){
	        //if(x<0 || y<0 || x>=N || y>=N) return;
	        Point p = new Point(x,y);
	        if(ps.contains(p)){
	            ps.remove(p);
	            Integer cnt = null;
	            cnt = xMap.get(x); 
	            if(cnt!=null){
	                if(--cnt==0){ xMap.remove(x);}
	                else {xMap.put(x, cnt);}
	            } 
	            cnt = yMap.get(y); 
	            if(cnt!=null){
	                if(--cnt==0){ yMap.remove(y);}
	                else {yMap.put(y, cnt);}
	            } 
	            cnt = xyMap.get(xy); 
	            if(cnt!=null){
	                if(--cnt==0){ xyMap.remove(xy);}
	                else {xyMap.put(xy, cnt);}
	            } 
	            cnt = yxMap.get(yx); 
	            if(cnt!=null){
	                if(--cnt==0){ yxMap.remove(yx);}
	                else {yxMap.put(yx, cnt);}
	            } 
	        }
	    }
	}
}
