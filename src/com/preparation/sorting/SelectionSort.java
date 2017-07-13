package com.preparation.sorting;

import java.util.ArrayList;
import java.util.List;

/**
First find the smallest in the array and exchange it with the element in the first position,
 then find the second smallest element and exchange it with the element in the second position, 
 and continue in this way until the entire array is sorted.
Worst Case Time Complexity : O(n2) (array is already sorted in descending order)
Best Case Time Complexity : O(n2)
Average Time Complexity : O(n2)
Space Complexity : O(1)
 
 * @author hug46010
 *
 */
public class SelectionSort {
	
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer> ();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(60);
		list.add(500);
		list.add(3);
		list.add(10000);
		list.add(1000);
		selectionSort(list);
	}
	
	private static void selectionSort(List<Integer> list)
	{
		if(list !=null && list.size()>0)
		{
			Object[] array = (Object[]) list.toArray();
			for (int i = 1; i < array.length; i++) 
			{
				int min =i;
				int j=0;
				for(j=i+1;j<(int)array.length;j++)
				{
					if((int) array[j]<(int) array[i])
					{
						min=j;
					}
				}
				Object temp= array[i];
				array[i]=array[min];
				array[min]=temp;
			}
			for (int i = 0; i < array.length; i++) 
			{
				System.out.println(array[i]);
			}
		}
	}

}
