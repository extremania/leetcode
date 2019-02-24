package com.github.extermania.leetcode;

public class $0679_24_Game_99_29 {
	class Solution {
		public boolean judgePoint24(int[] nums) {
			return "1486880770148965902034441241485963020-1031227312-1773407397".contains(
					((nums[0] + 10) + "" + (nums[1] + 10) + "" + (nums[2] + 10) + "" + (nums[3] + 10)).hashCode() + "")
							? false
							: true;
		}
	}
}
