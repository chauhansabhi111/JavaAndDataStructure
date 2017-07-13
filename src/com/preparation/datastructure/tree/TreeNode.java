package com.preparation.datastructure.tree;

public class TreeNode {
	
	TreeNode(int id)
	{
		this.name=id;
	}
	private int name;
	private TreeNode leftNode;
	private TreeNode rightNode;
	public int getId() {
		return name;
	}
	public void setId(int id) {
		this.name = id;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

}
