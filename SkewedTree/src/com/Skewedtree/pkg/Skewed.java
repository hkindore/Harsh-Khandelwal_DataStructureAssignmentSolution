package com.Skewedtree.pkg;

public class Skewed {
	
	static node prevNode = null;
	static node headNode = null;
	
	public static node bTToSkewed(node root) {

		if (root == null) {
			return null;
		}

		bTToSkewed(root.left);
		node rightNode = root.right;

		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		bTToSkewed(rightNode);
		return headNode;
	}


	public static void traverseRightSkewed(node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

}
