package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0895_Maximum_Frequency_Stack_7_30 {
	class FreqStack {
	    
	    Map<Integer, Integer> map;
	    List<Integer> stack; 
	    int max;
	    int maxCnt;
	    
	    int[] cnts = new int[10000];

	    public FreqStack() {
	        stack = new ArrayList<>();
	        map = new HashMap<>();
	    }
	    
	    public void push(int x) {
	        stack.add(x);
	        Integer cnt = map.get(x);
	        if(cnt==null){
	            cnt = 0;
	        }
	        cnt++;
	        map.put(x, cnt);
	        if(cnt>max){
	            max = cnt;
	            maxCnt = 1;
	        }else if(cnt==max){
	            maxCnt++;
	        }
	        cnts[cnt]++;
	    }
	    
	    public int pop() {
	        for(int i=stack.size()-1; i>=0; i--){
	            int val = stack.get(i);
	            int cnt = map.get(val);
	            if(cnt==max){
	                maxCnt--;
	                cnts[cnt]--;
	                map.put(val, cnt-1);
	                if(maxCnt==0){
	                    cnts[cnt]=0;
	                    for(int k=cnt; k>=0; k--){
	                        if(cnts[k]!=0){
	                            max = k;
	                            maxCnt = cnts[k];
	                            break;
	                        }
	                    }
	                }
	                return stack.remove(i);
	            }
	        }
	        return -1;
	    }
	}

}
