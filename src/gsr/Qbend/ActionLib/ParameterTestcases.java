package gsr.Qbend.ActionLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestcases {

	
		 
	//static String Filepath = "C:\\Users\\chanduru.s\\Desktop\\TestExecution.csv";
	 
		@Test(dataProvider = "Testclassnames")
		public static ArrayList<String[]> createTestData(String Testclassnames) throws IOException {
	 
			System.out.println("Testclass : " + Testclassnames);
			 ArrayList<String[]> Records = new ArrayList<String[]>();
			  String Record;
			  BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\chanduru.s\\Desktop\\TestExecution.csv"));
			  while((Record = file.readLine())!= null)
			  {
				  String fields[] = Record.split(",");
				  Records.add(fields);
			  }
			  file.close();
			  System.out.println(Records);
			
			return Records;
		}
			
}
	 
	 
		
	 






	
	

