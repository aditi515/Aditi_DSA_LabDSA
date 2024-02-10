package com.greatlearning.bts.pairFinder;

public class BSTPairFinderTest {

	public static void main(String[] args) {

		BinarySearchTree bst = BSTUtils.sampleBST();

		BSTPairFinder pairFinder = new BSTPairFinder(bst, 100);

		int pair = pairFinder.findPairs();

		if (pair == 0) {
			System.out.println("No node pair found ");
		}

	}
}
