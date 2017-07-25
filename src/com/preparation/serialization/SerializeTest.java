package com.preparation.serialization;

public class SerializeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge("26");
		emp.setName("Abhi");
		emp.setRollNumber("1");
		new SerializeUtil().serializeObject(emp, "C:\\Users\\hug46010\\Downloads\\file\\abc1.txt");
	//	new SerializeUtil().deSerializeObject("C:\\Users\\hug46010\\Downloads\\file\\abc.txt");
	}
	

}
