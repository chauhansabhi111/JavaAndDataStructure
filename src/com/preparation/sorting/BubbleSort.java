package com.preparation.sorting;

import java.util.ArrayList;
import java.util.List;
/*Best case: Already sorted array
Worst case:  Reverse sorted array

Time Complexity:-
1. best case O(n)
2. Worst Case O(n^2)
3. Average case O(n^2)

Space Complexity: O(1) since it requires only one temp variable to exchange the values.
*/
public class BubbleSort {
	
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer> ();
		list.add(5);
		list.add(6);
		list.add(50);
		list.add(60);
		list.add(500);
		list.add(3);
		list.add(1);
		list.add(1000);
		bubbleSort(list);
	}
	
	private static void bubbleSort(List<Integer> list)
	{
		if(list !=null && list.size()>0)
		{
			boolean isSwappingHappening=false;
			Object[] array = (Object[]) list.toArray();
			for (int i = 0; i < array.length; i++) 
			{
				for (int j = 0; j < array.length-i-1; j++) 
				{
					if((int)array[j]> (int)array[j+1])
					{
						Object temp=array[j+1];
						array[j+1]=array[j];
						array[j]=temp;
						isSwappingHappening=true;
					}
				}
				if(!isSwappingHappening)
				{
					System.out.println("Sorting done, No need to do further iterations");
					break;
				}
			}
			for (int i = 0; i < array.length; i++) 
			{
				System.out.println(array[i]);
			}
		}
	}
}
