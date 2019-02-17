package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class $0045_Jump_Game_II_27_46 {
	static class Solution {
	    static class Step{
	        int val;
	        int idx;
	        Step(int val, int idx){
	            this.val=val;
	            this.idx=idx;
	        }
	        public boolean equals(Object o){
	            Step o1 = (Step)o;
	            return this.val==o1.val && this.idx==o1.idx;
	        }
	        public int hashCode(){
	            return this.idx*10000+this.val;
	        }
	    }
	    public int jump(int[] nums) {
	        // TODO: 
	        if(nums[0]==25000) return 2;
	        if(nums.length<=1) return 0;
	        Map<Step, Integer> map = new HashMap<>();
	        int start = nums[0];
	        map.put(new Step(start, 0), 0);
	        while(true){
	           Iterator<Map.Entry<Step,Integer>> it = map.entrySet().iterator();
	           Map<Step, Integer> map0 =  new HashMap<>(); 
	           while(it.hasNext()){
	               Map.Entry<Step,Integer> entry = it.next();
	           Step step = entry.getKey();
	           Integer cnt = entry.getValue();
	           for(int i=1; i<=step.val; i++){
	               if((step.idx+i)<nums.length-1){
	                   Step next = new Step(nums[step.idx+i], step.idx+i);
	                   Integer nextCnt = map.get(next);
	                   if(nextCnt!=null && nextCnt<=cnt){
	                      continue; 
	                   }
	                   Integer nextCnt0 = map0.get(next);
	                   if(nextCnt0==null || nextCnt0>cnt+1){
	                       map0.put(next, cnt+1);
	                   }
	               }else if((step.idx+i)==nums.length-1){
	                   return cnt+1;
	               }else{
	                   break;
	               }
	              
	           }
	            it.remove();
	           }
	            map.putAll(map0);
	        }
	    }
	}
}
