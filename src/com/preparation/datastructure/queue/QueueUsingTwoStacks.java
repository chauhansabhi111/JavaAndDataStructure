package com.preparation.datastructure.queue;

import java.util.Stack;
/**
 * Create two stacks : 's1' and 's2' as in the program given below
For insert operation :
    if size of s1 = 0 then
        push value into s1
    else
        push all popped elements from s1 to s2
        push value into s1
        push all popped elements from s2 to s1
 
For remove operation :
    if size of s1 = 0 then
        throw 'underflow' exception
    else 
        return pop element from s1
 * 
 * @author hug46010
 *
 */
public class QueueUsingTwoStacks {
	
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	
	QueueUsingTwoStacks()
	{
		s1= new Stack<Integer>();
		s2= new Stack<Integer>();
	}
	
	public void insert(int item)
	{
		s1.push(item);
	}
	
	public int delete()
	{
		int poppedItem=0;
		while(s1.size()>0)
		{
			poppedItem=s1.pop();
			s2.push(poppedItem);
		}
		poppedItem=s2.pop();
		while(s2.size()>0)
		{
			int item=s2.pop();
			s1.push(item);
		}
		return poppedItem;
	}
	
	private void display()
	{
		for(int i=0;i<s1.size();i++)
		{
			System.out.println("s1 enties");
			System.out.println(s1.get(i));
		}
	}
	
	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.delete();
		queue.display();
	}
}
