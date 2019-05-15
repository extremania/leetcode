package com.github.extermania.leetcode;

public class $0394_Decode_String_100 {
	class Solution {
		public String decodeString(String s) {
            //System.out.println(s);
            int ids = s.lastIndexOf("[");
            if(ids<0) return s;
            int ide = s.indexOf("]", ids);
            
            String rp = s.substring(ids+1, ide);
            String dg = "";
            int i = ids-1;
            while(i>=0 && s.charAt(i)>='0' && s.charAt(i)<='9'){
                dg=s.charAt(i--)+dg;
            }
            return decodeString(s.substring(0, i+1)+repeat(Integer.parseInt(dg), rp)+s.substring(ide+1));
        }


		String repeat(int n, String s) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++)
				sb.append(s);
			return sb.toString();
		}
	}
}
