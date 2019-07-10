package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0692_Top_K_Frequent_Words_99_87 {
	class Solution {
	    class P implements Comparable<P> {
	        String val;
	        int cnt;
	        P(String val){
	            this.val=val;
	            cnt=1;
	        }
			public int compareTo(P o) {
				if (cnt == o.cnt)
					return val.compareTo(o.val);
				return o.cnt-cnt;
			}
	    }
	    public List<String> topKFrequent(String[] words, int k) {
	        Map<String, P> map = new HashMap<>();
	        for(String w:words){
	            P p = map.get(w);
	            if(p==null) p = new P(w);
	            else p.cnt++;
	            map.put(w, p);
	        }
	        List<P> list = new ArrayList<>(map.values());
	        Collections.sort(list);
	        List<String> rst = new ArrayList<>(k);
	        for(int i=0; i<k; i++){
	            P p = list.get(i);
	            rst.add(p.val);
	        }
	        return rst;
	    }
	}
}
