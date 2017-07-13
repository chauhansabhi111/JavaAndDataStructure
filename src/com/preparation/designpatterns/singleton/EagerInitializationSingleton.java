package com.preparation.designpatterns.singleton;

public class EagerInitializationSingleton {
	
	private EagerInitializationSingleton()
	{
		
	}
	
	private static EagerInitializationSingleton instance=new EagerInitializationSingleton();
	
	public static EagerInitializationSingleton getInstance()
	{
		return instance;
	}

}
