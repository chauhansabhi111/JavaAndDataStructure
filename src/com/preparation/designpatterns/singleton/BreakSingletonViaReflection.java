package com.preparation.designpatterns.singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class BreakSingletonViaReflection 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		EagerInitializationSingleton instance1= EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instance2=null;
		
		Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors)
		{
			constructor.setAccessible(true);
			instance2= (EagerInitializationSingleton) constructor.newInstance();
		}
		System.out.println(instance1);
		System.out.println(instance2);
	}
}
