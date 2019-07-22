package com.github.extermania.leetcode;

public class $0904_Fruit_Into_Baskets_99_22 {
	class Solution {
	    public int totalFruit(int[] tree) {
	        int a, b, idxa, idxb;
	        a=b=idxa=idxb=-1;
	        int max = 0;
	        int cnt = 0;
	        for(int i=0; i<tree.length; i++){
	            //System.out.println(i+" "+a+" "+b+" "+idxa+" "+idxb+" "+cnt);
	            if(a==tree[i]){idxa=i; cnt++;}
	            else if(b==tree[i]){idxb=i; cnt++;}
	            else if(a==-1){idxa=i; a=tree[i]; cnt++;}
	            else if(b==-1){idxb=i; b=tree[i]; cnt++;}
	            else {
	                max = Math.max(max, cnt);
	                if(tree[i-1]==a){i = idxa; cnt=idxa-idxb; b = -1;}
	                else{i = idxb; cnt=idxb-idxa; a = -1;}
	            }
	        }
	        max = Math.max(max, cnt);
	        return max;
	    }
	}
}
