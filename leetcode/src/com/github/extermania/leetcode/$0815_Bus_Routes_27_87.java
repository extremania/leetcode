package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0815_Bus_Routes_27_87 {
	static class Solution {
		private static class Tree {
			Set<Integer> stations;
			Set<Tree> children;

			Tree(int[] arr) {
				stations = new HashSet<>();
				for (int i : arr) {
					stations.add(i);
				}
				children = new HashSet<>();
			}
		}

		public int numBusesToDestination(int[][] routes, int S, int T) {
	        if(S==T) return 0;
			Map<Integer, Set<Tree>> map = new HashMap<>();
			Set<Tree> all = new HashSet<>();
			for (int[] r : routes) {
				Tree tree = new Tree(r);
				for (int i : r) {
					Set<Tree> set = map.get(i);
					if (set == null) {
						set = new HashSet<>();
						map.put(i, set);
					}
					set.add(tree);
				}
				all.add(tree);
			}

			Set<Tree> starts = map.get(S);
			if (starts == null)
				return -1;

			for (Tree tree : all) {
				for (Integer i : tree.stations) {
					tree.children.addAll(map.get(i));
				}
			}

			int min = Integer.MAX_VALUE;
			for (Tree tree : starts) {
				Set<Tree> done = new HashSet<>();
				min = Math.min(min, process(tree, done, min, 1, T));
			}

			if (min == Integer.MAX_VALUE)
				return -1;
			return min;
		}

		int process(Tree tree, Set<Tree> done, int min, int cnt, int T) {
			if (done.contains(tree)) {
				return min;
			} else if (tree.stations.contains(T)) {
				return Math.min(cnt, min);
			} else {
				done.add(tree);
				int min0 = min;
				for (Tree child : tree.children) {
					min0 = Math.min(min0, process(child, done, min0, cnt + 1, T));
				}
				return min0;
			}
		}
	}
}
