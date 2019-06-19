package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class $0354_Russian_Doll_Envelopes_51_27 {
	class Solution {
		public int maxEnvelopes(int[][] envelopes) {
			Arrays.sort(envelopes, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
				}
			});
			int[] dp = new int[envelopes.length];
			int max = 0;
			for (int i = 0; i < dp.length; i++)
				max = Math.max(max, f(envelopes, i, dp));
			return max;
		}

		int f(int[][] envs, int i, int[] dp) {
			if (dp[i] > 0)
				return dp[i];
			int max = 1;
			for (int j = i + 1; j < envs.length; j++)
				if (envs[j][0] > envs[i][0] && envs[j][1] > envs[i][1])
					max = Math.max(1 + f(envs, j, dp), max);
			dp[i] = max;
			return max;
		}

	}
}
