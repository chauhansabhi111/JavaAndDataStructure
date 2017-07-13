package com.preparation.datastructure.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurencesOfLetters {

	public static void main(String[] args) 
	{
		String s=" abhiabhiabhiabhiabhi";
		countOcccurence(s);
	}
	private static void countOcccurence(String input)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] tokens =input.split("");
		for (int i = 0; i < tokens.length; i++) 
		{
			String string = tokens[i];
			if(map.containsKey(string))
			{
				int value=map.get(string);
				value++;
				map.put(string, value);
			}
			else
			{
				map.put(string, 1);
			}
		}
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> entry: entryset)
		{
			System.out.print(entry.getKey()+entry.getValue());
		}
	}
}
