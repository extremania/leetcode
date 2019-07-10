package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0638_Shopping_Offers_59_27 {
	class Solution {
	    
	    int min = Integer.MAX_VALUE;
	    
	    int f(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int cur){
	        if(cur>=min) return min;
	        
	        //System.out.println(needs+"->"+cur);
	        
	        for(List<Integer> sp:special){
	            int result = cur;
	            if(canOffer(sp, needs)){
	                int result_with_offer = result;
	                result_with_offer+=sp.get(needs.size());
	                if(result_with_offer>=min) result_with_offer = min;
	                List<Integer> newNeeds = offer(sp, needs);
	                result_with_offer=f(price, special, newNeeds, result_with_offer);
	                if(result_with_offer>=min) result_with_offer = min;
	                min = result_with_offer;
	            }
	            for(int i=0; i<needs.size(); i++)
	                result+=(needs.get(i)*price.get(i));
	            if(result>=min) result = min;
	            min = result;
	        }
	        
	        return min;
	    }
	    
	    boolean canOffer(List<Integer> sp, List<Integer> needs){
	       for(int i=0; i<needs.size(); i++)
	           if(needs.get(i)<sp.get(i)) return false;
	       return true;
	    }
	    
	    List<Integer> offer(List<Integer> sp, List<Integer> needs){
	        List<Integer> newNeeds = new ArrayList<>();
	        for(int i=0; i<needs.size(); i++)
	            newNeeds.add(needs.get(i)-sp.get(i));
	        return newNeeds;
	    }
	    
	    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
	        return f(price, special, needs, 0);
	    }
	}
}
