package com.preparation.datastructure.queue;

import java.util.Scanner;

public class QueueUsingArray {
	
	private int[] array;
	private int rear;
	private int front;
	private int size;;
	
	QueueUsingArray()
	{
		array= new int[100];
		rear=front=-1;
		size=array.length;
	}
	
	public void insert(int item)
	{
		if(rear==(size-1))
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear++;
			array[rear]=item;
		}
	}
	
	public int delete()
	{
		int item=0;
		if(front==rear)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			front++;
			item =array[front];
		}
		return item;
	}
	
	public void display()
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		QueueUsingArray queue= new QueueUsingArray();
		Scanner sc = new Scanner(System.in);
		char ch;
		int choice =0;
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1 for inser");
			System.out.println("2 for delete");
			System.out.println("3 for display");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter element to insert into queue");
			int item =sc.nextInt();
			queue.insert(item);
			break;

			case 2: System.out.println("Pop element from queue");
			item=queue.delete();
			System.out.println("item deleted from queue is "+item);
			break;

			case 3: System.out.println("Display queue elements");
			queue.display();
			break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			System.out.println("Do you want to continue??");
			ch = sc.next().charAt(0);

		}while(ch=='y' || ch=='Y');
		
	}
}
