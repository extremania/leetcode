package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0728_Self_Dividing_Numbers_19_68 {
	class Solution {
	    public List<Integer> selfDividingNumbers(int left, int right) {
			List<Integer> list = new ArrayList<>();
			for (int i = left; i <= right; i++) {
				String str = String.valueOf(i);
				boolean y = true;
				for (char c : str.toCharArray()) {
					if (c == '0') {
						y = false;
						break;
					}
				}

				if (!y)
					continue;

				int j = i;
				int d = j % 10;

				while (d != 0) {
					//System.out.println(i + " " + j + " " + d);
					if (i % d != 0) {
						y = false;
						break;
					}
					j /= 10;
					d = j % 10;
				}
				if (y)
					list.add(i);
			}
	        return list;
	}
	}
}
