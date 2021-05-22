package com.fb;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeFromPreInOrder {
	    int preorderIndex = 0;
	    Map<Integer, Integer> valsToIndex;
	    public static void main(String args[]) {
	    	int[] preorder = new int[] {3,9,20,15,7};
	    	int[] inorder = new int[] {9,3,15,20,7};
	    	new TreeFromPreInOrder().buildTree(preorder, inorder);
	    }
	    
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	    valsToIndex = IntStream.range(0, inorder.length).boxed().collect(Collectors.toMap(i -> inorder[i], Function.identity()));
	      return findChildren(preorder, 0, preorder.length -1);
	    }
	    // a bcdefg  |   bcdfgae
	    private TreeNode findChildren(int[] preorder, int start, int end) {
	      if (start > end) {
	        return null;
	      }
	      int find = preorder[preorderIndex++];
	      TreeNode root = new TreeNode(find);
	      root.left = findChildren(preorder, start, valsToIndex.get(find) - 1);
	      root.right = findChildren(preorder, valsToIndex.get(find) + 1, end);
	      return root;
	    }
}
