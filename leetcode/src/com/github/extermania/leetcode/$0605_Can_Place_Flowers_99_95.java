package com.github.extermania.leetcode;

public class $0605_Can_Place_Flowers_99_95 {
	class Solution {
	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        if (n == 0)
				return true;
			if(flowerbed.length==0) return false;
			if(flowerbed.length==1) return flowerbed[0]==0 && n==1;
			int left = n;
			for (int i = 0; i < flowerbed.length; i++) {
				if (i == 0) {
					if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
						flowerbed[i]++;
						left--;
					}
				} else if (i == flowerbed.length - 1) {
					if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
						flowerbed[i]++;
						left--;
					}
				} else {
					if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
						flowerbed[i]++;
						left--;
					}
				}
				if (left == 0)
					return true;
			}
			return left == 0;
	    }
	}
}
