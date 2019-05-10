package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0451_Sort_Characters_By_Frequency_12_75 {
	class Solution {
		 public String frequencySort(String s) {
		        int[] arr = new int[256];
		        Character[] cs = new Character[s.length()];
		        char[] cs0 = s.toCharArray();
		        int i=0;
		        for(char c:cs0) {
		        	arr[c]++;
		        	cs[i++]=c;
		        }
		        Arrays.sort(cs, (a,b)->{
		           int r = arr[b]-arr[a];
		            if(r==0)
		                r = b-a;
		            return r;
		        });
		        i=0;
		        for(char c:cs) {
		        	cs0[i++]=c;
		        }
		        
		        return new String(cs0);
		    }
		}
}
