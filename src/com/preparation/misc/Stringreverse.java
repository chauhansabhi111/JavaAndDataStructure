package com.preparation.misc;

public class Stringreverse {
	
	public static void main(String[] args) 
	{
		System.out.println(stringReverse("My Name Is Abhishek"));
	}
	
	private static String stringReverse(String s)
	{
		String reverse="";
		if(s==null || s.isEmpty())
		{
			System.out.println("String is null, blank or empty");
		}
		else
		{
			if(s.length()==1)
			{
				reverse=s;
			}
			else
			{
				reverse+=s.charAt(s.length()-1)+stringReverse(s.substring(0,s.length()-1));
			}
		}
		return reverse;
	}

}
