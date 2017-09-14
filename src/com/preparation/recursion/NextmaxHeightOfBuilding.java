package com.preparation.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextmaxHeightOfBuilding {
	
	public static void main(String[] args) {
		
		List<Integer> buildingHeights= new ArrayList<Integer>();
		buildingHeights.add(19);
		buildingHeights.add(50);
		buildingHeights.add(2);
		buildingHeights.add(9);
		buildingHeights.add(60);
		buildingHeights.add(4);
		buildingHeights=getNextMaxHeight(buildingHeights);
		for (Integer integer : buildingHeights) {
			System.out.println(integer);
		}
	}
	
	private static List<Integer> getNextMaxHeight(List<Integer> buildingHeights)
	{
		List<Integer> nextMaxBuildingHeights= new ArrayList<Integer>();
		int item=0;
		int currentItem=0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(buildingHeights.get(0));
		for (int i = 1; i < buildingHeights.size(); i++) 
		{
			currentItem=buildingHeights.get(i);
			if(stack.size()>0)
			{
				item=stack.peek();
			}
			else
			{
				stack.push(currentItem);
			}
			if(item<currentItem)
			{
				stack.pop();
				nextMaxBuildingHeights.add(i);
			}
			else
			{
				stack.push(currentItem);
			}
		}
		return nextMaxBuildingHeights;
	}
}
