package com.github.extermania.leetcode;

public class $0470_Implement_Rand10_Using_Rand7_15_48 {
	class Solution extends SolBase {
	    public int rand10() {
	        return (rand7()+rand7()+rand7()+rand7()+rand7()+rand7()+rand7()+rand7()+rand7()+rand7())%10+1;
	    }
	}
	class SolBase{
	   protected int rand7() {return 0;}
	}
}
