package com.github.extermania.leetcode;

public class $1093_Statistics_from_a_Large_Sample_77_39 {
	class Solution {
	    public double[] sampleStats(int[] count) {
	        
	        Double min = null;
	        Double max = null;
	        
	        int maxi = -1;
	        int maxn = 0;
	        
	        double sum = 0d;
	        int cnt = 0;
	        
	        for(int i=0; i<256; i++){
	            int n = count[i];
	            if(n==0) continue;
	            if(min==null) min = 1d*i;
	            max = 1d*i;
	            sum+=(n*i); 
	            cnt+=n;
	            if(n>maxn){
	                maxn = n;
	                maxi=i;
	            }
	        }
	        
	        double mean = cnt==0?0d:sum/cnt;
	        double mode = 1d*maxi;
	        
	        Double median = null;
	        
	        if(cnt%2==1){
	            int mid = cnt/2;
	            for(int i=0; i<256; i++){
	                int n = count[i];
	                mid-=n;
	                if(mid<0){
	                    median = 1d*i; break;
	                }
	            }
	        }else{
	            int mida = cnt/2;
	            int midb = mida+1;
	            for(int i=0; i<256; i++){
	                int n = count[i];
	                mida-=n;
	                if(mida<=0){
	                    mida = i; break;
	                }
	            }
	            for(int i=0; i<256; i++){
	                int n = count[i];
	                midb-=n;
	                if(midb<=0){
	                    midb = i; break;
	                }
	            }
	            median = (mida+midb)/2d;
	        }
	        
	        if(min==null) min=0d;
	        if(max==null) max=0d;
	        
	        //System.out.println(min+" "+ max+" "+ mean+" "+  median+" "+  mode);
	        
	        return new double[]{min, max, mean, median, mode};
	    }
	}
}
