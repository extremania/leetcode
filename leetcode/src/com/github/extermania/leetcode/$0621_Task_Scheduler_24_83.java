package com.github.extermania.leetcode;

public class $0621_Task_Scheduler_24_83 {
	class Solution {
	    public int leastInterval(char[] tasks, int n) {
	        int[] cnts = new int[26];
	        int[] states = new int[26];
	        for(char c:tasks) cnts[c-'A']++;
	        int rst = 0;
	        for(int i=0; i<tasks.length;){
	            int next = next(cnts, states);
	            //System.out.println(next);
	            idle(states);
	            if(next>=0) {
	                states[next]=n;
	                cnts[next]--;
	                i++;
	            }
	            rst++;
	        }
	        return rst;
	    }
	    int next(int[] cnts, int[] states){
	        int min = 10000;
	        int next = -1;
	        for(int s:states)
	            min = Math.min(s, min);
	        if(min>0) return next;
	        int mc = 0;
	        for(int i=0; i<states.length; i++){
	            if(states[i]==min){
	                if(cnts[i]>mc){
	                    mc = cnts[i];
	                    next = i;
	                }
	            }
	        }
	        return next;
	    }
	    void idle(int[] states){
	        for(int i=0; i<states.length; i++) if(states[i]>0) states[i]--;
	    }
	}
}
