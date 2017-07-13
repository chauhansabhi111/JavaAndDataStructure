package com.preparation.designpatterns.singleton;

public class StaticBlockInitializationSingleton {
	
	private StaticBlockInitializationSingleton()
	{
		
	}
	
	private static StaticBlockInitializationSingleton instance=null;
	
	static
	{
		instance= new StaticBlockInitializationSingleton();
	}
	
	public static StaticBlockInitializationSingleton getInstance()
	{
		return instance;
	}

}
