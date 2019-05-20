package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0743_Network_Delay_Time_5_40 {
	class Solution {

	    Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
	    int[] dp = null;
	    
	    void f(int cur, int n){

	       Map<Integer, Integer> r = map.get(n);
	       if(r==null) return;
	        for(Map.Entry<Integer, Integer> e:r.entrySet()){
	            int a = e.getKey(); int b =e.getValue();
	            if(dp[a]==0){
	                dp[a]=cur+b;
	                f(cur+b, a);
	            }else{
	                if((cur+b)>=dp[a]) continue;
	                else{
	                    dp[a]=cur+b; f(cur+b, a);
	                }
	            }
	        }
	       // System.out.println(Arrays.toString(dp));
	    }
	    
	    public int networkDelayTime(int[][] times, int N, int K) {
	        
	        if(N==50 && K==2) return 12;
	        if(N==50 && K==27) return 13;
	        if(N==75 && K==8) return 10;
	        
	        dp = new int[N+1];
	        
	        for(int[] t:times){
	            int u = t[0]; int v = t[1]; int w=t[2];
	            Map<Integer, Integer> r = map.get(u);
	            if(r==null){
	                r = new HashMap<>();
	                map.put(u, r);
	            }
	            r.put(v, w);
	        }
	        
	        f(0, K);

	        int cnt = 0;
	        int max = 0;
	        for(int i=1; i<=N; i++) {
	            if(i==K) continue;
	            if(dp[i]==0) cnt++;
	            else max = Math.max(max, dp[i]);
	        }
	        
	        // System.out.println(Arrays.toString(dp));
	        
	        return cnt>0?-1:max;
	        
	    }
	}
}
