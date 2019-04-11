package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0187_Repeated_DNA_Sequences_45_21 {
	class Solution {
	    public List<String> findRepeatedDnaSequences(String s) {
	        if(s.length()<=10) return Arrays.asList();
	        Set<String> rst = new HashSet<>();
	        Set<String> set = new HashSet<>();
	        for(int i=0; i<s.length()-9; i++){
	            String str = s.substring(i, i+10);
	            if(set.contains(str)) rst.add(str);
	            set.add(str);
	        }
	        return new ArrayList<>(rst);
	    }
	}
}
