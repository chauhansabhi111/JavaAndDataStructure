package com.preparation.design.vendingmachine;

public class VendingMachineFactory {
	public static VendingMachineIf createVendingMachine() 
	{
		return new VendingMachineImpl();
	}
}
