package com.preparation.threading.producerconsumerbylock;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable
{
	private  List<Integer> sharedList=null;
	private int size=0;

	Producer(List<Integer> sharedList, int size)
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
		Lock lock = new ReentrantLock();
		lock.lock();
		{
			while(sharedList.size()==size)
			{
				System.out.println("Shared list is full so waiting for consumer to consume item");
			}
			Thread.sleep(1000);
			sharedList.add(item);
			System.out.println("Produced item "+item);
		}
		lock.unlock();
	}
}
