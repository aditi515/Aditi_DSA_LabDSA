package com.greatlearning.bts.pairFinder;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtils.sampleBST();

		Node root = bst.getRoot();

		System.out.println(root);

		Node _60 = root.getLeft().getRight();

		System.out.println(_60);

		Node _20 = root.getLeft().getLeft().getLeft();
		System.out.println(_20);

	}
}
