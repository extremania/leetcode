package com.github.extermania.leetcode;

public class $0551_Student_Attendance_Record_I_100 {
	class Solution {
	    public boolean checkRecord(String s) {
	        int latec = 0;
	        int abc = 0;
	        for(char c:s.toCharArray()){
	            if(c=='A') { abc++; latec=0; }
	            else if(c=='L') latec++;
	            else latec = 0;
	            if(abc>1 || latec>2) return false;
	        }
	        return true;
	    }
	}
}
