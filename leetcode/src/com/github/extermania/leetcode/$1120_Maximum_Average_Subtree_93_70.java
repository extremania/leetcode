package com.github.extermania.leetcode;

public class $1120_Maximum_Average_Subtree_93_70 {
	class Solution {
	    double max = 0d;
	    class N {
	        int val;
	        int f;
	        int sum;
	        N left;
	        N right;
	        double ave = 0d;
	        N(TreeNode node){
	            this.val = node.val;
	            if(node.left!=null) this.left=new N(node.left);
	            if(node.right!=null) this.right=new N(node.right);
	            this.sum = this.val; 
	            this.f = 1;
	            if(this.left!=null){
	                sum+=this.left.sum; f+=this.left.f;
	            }
	            if(this.right!=null){
	                sum+=this.right.sum; f+=this.right.f;
	            }
	            this.ave = (double)this.sum/f;
	            if(this.ave>max) max=this.ave;
	           // System.out.println(this.val+" "+this.sum+" "+this.f+" "+this.ave);
	        } 
	    }
	    public double maximumAverageSubtree(TreeNode root) {
	        new N(root); return max;
	    }
	}
}
