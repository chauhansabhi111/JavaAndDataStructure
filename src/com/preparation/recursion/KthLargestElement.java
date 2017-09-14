package com.preparation.recursion;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String[] args)
	{
		PriorityQueue< Integer > prq = new PriorityQueue <> ((x,y) -> y-x);
		prq.add(10);
		prq.add(50);
		prq.add(101);
		prq.add(500);
		prq.add(100);
		prq.add(503);
		findKthMaxElement(prq,2);
	}

	private static int maxHeapify(PriorityQueue< Integer > prq)
	{
		return prq.poll();
	}
	
	private static void findKthMaxElement(PriorityQueue< Integer > prq,int k)
	{
		int item=0;
		for(int i=0;i<k;i++)
		{
			item=maxHeapify(prq);
		}
		System.out.println(item);
	}
}
