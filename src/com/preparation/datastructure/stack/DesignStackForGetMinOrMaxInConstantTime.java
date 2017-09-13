package com.preparation.datastructure.stack;

import java.util.Stack;

public class DesignStackForGetMinOrMaxInConstantTime {
	private Stack<Integer> mainStack= new Stack<Integer> ();
	private Stack<Integer> auxStack= new Stack<Integer> ();
	public static void main(String[] args) {
		
	}
	
	private void push(int item)
	{
		if(auxStack.size()==0 || auxStack.peek()>item)
		{
			auxStack.push(item);
		}
		mainStack.push(item);
	}
	private int pop()
	{
		int item=0;
		if(mainStack.size()>0)
		{
			item=mainStack.pop();
			if(auxStack.size()>0 && auxStack.peek()==item)
			{
				auxStack.pop();
			}
		}
		return item;
	}
	
	private int getMin()
	{
		return auxStack.peek();
	}
}
