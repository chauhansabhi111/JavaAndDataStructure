package com.preparation.designpatterns.singleton;

public class LazyInitializationSingleton {
	
	private LazyInitializationSingleton()
	{
		
	}
	
	private static LazyInitializationSingleton instance=null;
	
	public static LazyInitializationSingleton getInstance()
	{
		if(instance !=null)
		{
			return new LazyInitializationSingleton();
		}
		return instance;
	}

}
