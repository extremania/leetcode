package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0412_Fizz_Buzz_100 {
	class Solution {
	    private static final String FIZZ="Fizz";
	    private static final String BUZZ="Buzz";
	    private static final String FIZZ_BUZZ="FizzBuzz";
	    public List<String> fizzBuzz(int n) {
	        List<String> result = new ArrayList<>();
	        for(int i=1; i<=n; i++){
	            if(i%15==0) result.add(FIZZ_BUZZ);
	            else if(i%3==0) result.add(FIZZ);
	            else if(i%5==0) result.add(BUZZ);
	            else result.add(String.valueOf(i));
	        }
	        return result;
	    }
	}
}
