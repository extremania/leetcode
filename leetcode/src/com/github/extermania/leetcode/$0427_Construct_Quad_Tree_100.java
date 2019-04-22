package com.github.extermania.leetcode;

public class $0427_Construct_Quad_Tree_100 {
	class Solution {
		Node con(int[][] grid, int ri, int rj, int ci, int cj) {
			if (rj == ri)
				return new Node(grid[ri][ci] == 1, true, null, null, null, null);
			int size = (rj - ri + 1) / 2 - 1;
			// System.out.println(size);
			Node tl = con(grid, ri, ri + size, ci, ci + size);
			Node tr = con(grid, ri, ri + size, ci + size + 1, cj);
			Node bl = con(grid, ri + size + 1, rj, ci, ci + size);
			Node br = con(grid, ri + size + 1, rj, ci + size + 1, cj);
			boolean all_true = tl.val && tr.val && bl.val && br.val;
			boolean all_false = !(tl.val || tr.val || bl.val || br.val);
			boolean all_leaf = tl.isLeaf && tr.isLeaf && bl.isLeaf && br.isLeaf;
			if (all_leaf && (all_true || all_false)) {
				boolean val = all_true ? true : false;
				return new Node(val, true, null, null, null, null);
			} else {
				// System.out.println("hit:"+tl+" "+tr+" "+bl+" "+br);
				return new Node(true, false, tl, tr, bl, br);
			}

		}

		public Node construct(int[][] grid) {
			if (grid.length == 0)
				return null;
			return con(grid, 0, grid.length - 1, 0, grid[0].length - 1);
		}
	}

	// Definition for a QuadTree node.
	class Node {
		public boolean val;
		public boolean isLeaf;
		public Node topLeft;
		public Node topRight;
		public Node bottomLeft;
		public Node bottomRight;

		public Node() {
		}

		public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
			val = _val;
			isLeaf = _isLeaf;
			topLeft = _topLeft;
			topRight = _topRight;
			bottomLeft = _bottomLeft;
			bottomRight = _bottomRight;
		}
	};
}
