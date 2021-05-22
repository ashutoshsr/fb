package com.fb;

public class Testing {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		TreeNode result = binarySearchTree(array, 0, 10);
		printTreeNode(result);
	}

	private static void printTreeNode(TreeNode node) {
		if (node != null) {
			printTreeNode(node.left);
			printTreeNode(node.right);
			System.out.println(node.val);
		}
	}

	private static TreeNode binarySearchTree(int[] array, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(mid);
		root.left = binarySearchTree(array, start, mid - 1);
		root.right = binarySearchTree(array, mid + 1, end);
		return root;
	}
}
