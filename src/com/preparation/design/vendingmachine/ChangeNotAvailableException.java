package com.preparation.design.vendingmachine;

public class ChangeNotAvailableException extends Exception {
	private String message=null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ChangeNotAvailableException(String message)
	{
		this.message=message;
	}
	
	@Override
    public String getMessage(){
        return message;
    }
}
