package com.preparation.design.vendingmachine;

public class SoldOutException extends Exception {
	private String message=null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public SoldOutException(String message)
	{
		this.message=message;
	}
	
	@Override
    public String getMessage(){
        return message;
    }
}
