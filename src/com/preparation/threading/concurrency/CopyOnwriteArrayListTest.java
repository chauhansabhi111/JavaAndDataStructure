package com.preparation.threading.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnwriteArrayListTest {
	
	public static void main(String[] args) {/*
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("how are you");
		list.addIfAbsent("hello");
		List<String> list1= new ArrayList<String> ();
		list1.add("abc");
		list.addAllAbsent(list1);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
		//	iterator.remove();
			//list.remove(string);
		}*/
		Integer i=10;
		System.out.println(i.hashCode());
	}

}
