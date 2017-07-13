package com.preparation.threading;

import java.util.ArrayList;
import java.util.List;

public class DeadLock extends Thread {
	
	private static List<String> resource1= new ArrayList<String>();
	private static List<String> resource2= new ArrayList<String>();
	
	public static void main(String[] args) throws Exception 
	{
		DeadLock thread1= new DeadLock();
		DeadLock thread2= new DeadLock();
		thread1.start();
		thread2.start();
	}
	@Override
	public void run() 
	{
		synchronized (resource1)
		{
			try 
			{
				Thread.sleep(1000);
				synchronized (resource2) 
				{
					System.out.println(resource2.size());
				}
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		synchronized (resource2)
		{
			try 
			{
				Thread.sleep(1000);
				synchronized (resource1) 
				{
					System.out.println(resource1.size());
				}
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
