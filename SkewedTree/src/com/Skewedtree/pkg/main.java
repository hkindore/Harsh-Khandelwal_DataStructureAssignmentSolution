package com.Skewedtree.pkg;

public class main {

	static node node;

	public static void main(String[] args) {

		main tree = new main();
	
		tree.node = new node(50);
		
		tree.node.left = new node(30);
		
		tree.node.right = new node(60);
		
		tree.node.left.left = new node(10);
		
		tree.node.right.left = new node(55);

		node headNode = Skewed.bTToSkewed(node);
		Skewed.traverseRightSkewed(headNode);
	}
}