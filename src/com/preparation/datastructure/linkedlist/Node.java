package com.preparation.datastructure.linkedlist;

public class Node {

	private int data;
	private Node leftLink;
	private Node rightNode;
	Node(int data)
	{
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeftLink() {
		return leftLink;
	}
	public void setLeftLink(Node leftLink) {
		this.leftLink = leftLink;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
}
