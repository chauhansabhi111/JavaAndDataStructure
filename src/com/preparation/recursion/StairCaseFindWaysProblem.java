package com.preparation.recursion;

public class StairCaseFindWaysProblem {
	
	public static void main(String[] args) 
	{
		System.out.println("No of ways "+countWays(6));
	}
	
	private static int countWays(int noOfSteps)
	{
		if(noOfSteps==1 || noOfSteps==2)
		{
			return noOfSteps;
		}
		else
		{
			return countWays(noOfSteps-1)+countWays(noOfSteps-2);
		}
	}
	
	private static int generalisedCountWays(int totalSteps,int maxStepsAtATime)
	{
		return generalisedCountWaysUtil(totalSteps+1, maxStepsAtATime);
	}
	
	private static int generalisedCountWaysUtil(int totalSteps,int maxStepsAtATime)
	{
		int res=0;
		if(totalSteps<=1)
		{
			return totalSteps;
		}
		else
		{
			for(int i=0;i<maxStepsAtATime;i++)
			{
				res+= generalisedCountWaysUtil(totalSteps-i,maxStepsAtATime);
			}
		}
		return res;
	}

}
