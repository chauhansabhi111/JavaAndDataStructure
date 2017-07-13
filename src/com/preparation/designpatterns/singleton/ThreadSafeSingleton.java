package com.preparation.designpatterns.singleton;

public class ThreadSafeSingleton {
	
	private ThreadSafeSingleton()
	{
		
	}
	
	private static ThreadSafeSingleton instance=null;
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance !=null)
		{
			return new ThreadSafeSingleton();
		}
		return instance;
	}
}
