package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0966_Vowel_Spellchecker_8_18 {
	static class Solution {
	    int getIdx(String word){
	       char c = Character.toLowerCase(word.charAt(0));
	       return isVowel(c)?0:c-'a';
	    }
	    Map<Integer, List<String>[]> dict(String[] wordlist){
	        Map<Integer, List<String>[]> dict = new HashMap<>();
	        for(String word:wordlist){
	            int len = word.length();
	            int c = getIdx(word); 
	            List<String>[] list = dict.get(len);
	            if(list==null){
	                list = new List[26];
	                dict.put(len, list);
	            }
	            List<String> wl = list[c];
	            if(wl==null){
	                wl=new ArrayList<>();
	                list[c] = wl;
	            }
	            wl.add(word);
	        }
	        return dict;
	    } 
	    boolean isVowel(char c){return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';}
	    boolean equalsIgnoreVowel(String s1, String s2){
	        // already same len
	        int len = s1.length();
	        for(int i=0; i<len; i++){
	            char c1 = Character.toLowerCase(s1.charAt(i));
	            char c2 = Character.toLowerCase(s2.charAt(i));
	            if(!(c1==c2 || isVowel(c1) && isVowel(c2))) return false;
	        }
	        return true;
	    }
	    public String[] spellchecker(String[] wordlist, String[] queries) {
	        Map<Integer, List<String>[]> dict = dict(wordlist);
	        String[] rst = new String[queries.length];
	        for(int i=0; i<queries.length; i++){
	            String q = queries[i];
	            int len = q.length();
	            int c = getIdx(q); 
	            List<String>[] list = dict.get(len);
	            if(list==null){rst[i]=""; continue;}
	            List<String> wl = list[c];
	            if(wl==null){rst[i]=""; continue;}
	            boolean cmatch = false;
	            boolean vmatch = false;
	            for(String w:wl){
	                //System.out.println(cmatch+" "+vmatch+" "+w);
	                if(w.equals(q)){ rst[i]=w; break; } 
	                else if(w.equalsIgnoreCase(q) && !cmatch) { cmatch=true; rst[i]=w; }
	                else if(equalsIgnoreVowel(w,q) && !cmatch && !vmatch ) { vmatch=true; rst[i]=w; }
	            }
	            if(rst[i]==null) rst[i]="";
	        }
	        return rst;
	    }
	}
}
