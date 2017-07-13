package com.preparation.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderTraversal 
{
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
		printLevelOrderTraversal(rootNode);
	}
	
	static void printLevelOrderTraversal(TreeNode node)
    {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
		if (node == null) {
			System.out.println("Tree is empty");
			return;
		}
        queue.add(node);
       
        while(!queue.isEmpty())
        {
        	TreeNode tempNode= queue.poll();
        	System.out.println(tempNode.getId());
        	if(tempNode.getLeftNode()!=null)
        		queue.add(tempNode.getLeftNode())	;
        	if(tempNode.getRightNode()!=null)
        		queue.add(tempNode.getRightNode())	;
        }
    }
	
	/*public static void traverseBinaryTree(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.println(""+node.getId());
			if (node.getLeftNode() != null) {
				queue.offer(node.getLeftNode());
			}
			if (node.getRightNode() != null) {
				queue.offer(node.getRightNode());
			}
		}
	}*/
}
