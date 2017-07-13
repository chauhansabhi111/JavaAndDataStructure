package com.preparation.misc.numbersystem;

public class ReversingNumber {
	
	public static void main(String[] args) {
		reverseNum(10002);
	}

	private static void reverseNum(long num)
	{
		if(num>0 && num<=9)
		{
			System.out.println(num);
		}
		else
		{
			long reverseNumber=0;
			long count=0;
			while(num!=0)
			{
				long remainder=num%10;
				long temp=(long) (remainder*(Math.pow(10, count)));
				reverseNumber=(long) (reverseNumber+temp);
				num=num/10;
				count++;
			}
			System.out.println(reverseNumber);
		}
	}
}
