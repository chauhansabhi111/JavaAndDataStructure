package com.preparation.designpatterns.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	private void print()
	{
		System.out.println("Implementation Working fine");
	}
	
	public static void main(String[] args) {
		System.out.println(EnumSingleton.INSTANCE);
		EnumSingleton obj= EnumSingleton.INSTANCE;
		obj.print();
	}
}
