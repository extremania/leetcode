package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    	
    	String str = "CompetitiveProgramming";
    	
    	List<Integer> list =new ArrayList<>();
    	for(int i=0; i<str.length(); i++) 
    		if(Character.isUpperCase(str.charAt(i))) list.add(i);
    	list.add(str.length());
    	
    	List<String> rst = new ArrayList<>();
    	for(int i=0; i<list.size()-1; i++) 
    		rst.add(str.substring(list.get(i), list.get(i+1)));
    	
    	System.out.println(rst);
    }
}
