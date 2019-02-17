package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.List;

public class $0135_Candy_83_38 {
	class Solution {
		public  int candy(final int[] ratings) {
			if (ratings.length <= 1)
				return ratings.length;
			// int min = ratings[0];
			// for (int i = 1; i < ratings.length; i++) {
			// if (ratings[i] < min)
			// min = ratings[i];
			// }
			// List<Integer> minis = new ArrayList<>();
			// for (int i = 0; i < ratings.length; i++) {
			// if (ratings[i] == min)
			// minis.add(i);
			// }

			int cnt = 0;

			final int[] arr = new int[ratings.length];

			final List<Integer> minis = Arrays.asList(0, ratings.length - 1);

			for (final int mini : minis) {
				for (int i = mini - 1; i >= 0; i--) {
					if (ratings[i] > ratings[i + 1]) {
	                    if(arr[i] <= arr[i + 1]){
	                        arr[i] =  arr[i + 1]+1; 
	                    }
					}
				}
				for (int i = mini + 1; i < ratings.length; i++) {
					if (ratings[i] > ratings[i - 1]) {
	                      if(arr[i] <= arr[i - 1]){
	                          arr[i] =  arr[i - 1]+1; 
	                      }
					}
				}
			}

			//System.out.println(Arrays.toString(arr));

			for (final int i : arr) {
				cnt += i;
			}

			//System.out.println(cnt);

			return cnt + arr.length;
		}
	}
}
