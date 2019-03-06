package com.github.extermania.leetcode;

public class $0012_Integer_to_Roman_99_95 {
	static class Solution {
	    static String[] a1000 = new String[]{"","M","MM","MMM"};
	    static String[] a100 =  new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	    static String[] a10 =   new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	    static String[] a1 =    new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};

	    public String intToRoman(int num) {
	        int num0 = num;
	        int n1000 = num0/1000;
	        num0=num0%1000;
	        int n100 = num0/100;
	        num0=num0%100;
	        int n10 = num0/10;
	        num0=num0%10;
	        int n1 = num0;
	        StringBuilder sb = new StringBuilder();
	        sb.append(a1000[n1000])
	          .append(a100[n100])
	          .append(a10[n10])
	          .append(a1[n1]);
	        return sb.toString();
	    }
	}
}
