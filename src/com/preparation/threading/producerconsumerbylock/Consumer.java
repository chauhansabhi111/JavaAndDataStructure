package com.preparation.threading.producerconsumerbylock;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable, Externalizable
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
		Lock lock = new ReentrantLock();
		lock.lock();
		{
			while(sharedList.isEmpty())
			{
				System.out.println("Shared list is empty so waiting for producer to produce item");
			}
			Thread.sleep(1000);
			int i=sharedList.remove(0);
			System.out.println("Consumed item"+i);
		}
		lock.unlock();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
