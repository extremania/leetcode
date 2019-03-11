package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $1002_Find_Common_Characters_86_19 {
	class Solution {
	    int[] merge(int[] a, int[] b){
	        int[] arr = new int[26];
	        for(int i=0; i<arr.length; i++){
	            arr[i]=Math.min(a[i], b[i]);
	        }
	        return arr;
	    }
	    public List<String> commonChars(String[] A) {
	        if(A.length==0) return Arrays.asList();
	        int[] arr = new int[26];
	        for(char c:A[0].toCharArray()) arr[c-'a']++;
	        for(int i=1; i<A.length; i++){
	            int[] arr0 = new int[26];
	            for(char c:A[i].toCharArray()) arr0[c-'a']++;
	            arr=merge(arr, arr0);
	        }
	        List<String> list = new ArrayList<>();
	        for(int i=0; i<arr.length;i++){
	            for(int j=0; j<arr[i]; j++){
	                list.add(String.valueOf((char)(i+'a')));
	            }
	        }
	        return list;
	    }
	}
}
