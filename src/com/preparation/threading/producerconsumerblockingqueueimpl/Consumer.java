package com.preparation.threading.producerconsumerblockingqueueimpl;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Consumer implements Runnable
{
	BlockingQueue<Integer> sharedList = new LinkedBlockingDeque<Integer>();

	Consumer(BlockingQueue<Integer> sharedList)
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
		Thread.sleep(1000);
		int i=sharedList.take();
		System.out.println("Consumed item"+i);
	}
}
