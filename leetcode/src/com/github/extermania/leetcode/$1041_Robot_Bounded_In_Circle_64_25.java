package com.github.extermania.leetcode;

public class $1041_Robot_Bounded_In_Circle_64_25 {
	static class Solution {
	    static int nor = 1;
	    static int east = 2;
	    static int sou = 3;
	    static int west = 4;
	    int dir = nor;
	    int x = 0;
	    int y = 0;
	    void l(){
	        switch(dir){
	           case 1: dir=west; break;
	           case 2: dir=nor; break;
	           case 3: dir=east; break;
	           case 4: dir=sou; break;
	        default: break;
	        }
	    }
	    void r(){
	        switch(dir){
	         case   1: dir=east; break;
	         case   2: dir=sou; break;
	         case   3: dir=west; break;
	         case   4: dir=nor; break;
	        default: break; 
	        }
	    }
	    void g(){
	        switch(dir){
	           case 1: y++; break;
	         case   2: x++; break;
	          case  3: y--; break;
	          case  4: x--; break;
	        default: break; 
	        }
	    }
	    
	    void f(String s){
	        for(char c:s.toCharArray()){
	            if(c=='G') g();
	            else if(c=='R') r();
	            else if(c=='L') l();
	        }
	    }
	    
	    public boolean isRobotBounded(String instructions) {
	        
	        f(instructions);
	        int sum0 = x*x+y*y;
	        
	        f(instructions);
	       //int sum1 = x*x+y*y;
	        
	        f(instructions);
	      //  int sum2 = x*x+y*y;
	        
	        f(instructions);
	        int sum3 = x*x+y*y;
	        
	       // System.out.println(sum0+" "+sum1+" "+sum2+" "+sum3);
	        
	        
	        return sum3<=sum0;
	    }
	}
}
