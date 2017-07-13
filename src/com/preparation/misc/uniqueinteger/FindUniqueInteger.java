package com.preparation.misc.uniqueinteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueInteger {
	
	public static List<Integer> findUniqueInteger(int[] arrayInteger)
	{
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer> ();
		for (int i = 0; i < arrayInteger.length; i++) 
		{
			if(map.containsKey(arrayInteger[i]))
			{
				map.put(arrayInteger[i], map.get(arrayInteger[i])+1);
			}
			else
			{
				map.put(arrayInteger[i], 1);
			}
		}
		for (Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				list.add(entry.getKey());
			}
		}
		return list;
	}

	public static List<Integer> findUniqueIntegerBySorting(int[] arrayInteger)
	{
		Arrays.sort(arrayInteger);
		List<Integer> list = new ArrayList<Integer> ();
		for (int i = 0; i < arrayInteger.length;i=i+2) {
			if(i<arrayInteger.length-1 && arrayInteger[i]!=arrayInteger[i+1])
			{
				 list.add(arrayInteger[i]);
			}
			else if(i==arrayInteger.length-1 )
			{
				 list.add(arrayInteger[i]);
			}
			
		}
		return list;
	}
	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1,3,5,6,7,8,9,0,1,0,6};
		long startTime=  new Date().getTime();
		System.out.println(FindUniqueInteger.findUniqueInteger(myList));
		//List<Integer> list=FindUniqueInteger.findUniqueIntegerBySorting(myList);
		
		//List<Integer> list1=FindUniqueInteger.findUniqueIntegerBySorting(myList);
		System.out.println("Time taken is "+ (new Date().getTime()-startTime));
	}
}
