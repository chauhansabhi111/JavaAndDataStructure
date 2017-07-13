package com.preparation.datastructure.tree;

public class TreeDepthFirstTraversal {
	
	public static void main(String[] args)
	{
		TreeNode node1= new TreeNode(1);
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(3);
		TreeNode rootNode= new TreeNode(4);
		TreeNode node5= new TreeNode(5);
		TreeNode node6= new TreeNode(6);
		TreeNode node7= new TreeNode(7);
		node1.setId(1);
		node2.setId(2);
		node3.setId(3);
		rootNode.setId(4);
		node5.setId(5);
		node6.setId(6);
		node7.setId(7);
		rootNode.setLeftNode(node2);
		rootNode.setRightNode(node6);
		node2.setLeftNode(node1);
		node2.setRightNode(node3);
		node6.setLeftNode(node5);
		node6.setRightNode(node7);
		printPreorder(rootNode);
	}
	
	static void printPostorder(TreeNode node)
    {
        if (node == null)
            return;
        printPostorder(node.getLeftNode());
        printPostorder(node.getRightNode());
        System.out.print(node.getId()+ " ");
    }
 
    static void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        printInorder(node.getLeftNode());
        System.out.print(node.getId()+ " "); 
        printInorder(node.getRightNode());
    }
    static void printPreorder(TreeNode node)
    {
        if (node == null)
            return;
        System.out.print(node.getId()+ " "); 
        printPreorder(node.getLeftNode());
        printPreorder(node.getRightNode());
    }
}
