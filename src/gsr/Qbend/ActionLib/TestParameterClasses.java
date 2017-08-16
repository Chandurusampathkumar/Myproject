package gsr.Qbend.ActionLib;



	import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import org.testng.annotations.Test;

	/**
	 * @author GauranG Shah
	 */
	
	public class TestParameterClasses {
	 
		//static String Filepath = "C:\\Users\\chanduru.s\\Desktop\\TestExecution.csv";
		/**
	  * 
	  * @param scenarioName - Row Name
	  * @param columnName
	  * @param fileName - CSV file name where data is stored
	  * @return - Sting value
	  */
		@Test
	 public String getValue(String scenarioName){
	  
	  try {

	   // csv file containing data
	   String strFile  =  "C:\\Users\\chanduru.s\\Desktop\\TestExecution.csv";;
	   String strLine   =   "";
	   StringTokenizer st  =   null;
	   int lineNumber   =   0;
	  
	   // create BufferedReader to read csv file
	   BufferedReader br = new BufferedReader(new FileReader(strFile));

	   strLine = br.readLine(); //read first line 
	   st = new StringTokenizer(strLine, ",");
	   
	   System.out.println(strLine);
	   int totalRows = st.countTokens();
	  
	   
	   Map<Object,String> mp=new HashMap<Object, String>();
	   
	   //Fetch the header
	   for(int row=0; row<totalRows; row++){
	    mp.put(new Integer(row), st.nextToken());
	   }
	   lineNumber++;

	   while ((strLine = br.readLine()) != null){
	    st = new StringTokenizer(strLine, ",");
	    lineNumber++;
	   // if(st.nextToken().equalsIgnoreCase(scenarioName)){
	     //Identified the row Now return the <span id="IL_AD12" class="IL_AD">specific</span> element based on column name specified.
	     /*totalRows= st.countTokens();
	     for(int key=1; key<=totalRows; key++){
	      String value = st.nextToken();
	     //if(mp.get(key).equalsIgnoreCase(columnName)){
	       return value;
	      }
	     }
	    }*/
	    } 
	 
	  }catch (Exception e){
	   System.out.println("Exception while reading csv file: " + e);
	  }
	  
	  return "Element Not Found";
	 }
	 
	 //This is just to show usage, you can discard this when you use in your project
	 /*public static void main(String[] args) {
		 TestParameterClasses rc = new TestParameterClasses();
	  System.out.println(rc.getValue("valid", "username","data.csv"));
	  
	 }*/

	}

