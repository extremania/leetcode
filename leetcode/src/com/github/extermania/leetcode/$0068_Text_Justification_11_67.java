package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0068_Text_Justification_11_67 {
	static class Solution {
		private static String buildLastLine(List<String> words, int w) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < words.size() - 1; i++) {
				sb.append(words.get(i)).append(" ");
			}
			sb.append(words.get(words.size()-1));
			return pad(sb.toString(), w);
		}

		private static String pad(String word, int w) {
			StringBuilder sb = new StringBuilder(word);
			while (sb.length() != w)
				sb.append(" ");
			return sb.toString();
		}

		private static String buildLine(List<String> words, int w) {
			if (words.size() == 0)
				return "";
			StringBuilder sb = new StringBuilder();
			if (words.size() == 1) {
				return pad(words.get(0), w);
			}

			int wLen = 0;
			for (String word : words) {
				wLen += word.length();
			}
			int left = w - wLen;
			int per = left / (words.size() - 1);
			int rmd = left % (words.size() - 1);
			StringBuilder perSb = new StringBuilder();
			for (int i = 0; i < per; i++)
				perSb.append(" ");

			for (int i = 0; i < words.size() - 1; i++) {
				sb.append(words.get(i)).append(perSb);
				if (i < rmd)
					sb.append(" ");
			}
			sb.append(words.get(words.size() - 1));

			return sb.toString();
		}

		public List<String> fullJustify(String[] words, int maxWidth) {
			int curLen = 0;
			List<String> ws = new ArrayList<>();
			List<String> lines = new ArrayList<>();
			for (String word : words) {
				if (curLen + word.length() > maxWidth) {
					lines.add(buildLine(ws, maxWidth));
					ws = new ArrayList<>();
					curLen = 0;
				}
				curLen += (word.length() + 1);
				ws.add(word);
			}
			lines.add(buildLastLine(ws, maxWidth));
			return lines;
		}
	}
}
