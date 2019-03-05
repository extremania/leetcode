package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class $0345_Reverse_Vowels_of_a_String_71_88 {
	class Solution {
	    public String reverseVowels(String s) {
	        char[] cs = s.toCharArray();
	        List<Character> list = new ArrayList<>();
	        for(char c:cs){
	            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
	                list.add(c);
	            }
	        }
	        if(list.size()==0) return s;
	        Collections.reverse(list);
	        Iterator<Character> it = list.iterator();
	        for(int i=0;i<cs.length;i++){
	            char c = cs[i];
	            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
	                cs[i] = it.next();
	                if(!it.hasNext()) break;
	            }
	        }
	        return String.valueOf(cs);
	    }
	}
}
