package com.preparation.datastructure.stack;

/**
Push Operation : O(1)
Pop Operation : O(1)
Top Operation : O(1)
Search Operation : O(n) 
 * @author hug46010
 *
 */
public class StackImplementationThrougArray {
	
	private static int top=-1;
	private static int[] array= new int [5];
	
	private static void push(int item) throws Exception
	{
		if(top>=array.length)
		{
			top++;
			array[top]=item;
		}
		else
		{
			System.out.println("Stack overflow");
			throw new Exception("Stack overflow");
		}
	}
	
	private static int pop(int item) throws Exception
	{
		int poppedItem=-1;
		if(top<=-1)
		{
			System.out.println("Stack underflow");
			throw new Exception("Stack underflow");
		}
		else
		{
			poppedItem=array[top--];
		}
		return poppedItem;
	}
	
	public static void main(String[] args) throws Exception 
	{
		StackImplementationThrougArray.push(10);
		StackImplementationThrougArray.push(10);
		StackImplementationThrougArray.push(10);
		StackImplementationThrougArray.push(10);
		//StackImplementationThrougArray.push(10);
		//StackImplementationThrougArray.push(10);
	//	StackImplementationThrougArray.push(10);
	}

}
