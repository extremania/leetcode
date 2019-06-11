package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1078_Occurrences_After_Bigram_95_27 {
	class Solution {
	    public String[] findOcurrences(String text, String first, String second) {
	        String[] arr = text.split(" ");
	        List<String> list = new ArrayList<>();
	        for(int i=0; i<arr.length; i++){
	            if(arr[i].equals(first)){
	                if(i==arr.length-1) break;
	                else{
	                    if(arr[i+1].equals(second)){
	                        if(i==arr.length-2) break;
	                        else list.add(arr[i+2]);
	                    }
	                }
	            }
	        }
	        String[] rst = new String[list.size()];
	        for(int i=0; i<list.size(); i++) rst[i]=list.get(i);
	        return rst;
	    }
	}
}
