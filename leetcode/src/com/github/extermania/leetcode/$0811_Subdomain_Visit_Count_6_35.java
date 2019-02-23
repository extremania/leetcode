package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0811_Subdomain_Visit_Count_6_35 {
	class Solution {
	    public List<String> subdomainVisits(String[] cpdomains) {
	        Map<String, Integer> map = new HashMap<>();
	        for(String str:cpdomains){
	            String[] parts = str.split(" ");
	            System.out.println(parts.length);
	            Integer count = Integer.parseInt(parts[0]);
	            String domain = parts[1];
	            String[] ds = domain.split("\\.");
	            List<String> subDomains = new ArrayList<>();
	            if(ds.length==2){
	                subDomains.add(domain);
	                subDomains.add(ds[1]);
	            }else if(ds.length==3){
	                subDomains.add(domain);
	                subDomains.add(ds[1]+"."+ds[2]);
	                subDomains.add(ds[2]);
	            }
	            for(String subDomain:subDomains){
	                Integer cnt = map.get(subDomain);
	                if(cnt==null){
	                    cnt = 0;
	                }
	                cnt=cnt+count;
	                map.put(subDomain, cnt);
	            }
	        }
	        List<String> result = new ArrayList<>();
	        for(Map.Entry<String, Integer> entry:map.entrySet()){
	            String domain = entry.getKey();
	            Integer cnt = entry.getValue();
	            result.add(cnt+" "+domain);
	        }
	        return result;
	    }
	}
}
