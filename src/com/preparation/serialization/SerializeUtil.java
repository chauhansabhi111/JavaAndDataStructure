package com.preparation.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeUtil  {

	/**
	 * 
	 */
	 private ObjectOutputStream objOS =null;
	private ObjectInputStream objIS=null;
	public  void serializeObject(Employee obj, String filepath)
	{
		try 
		{
			 objOS = new ObjectOutputStream(new FileOutputStream(filepath));
			objOS.writeObject(objOS);
			objOS.flush();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void deSerializeObject(String filepath)
	{
		try {
			 objIS = new ObjectInputStream(new FileInputStream(filepath));
			try {
				Employee e=(Employee) objIS.readObject();
				System.out.println(e.getAge());
				System.out.println(e.getName());
				System.out.println(e.getRollNumber());
				objIS.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge("26");
		emp.setName("Abhi");
		emp.setRollNumber("1");
		new SerializeUtil().serializeObject(emp, "C:\\Users\\hug46010\\Downloads\\file\\abc1.txt");
	//	new SerializeUtil().deSerializeObject("C:\\Users\\hug46010\\Downloads\\file\\abc.txt");
	}
	
}
