package com.fb;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	boolean visited; 

	public TreeNode(int val) {
		this.val = val;
	}

	public String toString() {
		return String.valueOf(val);
	}
}
