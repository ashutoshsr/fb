package com.fb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelLinkedLists {
	public static void main(String args[]) {
		int[] preorder = new int[] { 3, 9, 8, 6, 20, 15, 7, };
		int[] inorder = new int[] { 8, 9, 6, 3, 15, 20, 7 };
		TreeNode node = new TreeFromPreInOrder().buildTree(preorder, inorder);
		ArrayList<LinkedList<TreeNode>> levels = new ArrayList<>();
		 new LevelLinkedLists().levelList(node, 0, levels);
		System.out.println(levels.get(2));
	}

	public void levelList(TreeNode root, int level,
			ArrayList<LinkedList<TreeNode>> levels) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> list = null; 
		if (levels.size() == level) {
			list = new LinkedList<TreeNode>();
			levels.add(list);
		} else {
			list = levels.get(level);
		}
		list.add(root);
		level++;
		levelList(root.left, level, levels);
		levelList(root.right, level, levels);
	}

	private void visit(TreeNode node, int level) {
		System.out.println(node.val + "at the level " + level);
	}
}
