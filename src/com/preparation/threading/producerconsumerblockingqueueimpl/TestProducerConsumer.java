package com.preparation.threading.producerconsumerblockingqueueimpl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestProducerConsumer 
{

	public static void main(String[] args)
	{
		BlockingQueue<Integer> list = new LinkedBlockingDeque<Integer>(10);
		Producer producer= new Producer(list, 10);
		Consumer consumer= new Consumer(list);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}
}
