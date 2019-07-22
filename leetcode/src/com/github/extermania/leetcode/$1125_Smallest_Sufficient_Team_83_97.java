package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $1125_Smallest_Sufficient_Team_83_97 {
	class Solution {
	    
		int[] best = null;

		void f(int[] rst, int target, int cur, Integer[] arr, int i) {
			if (rst.length >= best.length)
				return;
			if (cur == target)
				if (rst.length < best.length)
					best = rst;
			for (int j = i; j < arr.length; j++) {
				int next = arr[j];
				int cur0 = cur | next;
				if (cur0 == cur)
					continue;
				int[] rst0 = new int[rst.length + 1];
				System.arraycopy(rst, 0, rst0, 0, rst.length);
				rst0[rst.length] = next;
				f(rst0, target, cur0, arr, j + 1);
			}
		}

		public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {

			Map<String, Integer> map = new HashMap<>(req_skills.length);
			int n = 0;
			for (String s : req_skills)
				map.put(s, n++);

			int target = (1 << req_skills.length) - 1;

			Set<Integer> set = new HashSet<>();
			Map<Integer, Integer> imap = new HashMap<>();
	        
	        // Collections.sort(people, (a,b)->{
	        //     return b.size()-a.size(); 
	        // });
	        
			for (int i = 0; i < people.size(); i++) {
				if (people.size() == 0)
					continue;
				int bin = toBin(map, people.get(i));
	            add(set, bin);
				imap.put(bin, i);
			}

			Integer[] arr = new Integer[set.size()];
			n = 0;
			for (int a : set)
				arr[n++] = a;

			best = new int[req_skills.length + 1];

			Arrays.sort(arr, Comparator.reverseOrder());

			// System.out.println(toString(target, req_skills.length));
			// System.out.println("--------------------");
			// for (int a : arr)
			// System.out.println(toString(a, req_skills.length));

			f(new int[0], target, 0, arr, 0);
			int[] rst = new int[best.length];
			for (int i = 0; i < best.length; i++)
				rst[i] = imap.get(best[i]);

			return rst;
		}

		// String toString(Integer i, int len) {
		// String s = Integer.toBinaryString(i);
		// while (s.length() < len)
		// s = "0" + s;
		// return s;
		// }

		void add(Set<Integer> set, int n) {
			for (int s : set)
				if ((s | n) == s)
					return;
			set.add(n);
		}

		int toBin(Map<String, Integer> map, List<String> p) {
			int b = 0;
			for (String s : p)
				b += Math.pow(2, map.get(s));
			return b;
		}

	    
	}
}
