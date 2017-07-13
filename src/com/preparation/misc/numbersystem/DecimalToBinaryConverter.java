package com.preparation.misc.numbersystem;

public class DecimalToBinaryConverter {

	public static void main(String[] args) 
	{
		convertDecimalToOtherNumberSystem(3200,2);
	}
	
	private static void convertDecimalToOtherNumberSystem(int decimalNumber,int otherNumberSystem)
	{
		int remainder=0;
		String binaryNumber="";
		if(decimalNumber==0)
		{
			binaryNumber=String.valueOf(decimalNumber);
			System.out.println(binaryNumber);
		}
		else
		{
			while(decimalNumber!=0)
			{
				remainder=decimalNumber%otherNumberSystem;
				decimalNumber=decimalNumber/otherNumberSystem;
				binaryNumber=binaryNumber+remainder+"";
			}
			System.out.println(new StringBuffer(binaryNumber).reverse());
		}
	}
}
