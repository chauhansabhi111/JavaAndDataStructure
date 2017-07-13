package com.preparation.datastructure.linkedlist;

import java.util.LinkedList;

public class ReverseDoblyLinkedList {
	static Node head;
	public static void main(String[] args) 
	{
		
		Node node1= new Node(1);
		node1.setLeftLink(null);
		Node node2= new Node(2);
		node2.setLeftLink(node1);
		node1.setRightNode(node2);
		Node node3= new Node(3);
		node2.setRightNode(node3);
		node3.setLeftLink(node2);
		node3.setRightNode(null);
		System.out.println("List before reversing");
		head=node1;
		printList(head);
		reverse();
		System.out.println();
		System.out.println("List after reversing");
		printList(head);
	}

	
	static void reverse() 
	{
		Node temp = null;
		Node current = head;
		while (current != null)
		{
			temp = current.getLeftLink();
			current.setLeftLink(current.getRightNode());
			current.setRightNode(temp);
			current = current.getLeftLink();
		}
		if (temp != null)
		{
			head = temp.getLeftLink();
		}
	}
	
	static void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.getData() + " ");
			node = node.getRightNode();
		}
	}
}
