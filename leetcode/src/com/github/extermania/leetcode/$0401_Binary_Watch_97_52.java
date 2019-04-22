package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0401_Binary_Watch_97_52 {
	class Solution {
	    List<String> h(int n){
	        switch(n){
	        case 0: return Arrays.asList("0");
	        case 1: return Arrays.asList("1","2","4","8");
	        case 2: return Arrays.asList("3","5","6","9", "10");
	        case 3: return Arrays.asList("7","11");
	            default: return Arrays.asList();
	        }
	    }

	    public List<String> readBinaryWatch(int num) {
	        List<String> list = new ArrayList<>();
	        for(int i=0; i<60; i++){
	            int bc = Integer.bitCount(i);
	            int hc = num-bc;
	            if(hc>=0 && hc<=3){
	                List<String> hh = h(hc);
	                String mm = String.valueOf(i);
	                if(mm.length()==1) mm = "0"+mm;
	                for(String h:hh){
	                    list.add(h+":"+mm);
	                }
	            }
	        }
	        return list;
	    }
	}
}
