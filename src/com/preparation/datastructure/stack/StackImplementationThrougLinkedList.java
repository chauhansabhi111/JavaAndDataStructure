package com.preparation.datastructure.stack;

import java.util.NoSuchElementException;
import java.util.Scanner;


/**
Push Operation : O(1)
Pop Operation : O(1)
Top Operation : O(1)
Search Operation : O(n) 
 * @author hug46010
 *
 */
public class StackImplementationThrougLinkedList 
{
	private Node top;
	private int size;
	
	public int getSize()
    {
        return size;
    } 
	StackImplementationThrougLinkedList()
	{
		top=null;
		size=0;
	}
	
	public void push(int data)
	{
		Node node= new Node(data,null);
		if(top==null)
		{
			top=node;
		}
		else
		{
			node.setLink(top);
			top=node;
		}
		size++;
	}
	
	public int pop() throws Exception
	{
		int dataPopped=0;
		if(top==null)
		{
			throw new Exception("Underflow exception");
		}
		else
		{
			Node node=top;
			top=node.getLink();
			dataPopped=node.getData();
			size--;
		}
		return dataPopped;
	}
	
	public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
	 public boolean isEmpty()
	    {
	        return top == null;
	    } 
	public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return top.getData();
    }  
	
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);   
	        /* Creating object of class linkedStack */   
	        StackImplementationThrougLinkedList ls = new StackImplementationThrougLinkedList();          
	        /* Perform Stack Operations */  
	        System.out.println("Linked Stack Test\n");  
	        char ch;     
	        do 
	        {
	            System.out.println("\nLinked Stack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. size");            
	            int choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 :
	                System.out.println("Enter integer element to push");
	                ls.push( scan.nextInt() ); 
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = "+ ls.pop());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }    
	                break;                         
	            case 3 : 
	                try
	                {
	                    System.out.println("Peek Element = "+ ls.peek());
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = "+ ls.isEmpty());
	                break;                
	            case 5 : 
	                System.out.println("Size = "+ ls.getSize()); 
	                break;                
	            case 6 : 
	                System.out.println("Stack = "); 
	                ls.display();
	                break;                        
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }           
	            /* display stack */    
	            ls.display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);       
	 
	        } while (ch == 'Y'|| ch == 'y');                 
	    }
}
