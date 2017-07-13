package com.preparation.misc.primenumber;

public class SumOfPrimes {
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Calculating sum for primes ");
		System.out.println(calculateSum(1000));
	}
	
	private static int calculateSum(int limit) throws Exception
	{
		int sum=0;
		int count=0;
		if(limit<=0)
		{
			return -1;
		}
		for(int i=0;;i++)
		{
			if(count==limit)
			{
				return sum;
			}
			else
			{
				if(checkIsNumIsPrime(i))
				{
					sum=sum+i;
					count++;
				}
			}
		}
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
