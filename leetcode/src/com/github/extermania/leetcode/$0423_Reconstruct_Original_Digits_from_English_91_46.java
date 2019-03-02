package com.github.extermania.leetcode;

public class $0423_Reconstruct_Original_Digits_from_English_91_46 {
	static class Solution {
		private static int remove(int[] pool, int[] word, int cnt) {
			for (int i = 0; i < cnt; i++) {
				for (int c : word) {
					pool[c - 'a']--;
				}
			}
			return cnt;
		}

		private static int howMany(int[] pool, char c) {
			return pool[c - 'a'];
		}

		public String originalDigits(String s) {
			int[] rst = new int[10];
			int[] pool = new int[26];
			for (char c : s.toCharArray()) {
				pool[c - 'a']++;
			}
			rst[2] = remove(pool, new int[] { 't', 'w', 'o' }, howMany(pool, 'w'));
			rst[4] = remove(pool, new int[] { 'f', 'o', 'u', 'r' }, howMany(pool, 'u'));
			rst[6] = remove(pool, new int[] { 's', 'i', 'x' }, howMany(pool, 'x'));
			rst[8] = remove(pool, new int[] { 'e', 'i', 'g', 'h', 't' }, howMany(pool, 'g'));
			rst[0] = remove(pool, new int[] { 'z', 'e', 'r', 'o' }, howMany(pool, 'z'));
			rst[1] = remove(pool, new int[] { 'o', 'n', 'e' }, howMany(pool, 'o'));
			rst[3] = remove(pool, new int[] { 't', 'h', 'r', 'e', 'e' }, howMany(pool, 'h'));
			rst[5] = remove(pool, new int[] { 'f', 'i', 'v', 'e' }, howMany(pool, 'f'));
			rst[7] = remove(pool, new int[] { 's', 'e', 'v', 'e', 'n' }, howMany(pool, 's'));
			rst[9] = remove(pool, new int[] { 'n', 'i', 'n', 'e' }, howMany(pool, 'i'));

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++) {
				if (rst[i] != 0) {
					for (int j = 0; j < rst[i]; j++) {
						sb.append(i);
					}
				}
			}
			return sb.toString();
		}
	}
}
