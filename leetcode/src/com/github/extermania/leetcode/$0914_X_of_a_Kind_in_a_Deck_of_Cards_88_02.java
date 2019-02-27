package com.github.extermania.leetcode;

public class $0914_X_of_a_Kind_in_a_Deck_of_Cards_88_02 {
	class Solution {
	    public boolean hasGroupsSizeX(int[] deck) {
	        int[] arr = new int[10001];
	        for(int i:deck){
	            arr[i]++;
	        }
	        int min = Integer.MAX_VALUE;
	        for(int i:deck) min = Math.min(arr[i], min);
	        if(min==1) return false;
	        for(int i:deck) if(isCoprime(arr[i], min)) return false;
	        return true;
	    }

	    boolean isCoprime(int x,int y){
	        int tmp=0;
	        while(true) {
	            tmp=x%y;
	            if(tmp==0) {
	                break;
	            } else {
	                x=y;
	                y=tmp;
	            }
	        }
	        return y==1;
	    }

	}
}
