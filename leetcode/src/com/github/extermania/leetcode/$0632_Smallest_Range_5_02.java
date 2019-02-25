package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0632_Smallest_Range_5_02 {
	static class Solution {
		private static class N implements Comparable<N> {
			int val;
			int idx;

			N(int val, int idx) {
				this.val = val;
				this.idx = idx;
			}

			@Override
			public int compareTo(N o) {
				return this.val - o.val;
			}

			@Override
			public String toString() {
				return this.val + " " + this.idx;
			}
		}

		public  int[] smallestRange(List<List<Integer>> nums) {
			List<N> list = new ArrayList<>();
	        
	        if(nums.size()==1){
	            return new int[]{nums.get(0).get(0), nums.get(0).get(0)};
	        }

			for (int i = 0; i < nums.size(); i++) {
				List<Integer> l = nums.get(i);
				for (Integer n : l)
					list.add(new N(n, i));
			}

			Collections.sort(list);

			//System.out.println(list);

			int min = Integer.MAX_VALUE;
			int start = Integer.MIN_VALUE;

			for (int i = 0; i < list.size(); i++) {
				int[] arr = new int[nums.size()];
				int cnt = 1;
				N first = list.get(i);
				arr[first.idx] = 1;

				for (int j = i + 1; j < list.size(); j++) {
					N next = list.get(j);
					if (next.val - first.val > min) {
						break;
					}
					if (arr[next.idx] == 0) {
						cnt++;
						arr[next.idx] = 1;
						if (cnt == nums.size()) {
							int dest = next.val - first.val;
							if (dest < min) {
								min = dest;
								start = first.val;
							}
							break;
						}
					}
				}
			}
			return new int[] { start, start + min };
		}


	}
}
