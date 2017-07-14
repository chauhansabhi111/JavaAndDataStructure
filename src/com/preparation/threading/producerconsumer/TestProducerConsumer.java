package com.preparation.threading.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class TestProducerConsumer 
{

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Producer producer= new Producer(list, 5);
		Consumer consumer= new Consumer(list);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}
}
