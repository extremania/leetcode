package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $1028_Recover_a_Tree_From_Preorder_Traversal_10ms {
	class Solution {
	    class Node{
	        int dep;
	        int val;
	        Node(int dep, int val){
	            this.dep=dep;
	            this.val=val;
	        }
	        public String toString(){
	            return dep+"-"+val;
	        }
	    }
	    List<Node> con(char[] cs){
	        int dep=0;
	        int val=0;
	        List<Node> list = new ArrayList<>();
	        for(int i=0; i<cs.length; i++){
	            if(cs[i]=='-'){
	               if(cs[i-1]!='-'){
	                 list.add(new Node(dep, val));
	                 dep=1;
	                 val=0;
	               }else dep++;
	               
	            }else{
	               val=10*val+(cs[i]-'0');
	               if(i==cs.length-1) list.add(new Node(dep, val)); 
	            } 
	        }
	        return list;
	    }
	    public TreeNode recoverFromPreorder(String S) {
	        
	        Map<Integer, List<TreeNode>> map = new HashMap<>(); //key-depth, value-stack
	        Map<Integer, Integer> curs = new HashMap<>();
	        
	        List<Node> list = con(S.toCharArray());
	        
	        TreeNode root = null;
	        
	        for(Node node:list){
//	             System.out.println("======================================");
//	             System.out.println(node);
//	             for(Map.Entry<Integer, List<TreeNode>> entry:map.entrySet()){
//	                 for(TreeNode n:entry.getValue())
//	                   System.out.println(entry.getKey()+":"+n.val);
//	             }
	          
//	             System.out.println(curs);
	            if(node.dep==0){
	                root = new TreeNode(node.val);
	                List<TreeNode> stack = new ArrayList<>();
	                stack.add(root);
	                map.put(0, stack);
	                curs.put(0, 0);
	            }else{
	                TreeNode tn = new TreeNode(node.val);
	                List<TreeNode> stack = map.get(node.dep);
	                if(stack==null){
	                    stack=new ArrayList<>();
	                    stack.add(tn);
	                    curs.put(node.dep, 0);
	                    map.put(node.dep, stack);
	                }else{
	                    stack.add(tn);
	                    curs.put(node.dep, curs.get(node.dep)+1);
	                }
	                List<TreeNode> pstack = map.get(node.dep-1);
	                Integer pcur = curs.get(node.dep-1);
	                TreeNode p = pstack.get(pcur);
	         //       System.out.println(pcur+" "+p.val);
	                if(p.left==null) p.left=tn;
	                else if(p.right==null){
	                    p.right=tn;
	                    pstack.remove(p);
	                    curs.put(node.dep-1, pcur-1);
	                }
	            }
	        }
	        
	        return root;
	    }
	}
}
