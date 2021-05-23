package com.fb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelLinkedLists {
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
        return true;
	}

	private void visit(TreeNode node, int level) {
		System.out.println(node.val + "at the level " + level);
	}
}
