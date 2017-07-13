package com.preparation.sorting;

import java.util.ArrayList;
import java.util.List;

/**
It is Stable, as it does not change the relative order of elements with equal keys
Worst Case Time Complexity : O(n2) (Array sorted in reverse order)
Best Case Time Complexity : O(n) (Already sorted array)
Average Time Complexity : O(n2) (Key A[j] in array is less than half the elements in A[1 .. j − 1] and it is greater than the other half)
Space Complexity : O(1)
 * @author hug46010
 *
 */
public class InsertionSort {
	
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer> ();
		list.add(1);
		list.add(2);
		list.add(5);
		/*list.add(60);
		list.add(500);
		list.add(3);
		list.add(1);
		list.add(1000);*/
		insertionSort(list);
	}
	
	private static void insertionSort(List<Integer> list)
	{
		if(list !=null && list.size()>0)
		{
			Object[] array = (Object[]) list.toArray();
			for (int i = 1; i < array.length; i++) 
			{
				int key =(int) array[i];
				int j=i-1;
				while(j>=0 && key < (int)array[j])
				{
					array[j+1] = array[j];
					j--;
				}
				array[j+1] = key;
			}
			for (int i = 0; i < array.length; i++) 
			{
				System.out.println(array[i]);
			}
		}
	}

}
