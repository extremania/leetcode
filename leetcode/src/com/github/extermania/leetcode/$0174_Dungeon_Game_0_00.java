package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0174_Dungeon_Game_0_00 {
	static class Solution {
		private static class FineList {
			Map<Integer, Node> valMap;
			Map<Integer, Node> xMap;

			FineList() {
				valMap = new HashMap<>();
				xMap = new HashMap<>();
			}

			Set<Node> values() {
				final Set<Node> set = new HashSet<>();
				for (final Node node : valMap.values()) {
					if (xMap.containsValue(node))
						set.add(node);
				}
				return set;
			}

			void add(final Node node) {
				Node n = valMap.get(node.val);
				if (n == null) {
					valMap.put(node.val, node);
				} else {
					if (n.x < node.x) {
						valMap.put(node.val, node);
					}
				}

				n = xMap.get(node.x);
				if (n == null) {
					xMap.put(node.x, node);
				} else {
					if (n.val > node.val) {
						xMap.put(node.x, node);
					}
				}
			}

			@Override
			public String toString() {
				return values().toString();
			}
		}

		private static class Node {
			final int val;
			final int x;

			Node(final int val, final int x) {
				this.val = val;
				this.x = x;
			}

			@Override
			public String toString() {
				return val + "_" + x;
			}
		}

		private static class P {
			final int col;
			final int row;

			P(final int row, final int col) {
				this.row = row;
				this.col = col;
			}

			@Override
			public boolean equals(final Object o) {
				final P p = (P) o;
				return this.row == p.row && this.col == p.col;
			}

			@Override
			public int hashCode() {
				return row * 10000 + col;
			}

			@Override
			public String toString() {
				return row + "_" + col;
			}

		}

		public  int calculateMinimumHP(final int[][] dungeon) {
			if (dungeon.length == 0)
				return 0;
			if (dungeon.length == 1 && dungeon[0].length == 1) {
				return dungeon[0][0] > 0 ? 1 : 1 - dungeon[0][0];
			}
			Map<P, FineList> map = new HashMap<>();
			final P p00 = new P(0, 0);
			final FineList nodes = new FineList();
			nodes.add(new Node( //
					dungeon[0][0] > 0 ? 1 : 1 - dungeon[0][0], //
					dungeon[0][0] > 0 ? dungeon[0][0] + 1 : 1));
			map.put(p00, nodes);

			//System.out.println(map);

			final P dest = new P(dungeon.length - 1, dungeon[0].length - 1);

			while (true) {
				Map<P, FineList> map0 = new HashMap<>();

				for (final Map.Entry<P, FineList> entry : map.entrySet()) {
					final P p = entry.getKey();
					final FineList fl = entry.getValue();

					for (final Node node : fl.values()) {

						if (p.col != dungeon[0].length - 1) {
							final P rp = new P(p.row, p.col + 1);
							int val = 0;
							int x = 0;
							if (dungeon[p.row][p.col + 1] >= 0) {
								val = node.val;
								x = node.x + dungeon[p.row][p.col + 1];
							} else {
								if (node.x + dungeon[p.row][p.col + 1] <= 0) {
									x = 1;
									val = node.val - (node.x + dungeon[p.row][p.col + 1]) + 1;
								} else {
									val = node.val;
									x = (node.x + dungeon[p.row][p.col + 1]);
								}
							}
							final Node rNode = new Node(val, x);
							FineList list = map0.get(rp);
							if (list == null) {
								list = new FineList();
								map0.put(rp, list);
							}
							list.add(rNode);
						}
						if (p.row != dungeon.length - 1) {
							final P dp = new P(p.row + 1, p.col);

							int val = 0;
							int x = 0;
							if (dungeon[p.row + 1][p.col] >= 0) {
								val = node.val;
								x = node.x + dungeon[p.row + 1][p.col];
							} else {
								if (node.x + dungeon[p.row + 1][p.col] <= 0) {
									x = 1;
									val = node.val - (node.x + dungeon[p.row + 1][p.col]) + 1;
								} else {
									val = node.val;
									x = (node.x + dungeon[p.row + 1][p.col]);
								}
							}
							final Node dNode = new Node(val, x);
							FineList list = map0.get(dp);
							if (list == null) {
								list = new FineList();
								map0.put(dp, list);
							}
							list.add(dNode);
						}
					}
				}

				//System.out.println(map0);

				final FineList n = map0.get(dest);
				if (n != null) {
					int min = Integer.MAX_VALUE;
					for (final Node nn : n.values()) {
						min = Math.min(min, nn.val);
					}
					return min;
				}

				map = map0;
				map0 = null;
			}
		}
	}
}
