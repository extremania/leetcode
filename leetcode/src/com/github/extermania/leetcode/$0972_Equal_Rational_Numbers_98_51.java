package com.github.extermania.leetcode;

public class $0972_Equal_Rational_Numbers_98_51 {
	static class Solution {
		private static String[] resolve(String s) {
			String[] arr = new String[3];
			arr[0] = arr[1] = arr[2] = "";
			int idx = s.indexOf('.');
			if (idx < 0) {
				arr[0] = s;
				return arr;
			}
			arr[0] = s.substring(0, idx);
			if (idx != s.length() - 1) {
				String tmp = s.substring(idx + 1);
				idx = tmp.indexOf('(');
				if (idx < 0) {
					arr[1] = tmp;
					return arr;
				}
				//System.out.println(tmp);
				if (!tmp.startsWith("(")) {
					arr[1] = tmp.substring(0, idx);
				}
				arr[2] = tmp.substring(idx + 1, tmp.indexOf(')'));
			}

			return arr;
		}

		public  boolean isRationalEqual(String S, String T) {
			//
			if (S.indexOf(".") < 0 && T.indexOf(".") < 0) {
				return S.equals(T);
			}
			String[] arr1 = resolve(S);
			String[] arr2 = resolve(T);
			String integer1 = arr1[0];
			String nonRepeat1 = arr1[1];
			String repeat1 = arr1[2];
			String integer2 = arr2[0];
			String nonRepeat2 = arr2[1];
			String repeat2 = arr2[2];

			if (integer1.equals(integer2) //
					&& nonRepeat1.equals(nonRepeat2) //
					&& repeat1.equals(repeat2) //
			) {
				return true;
			}

			if (repeat1.isEmpty() && repeat2.isEmpty()) {
				return new StringBuilder().append(integer1).append(".").append(nonRepeat1)
						.equals(new StringBuilder().append(integer2).append(".").append(nonRepeat2));
			}
			
			//System.out.println(Arrays.toString(arr1));
			//System.out.println(Arrays.toString(arr2));

			String s1 = build(integer1, nonRepeat1, repeat1);
			String s2 = build(integer2, nonRepeat2, repeat2);
			
			//System.out.println(s1);
			//System.out.println(s2);

			if(s1.startsWith(s2) || s2.startsWith(s1)) return true;
			
			// special case
			boolean spec = false;
			if (all9(arr1[2])) {
				transform(arr1);
				spec = true;
			}
			if (all9(arr2[2])) {
				transform(arr2);
				spec = true;
			}

			if (spec) {
				integer1 = arr1[0];
				nonRepeat1 = arr1[1];
				repeat1 = arr1[2];
				integer2 = arr2[0];
				nonRepeat2 = arr2[1];
				repeat2 = arr2[2];
				s1 = build(integer1, nonRepeat1, repeat1);
				s2 = build(integer2, nonRepeat2, repeat2);

				//System.out.println(s1);
				//System.out.println(s2);

				if (s1.startsWith(s2) || s2.startsWith(s1))
					return true;
			}


			return false;
			
		}
		
		private static String build(String integer1, String nonRepeat1, String repeat1) {
			String p = repeat1;
			if (p.isEmpty())
				p = "0";
			return new StringBuilder() //
					.append(integer1) //
					.append(".") //
					.append(nonRepeat1) //
					.append(p).append(p).append(p).append(p) //
					.toString();
		}

		private static void transform(String[] arr) {
			arr[2] = "";
			boolean add1 = false;
			boolean add0 = false;
			if (!arr[1].isEmpty()) {
				if (all9(arr[1])) {
					arr[1] = "";
					arr[0] = String.valueOf(Integer.parseInt(arr[0]) + 1);
					add0 = true;
				} else {
					add1 = true;
					int oriLen = arr[1].length();
					arr[1] = String.valueOf(Integer.parseInt(arr[1]) + 1);
					while (arr[1].length() < oriLen)
						arr[1] = "0" + arr[1];
				}
			}
			if ((all9(arr[1]) || arr[1].isEmpty()) && !add1) {
				arr[1] = "";
				if (!add0) {
				arr[0] = String.valueOf(Integer.parseInt(arr[0]) + 1);
				}
			}
		}

		private static boolean all9(String s) {
			if (s.isEmpty())
				return false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != '9')
					return false;
			}
			return true;
		}



	}
}
