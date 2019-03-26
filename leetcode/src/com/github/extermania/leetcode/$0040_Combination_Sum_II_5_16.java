package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $0040_Combination_Sum_II_5_16 {
	class Solution {
		void combinationSum0(List<Integer> candidates, int target, List<Integer> temp, List<List<Integer>> rst){
		        for(int i=0; i<candidates.size(); i++){
		            if(candidates.get(i)==target){
		                List<Integer> neu = new ArrayList<>(temp);
		                neu.add(candidates.get(i));
		                rst.add(neu);
		            }else if(candidates.get(i)<target){
		                List<Integer> neu = new ArrayList<>(temp);
		                List<Integer> candidates0 = new ArrayList<>(candidates);
		                candidates0.remove(i);
		                neu.add(candidates.get(i));
		                combinationSum0(candidates0, target-candidates.get(i), neu, rst);
		            }else{
		                return;
		            }
		        }
		    }
		    String getKey(List<Integer> list){
		        StringBuilder sb = new StringBuilder();
		        for(Integer n:list)
		            sb.append(n).append("-");
		        return sb.toString();
		    }

		    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		        Arrays.sort(candidates);
		        
		        List<Integer> l = new ArrayList<>();
		        for(int n:candidates){
		            l.add(n);
		        }
		        
		        List<List<Integer>> result = new ArrayList<>();
		        combinationSum0(l, target, new ArrayList<>(), result);
		        List<List<Integer>> result0 = new ArrayList<>();
		      
		        Set<String> set = new HashSet<>();
		        Map<Integer, Integer> map = new HashMap<>();
		        for(int n:candidates){
		            Integer cnt = map.get(n);
		            if(cnt==null){
		                map.put(n, 1);
		            }else{
		                map.put(n, cnt+1);
		            }
		        }
		            
		        for(List<Integer> list:result){
		            Collections.sort(list);
		            String key = getKey(list);
		            if(set.contains(key)){
		                continue;
		            }else{
		                result0.add(list);
		                set.add(key);
		            }
		        }
		        
		        return result0;
		    }
		}
}
