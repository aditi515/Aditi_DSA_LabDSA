package com.greatlearning.bts.pairFinder;

public class Node {

	Integer data;
	Node left;
	Node right;

	public Node(Integer data) {

		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String toString() {
		return String.format("[%d]", data);
	}
}