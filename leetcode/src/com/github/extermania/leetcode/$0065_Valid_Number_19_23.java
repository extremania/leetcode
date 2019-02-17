package com.github.extermania.leetcode;

public class $0065_Valid_Number_19_23 {
	static class Solution {
		private static boolean isDigit(String s) {
				String ss = s.trim();
				if (ss.startsWith("+") || ss.startsWith("-"))
					ss = ss.substring(1);
				if (ss.length() == 0) {
				return false;
			}
				char[] chars = ss.toCharArray();
				for (char c : chars) {
					if (c < '0' || c > '9') {
						return false;
					}
				}
				return true;
			}

			private static boolean isDecimal(String s) {
				if (s.contains(".")) {
					String[] ps2 = s.split("\\.");
				if (ps2.length == 1) {
					return isDigit(ps2[0]);
				} else if (ps2.length == 2) {
					return isDigit(ps2[0]) && isDigit(ps2[1]);
				}
				}
				return isDigit(s);
			}

			public  boolean isNumber(String s) {
				String ss = s.trim();
		        ss = ss.replace("e+", "e");
				ss = ss.replace("e-", "e");
		        if(ss.contains(" "))return false;
		        char[] cs = ss.toCharArray();
				int c1=0, c2=0;
				for(char c:cs) {
					if(c=='.') c1++;
					else if(c=='e') c2++;
					if(c1>1 || c2>1) return false;
				}
				if (ss.startsWith(".e") || ss.endsWith(".e") || ss.endsWith("-.") || ss.contains("-e") || ss.endsWith("+.") || ss.contains("+e") || ss.contains(".-")|| ss.contains(".+"))
					return false;
				if (ss.equals("."))
					return false;
				if (ss.endsWith("e") || ss.startsWith("e"))
					return false;
				if (ss.startsWith("+") || ss.startsWith("-"))
					ss = ss.substring(1);
		        if (ss.startsWith("."))
					ss = "0" + ss;
				if (ss.length() == 0)
					return false;
				if (ss.contains("e")) {
				String[] ps = ss.split("e");
				if (ps.length == 1) {
					return isDecimal(ps[0]);
				} else if (ps.length == 2) {
					return isDecimal(ps[0]) && isDigit(ps[1]);
				}
				}
				return isDecimal(ss);
			}
		}
}
