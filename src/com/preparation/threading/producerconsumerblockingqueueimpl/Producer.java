package com.preparation.threading.producerconsumerblockingqueueimpl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Producer implements Runnable
{
	BlockingQueue<Integer> sharedList = new LinkedBlockingDeque<Integer>();
	private int size=0;

	Producer(BlockingQueue<Integer> sharedList , int size)
	{
		this.sharedList= sharedList;
		this.size=size;
	}
	public void run()
	{
		int counter=0;
		try 
		{
			while(true)
			{
				produce(counter++);
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	private void produce(int item) throws InterruptedException
	{
			Thread.sleep(1000);
			sharedList.put(item);
			System.out.println("Produced item "+item);
	}
}
