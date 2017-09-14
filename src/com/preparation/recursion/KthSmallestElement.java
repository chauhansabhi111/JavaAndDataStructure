package com.preparation.recursion;

import java.util.PriorityQueue;

public class KthSmallestElement {
	
	public static void main(String[] args) {
		PriorityQueue< Integer > prq = new PriorityQueue <> ();
		prq.add(10);
		prq.add(50);
		prq.add(101);
		prq.add(500);
		prq.add(100);
		prq.add(503);
		findKthMinElement(prq,2);
		
	}

	private static int minHeapify(PriorityQueue< Integer > prq)
	{
		return prq.poll();
	}
	
	private static void findKthMinElement(PriorityQueue< Integer > prq,int k)
	{
		int item=0;
		for(int i=0;i<k;i++)
		{
			item=minHeapify(prq);
		}
		System.out.println(item);
	}
}
