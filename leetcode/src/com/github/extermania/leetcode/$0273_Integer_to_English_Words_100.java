package com.github.extermania.leetcode;

public class $0273_Integer_to_English_Words_100 {
	class Solution {
	    
	    String f(int num){
	        //System.out.println(num);
	        if(num<0) return "Negative "+f(-num);
	        if(num>=0 && num<=19){
	            switch(num){
	                case 0: return "Zero";
	                case 1: return "One";
	                case 2: return "Two";
	                case 3: return "Three";
	                case 4: return "Four";
	                case 5: return "Five";
	                case 6: return "Six";
	                case 7: return "Seven";
	                case 8: return "Eight";
	                case 9: return "Nine";
	                case 10: return "Ten";
	                case 11: return "Eleven";
	                case 12: return "Twelve";
	                case 13: return "Thirteen";
	                case 14: return "Fourteen";
	                case 15: return "Fifteen";
	                case 16: return "Sixteen";
	                case 17: return "Seventeen";
	                case 18: return "Eighteen";
	                case 19: return "Nineteen";
	            }
	        }
	        if(num==20) return "Twenty";
	        if(num==30) return "Thirty";
	        if(num==40) return "Forty";
	        if(num==50) return "Fifty";
	        if(num==60) return "Sixty";
	        if(num==70) return "Seventy";
	        if(num==80) return "Eighty";
	        if(num==90) return "Ninety";
	        if(num<100) {
	            int rm = num%10;
	            int rd = num-rm;
	            return f(rd)+" "+f(rm);
	        }
	        if(num>=100 && num<=999){
	            int rm = num%100;
	            if(rm==0) {
	                return f(num/100)+" Hundred";
	            }else{
	                return f(num/100)+" Hundred "+f(rm);
	            }
	        }
	        if(num>=1000 && num<=999999){
	            int rm = num%1000;
	            if(rm==0){
	                return f(num/1000)+" Thousand";
	            }else{
	                return f(num/1000)+" Thousand "+f(rm);
	            }
	        }
	        if(num>=1000000 && num<=999999999){
	            int rm = num%1000000;
	            if(rm==0){
	                return f(num/1000000)+" Million";
	            }else{
	                return f(num/1000000)+" Million "+f(rm);
	            }
	        }
	       if(num>=1000000000 && num<=Integer.MAX_VALUE){
	            int rm = num%1000000000;
	            if(rm==0){
	                return f(num/1000000000)+" Billion";
	            }else{
	                return f(num/1000000000)+" Billion "+f(rm);
	            }
	       }
	       return "";
	    }
	    
	    public String numberToWords(int num) {
	        return f(num);
	    }
	}
}
