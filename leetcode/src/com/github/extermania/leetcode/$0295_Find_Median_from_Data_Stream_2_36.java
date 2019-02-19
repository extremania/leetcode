package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0295_Find_Median_from_Data_Stream_2_36 {
	class MedianFinder {

		private boolean even = true;
		private int n1 = 0;
		private int n2 = -1;
		private List<Integer> list = new ArrayList<>();

		public MedianFinder() {

		}

		public void addNum(int num) {
			list.add(num);
			if (even) {
				n2++;
				even = false;
			} else {
				n1++;
				even = true;
			}
		}

		public double findMedian() {
			Collections.sort(list);
			return (new Double(list.get(n1)) + new Double(list.get(n2))) / 2;
		}
	}
}
