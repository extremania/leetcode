package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0207_Course_Schedule_6_25 {
	class Solution {
	    class Node{
	        int val;
	        int num;
	        Set<Node> next;
	        Set<Node> prev;
	        Node(int val, int num){
	            this.val = val;
	            this.num = num;
	            next = new HashSet<>();
	            prev = new HashSet<>();
	        }
	        public boolean equals(Object o){
	            Node node = (Node) o;
	            return this.val==node.val;
	        }
	        public int hashCode(){
	            return this.val;
	        }
	        public String toString(){
	            return val+" :"+next+" :"+prev;
	        }
	        boolean check(){
	            if(next.size()==0) return true;
	            Set<Node> nodes = new HashSet<>();
	            nodes.addAll(next);
	            int i=0;
	            while(nodes.size()>0){
	                Set<Node> nodes0 = new HashSet<>();
	                for(Node node:nodes){
	                    if(val == node.val) return false;
	                    nodes0.addAll(node.next);
	                }
	                nodes=nodes0;
	                if(i++>=num) return false;
	            }
	            return true;
	        }
	    }
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        Map<Integer, Node> graph = new HashMap<>();
	        for(int i=0; i<numCourses; i++) graph.put(i, new Node(i,numCourses));
	        for(int[] e:prerequisites){
	            Node prev = graph.get(e[0]);
	            Node next = graph.get(e[1]);
	            prev.next.add(next);
	            next.prev.add(prev);
	        }
	        //boolean rst = false; //at least one node no prev
	        for(Node node:graph.values()){
	           // if(node.prev.size()==0){
	                if(!node.check()) return false;
	                //rst = true;
	           // }
	        }
	        return true;
	    }
	}
}
