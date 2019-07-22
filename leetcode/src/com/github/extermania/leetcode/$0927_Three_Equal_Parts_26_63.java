package com.github.extermania.leetcode;

public class $0927_Three_Equal_Parts_26_63 {
	class Solution {
		public int[] threeEqualParts(int[] A) {
	        int cur1=-1; int cur2=-1;
	        int cnt=0;
	        boolean all0=true;
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<A.length; i++){
	            if(A[i]==1){
	                all0 = false;
	                if(++cnt==3){
	                    while(cnt!=1) if(A[++cur2]==1) cnt--;
	                    while(cnt!=0) if(A[++cur1]==1) cnt--;
	                }
	            }
	            sb.append(A[i]);
	        }
	        if(all0) return new int[]{0, A.length-1};
	        if(cnt!=0) return new int[]{-1, -1};
	        
	        int zcnt = 0;
	        for(int i=A.length-1; i>=0; i--) 
	           if(A[i]==0) zcnt++;
	           else break;
	        
	        cur1+=zcnt; cur2+=(zcnt+1);
	        if(valid(sb, A, cur1, cur2)) return new int[]{cur1, cur2};
	        else return new int[]{-1, -1};
		}
	    
	    boolean valid(StringBuilder sb, int[] A, int i, int j){
	        int a=0; while(A[a]==0) a++;
	        int b=i+1; while(A[b]==0) b++;
	        int c=j; while(c<A.length && A[c]==0) c++;
	        
	        if(c==A.length) return false;
	        
	        for(int k=0; k<=(i-a); k++)
	            if(A[a+k]!=A[b+k] || A[a+k]!=A[c+k]) return false;
	        
	        return true;
	    }

	}
}
