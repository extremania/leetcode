package com.github.extermania.leetcode;

public class $0997_Find_the_Town_Judge_96_75 {
	class Solution {
		   
	    public int findJudge(int N, int[][] trust) {
	        if(N==0) return -1;
	        if(N==1) return 1;
	        int[] arr=new int[N];
	        for(int[] tr:trust) arr[tr[0]-1]++;
	        int judge = 0;
	        for(int i=0; i<N; i++){
	            if(arr[i]==0 && judge==0) judge=i+1;
	            else if(arr[i]==0 && judge!=0) return -1;
	        }
	        int cnt=0;
	        for(int[] tr:trust)
	            if(tr[1]==judge) cnt++;
	        return cnt==N-1?judge:-1;
	    }
	}
}
