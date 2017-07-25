package com.preparation.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CsvReaderWriter {
	
	public static List<List<String>> csvReader(String filePath) throws Exception
	{
		List<List<String>> allFileData=null;
		if(filePath!=null && !filePath.isEmpty())
		{
			File fileDir= new File(filePath);
			allFileData= new ArrayList<List<String>>();
			if(fileDir!=null && fileDir.listFiles().length>0)
			{
				for (File file : fileDir.listFiles()) 
				{
					List<String> fileData= new ArrayList<String>();
					Scanner scanner = null;
					try 
					{
						String line=null;
						scanner=new Scanner(file);
						while(scanner.hasNext())
						{
							line=scanner.next();
							StringTokenizer st = new StringTokenizer(line,",");
							while(st.hasMoreElements())
							{
								fileData.add((String) st.nextElement());
							}
							allFileData.add(fileData);
						}
					}
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					}
					finally
					{
						scanner.close();
					}
					
				}
			}
			else
			{
				throw new Exception("File not present, path is invalid");
			}
		}
		return allFileData;
	}
	
	public static void csvWriter(String filePath,List<List<String>> allFileData)
	{
		if(filePath!=null && !filePath.isEmpty())
		{
			File fileDir= new File(filePath);
			FileWriter writer=null;
			try 
			{
				writer = new FileWriter(fileDir);
				for (List<String> fileData : allFileData) 
				{
					String line=null;
					for (String string : fileData)
					{
						line=string+",";
					}
					line=line+"\\n";
					writer.write(line);
				}
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			List<List<String>> allFileData=csvReader("C:\\Users\\hug46010\\Documents\\output");
			csvWriter("C:\\Users\\hug46010\\Documents\\output\\file1.csv",allFileData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
