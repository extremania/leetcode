package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class $1101_The_Earliest_Moment_When_Everyone_Become_Friends_6_94 {
	class Solution {
	    public int earliestAcq(int[][] logs, int N) {
	        Arrays.sort(logs, (a, b)->{
	            return a[0]-b[0];
	        });
	        Set[] sets = new Set[N];
	        for(int i=0; i<N; i++){
	            sets[i] = new HashSet<>();
	            sets[i].add(i);
	        }
	        //System.out.println(Arrays.toString(logs));
	        for(int[] log:logs){
	            //System.out.println(Arrays.toString(sets));
	            int t = log[0];
	            int a = Math.min(log[1], log[2]);
	            int b = Math.max(log[1], log[2]);
	            sets[a].addAll(sets[b]);
	            for(Object aa:sets[a]) sets[(int)aa]=sets[a];
	            if(sets[a].size()==N) return t;
	        }
	        return -1;
	    }
	}
}
