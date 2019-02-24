package com.github.extermania.leetcode;

public class $0717_1_bit_and_2_bit_Characters_69_40 {
	class Solution {
	    public boolean isOneBitCharacter(int[] bits) {
	        if(bits.length==0) return false;
	        if(bits.length==1) return true;
	        for(int i=0; i<bits.length; i++){
	            
	            if(i==bits.length-2) return bits[i]==0;
	            if(bits[i]==1) i++;
	            
	        }
	        return true;
	    }
	}
}
