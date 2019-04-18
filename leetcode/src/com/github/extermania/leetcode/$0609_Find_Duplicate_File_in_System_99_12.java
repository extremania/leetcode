package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0609_Find_Duplicate_File_in_System_99_12 {
	class Solution {
	    public List<List<String>> findDuplicate(String[] paths) {
	        
	        Map<String, List<String>> map = new HashMap<>();
	        
	        for(String p:paths){
	            
	            String[] parts = p.split(" ");
	            String folder = parts[0];
	            
	            for(int i=1; i<parts.length; i++){
	                
	                //System.out.println(parts[i]);
	                
	                String f = parts[i].substring(0, parts[i].indexOf("("));
	                String c = parts[i].substring(parts[i].indexOf("(")+1);
	                
	                List<String> fs = map.get(c);
	                if(fs==null){
	                    fs = new ArrayList<>();
	                    map.put(c, fs);
	                }
	                
	                fs.add(folder+"/"+f);
	                
	            }
	            
	        }
	        
	        List<List<String>> rst = new ArrayList<>();
	        for(List<String> l:map.values())
	            if(l.size()>1) rst.add(l);
	        
	        
	        return rst;
	        
	    }
	}
}
