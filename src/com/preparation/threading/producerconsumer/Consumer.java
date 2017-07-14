package com.preparation.threading.producerconsumer;

import java.util.List;

public class Consumer implements Runnable
{
	private  List<Integer> sharedList=null;

	Consumer(List<Integer> sharedList)
	{
		this.sharedList=sharedList;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				consume();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	private void consume() throws InterruptedException
	{
		synchronized (sharedList) 
		{
			while(sharedList.isEmpty())
			{
				System.out.println("Shared list is empty so waiting for producer to produce item");
				sharedList.wait();
			}
			Thread.sleep(1000);
			int i=sharedList.remove(0);
			System.out.println("Consumed item"+i);
			sharedList.notifyAll();
		}
	}

}
