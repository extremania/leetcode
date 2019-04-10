package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0160_Intersection_of_Two_Linked_Lists_17_70 {
	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			Set<ListNode> set = new HashSet<>();
			ListNode cur = headA;
			while (cur != null) {
				set.add(cur);
				cur = cur.next;
			}
			cur = headB;
			while (cur != null) {
				if (set.contains(cur))
					return cur;
				cur = cur.next;
			}
			return null;
		}
	}
}
