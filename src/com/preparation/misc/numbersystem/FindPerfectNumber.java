package com.preparation.misc.numbersystem;

import java.util.ArrayList;
import java.util.List;

public class FindPerfectNumber {
	
	public static void main(String[] args) throws Exception {
		findPerfectNumber(6);
	}

	private static void findPerfectNumber(int number) throws Exception
	{
		List<Integer> divisorList=null;
		long sum=0;
		if(number>0)
		{
			divisorList=getAllDivisorOfNumber(number);
			for (Integer integer : divisorList) {
				sum=sum+integer;
			}
			if(sum==number)
			{
				System.out.println("No is perfect no");
			}
		}
	}
	
	private static List<Integer> getAllDivisorOfNumber(int num) throws Exception
	{
		List<Integer> divisorList= new ArrayList<Integer>();
		if(num==0)
		{
			return divisorList;
		}
		else if(num ==1)
		{
			divisorList.add(num);
			return divisorList;
		}
		else if(checkIsNumIsPrime(num))
		{
			divisorList.add(1);
			//divisorList.add(num);
			return divisorList;
		}
		else
		{
			for(int i=2;i<(num/2+1);i++)
			{
				if(num%i==0)
				{
					divisorList.add(i);
				}
			}
			divisorList.add(1);
			//divisorList.add(num);
		}
		return divisorList;
	} 
	
	private static boolean checkIsNumIsPrime(int num) throws Exception
	{
		if(num<0)
		{
			throw new Exception("Only numbers greater than zero are supported");
		}
		else if(num==2 || num==3)
		{
			return true;
		}
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(!(num%i==0))
			{
				return true;
			}
		}
		return false;
	}
	
}
