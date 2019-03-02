package com.github.extermania.leetcode;

public class $0443_String_Compression_100 {
	class Solution {
	    public int compress(char[] chars) {
	        if(chars.length==0) return 0;
	        if(chars.length==1) return 1;
	        char cur = chars[0];
	        int cnt = 1;
	        StringBuilder sb = new StringBuilder();
	        for(int i=1; i<chars.length-1; i++){
	            if(chars[i]==cur) cnt++;
	            else{
	                sb.append(cur);
	                if(cnt>1){
	                    sb.append(cnt);
	                }
	                cur = chars[i];
	                cnt = 1;
	            }
	        }
	        if(chars[chars.length-1]==cur){
	            sb.append(cur).append(++cnt);
	        }else{
	            sb.append(cur);
	            if(cnt>1) sb.append(cnt);
	            sb.append(chars[chars.length-1]);
	        }
	        String str = sb.toString();
	        char[] chars0 = str.toCharArray();
	        for(int i=0; i<chars0.length; i++) chars[i]=chars0[i];
	        return chars0.length;
	    }
	}
}
