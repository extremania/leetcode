package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class $0341_Flatten_Nested_List_Iterator_100 {

	// This is the interface that allows for creating nested lists.
	// You should not implement it, or speculate about its implementation
	public interface NestedInteger {

		// @return true if this NestedInteger holds a single integer, rather than a
		// nested list.
		public boolean isInteger();

		// @return the single integer that this NestedInteger holds, if it holds a
		// single integer
		// Return null if this NestedInteger holds a nested list
		public Integer getInteger();

		// @return the nested list that this NestedInteger holds, if it holds a nested
		// list
		// Return null if this NestedInteger holds a single integer
		public List<NestedInteger> getList();
	}

	public static class NestedIterator implements Iterator<Integer> {

		private static void add(NestedInteger n, List<Integer> list) {
			if (n.isInteger())
				list.add(n.getInteger());
			else {
				for (NestedInteger nn : n.getList()) {
					add(nn, list);
				}
			}
		}

		Iterator<Integer> it = null;

		public NestedIterator(List<NestedInteger> nestedList) {
			List<Integer> list = new ArrayList<>();
			for (NestedInteger n : nestedList) {
				add(n, list);
			}
			it = list.iterator();
		}

		@Override
		public Integer next() {
			return it.next();
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}
	}

}
