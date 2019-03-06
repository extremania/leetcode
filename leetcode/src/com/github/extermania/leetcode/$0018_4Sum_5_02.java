package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0018_4Sum_5_02 {
	class Solution {
	    class Node {
	        int a;
	        int b;
	        int c;
	        int d;
	        Node(int a, int b, int c, int d){
	            int[] arr = new int[]{a, b, c, d};
	            Arrays.sort(arr);
	            this.a = arr[0];
	            this.b = arr[1];
	            this.c = arr[2];
	            this.d = arr[3];
	        }
	        public boolean equals(Object obj){
	            Node node = (Node) obj;
	            return this.a==node.a && this.b==node.b
	                && this.c==node.c && this.c==node.c ;
	        }
	        public int hashCode(){
	            return a*1000+b*100+c*10+d;
	        }
	        List<Integer> asList(){
	            return Arrays.asList(a, b, c, d);
	        }
	    }
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	        Set<Node> set = new HashSet<>();
	        for(int i=0; i<nums.length-3; i++){
	            for(int j=i+1; j<nums.length-2; j++){
	                for(int k=j+1; k<nums.length-1; k++){
	                    for(int m=k+1; m<nums.length; m++){
	                        if(nums[i]+nums[k]+nums[j]+nums[m]==target){
	                            set.add(new Node(nums[i],nums[j],nums[k],nums[m]));
	                        }
	                    }
	                }
	            }
	        }
	        List<List<Integer>> rst = new ArrayList<>();
	        for(Node n:set){
	            rst.add(n.asList());
	        }
	        return rst;
	    }
	}
}
