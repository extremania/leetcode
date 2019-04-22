package com.github.extermania.leetcode;

public class $0297_Serialize_and_Deserialize_Binary_Tree_71_87 {
	public class Codec {
	    
	    TreeNode d(String data, int d){
	        if("N".equals(data)) return null;
	        int idx = data.indexOf("#");
	        int val = Integer.parseInt(data.substring(0, idx));
	        String data0 = data.substring(idx+1);
	        String sp = "["+d+"]";
	        TreeNode node = new TreeNode(val);
	        idx = data0.indexOf(sp);
	        if(idx<0) return node;
	        String ld = data0.substring(0, idx);
	        String rd = data0.substring(idx+sp.length());
	        //System.out.println(ld+" "+rd);
	        node.left = d(ld, d+1);
	        node.right = d(rd, d+1);
	        return node;
	    }
	    
	    String s(TreeNode node, int d){
	        if(node==null) return "N";
	        return node.val+"#"+s(node.left, d+1)+"["+d+"]"+s(node.right, d+1);
	    }

	    // Encodes a tree to a single string.
	    public String serialize(TreeNode root) {
	        String s= s(root, 0);
	        //System.out.println(s);
	        return s;
	    }

	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        return d(data, 0);
	    }
	}
}
