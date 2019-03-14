package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0406_Queue_Reconstruction_by_Height_8_65 {
	class Solution {
	    class P {
	        int h;
	        int k;
	        P(int h, int k){
	            this.h=h;
	            this.k=k;
	        }
	        public String toString(){
	            return h+","+k;
	        }
	    }
	    public int[][] reconstructQueue(int[][] people) {
	        List<P> list = new ArrayList<>();
	        for(int i=0; i<people.length; i++)
	            list.add(new P(people[i][0], people[i][1]));
	        Collections.sort(list, (p1, p2) -> {
	            return p1.k-p2.k; 
	        });
	       // System.out.println(list);
	        for(int i=0; i<list.size(); i++){
	            int cnt = 0;
	            P p = list.get(i);
	            for(int j=0; j<i; j++){
	                if(list.get(j).h>=p.h) cnt++;
	                if(cnt>p.k){
	                    //System.out.println(j+"=>"+p);
	                    list.remove(p);
	                    list.add(j, p);
	                    //System.out.println(list);
	                    break;
	                }
	            }
	        }
	        int[][] arr = new int[people.length][2];
	        for(int i=0; i<list.size(); i++){
	            P p = list.get(i);
	            arr[i][0]=p.h;
	            arr[i][1]=p.k;
	        }
	        return arr;
	    }
	}
}
