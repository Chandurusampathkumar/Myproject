package gsr.Qbend.Common;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Excelread {
	
	
	private String filep = "C:\\Excelfolder\\"; 
	private String filen = "testdata.xlsx";
	private String sh = "Sheet2";

	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create a object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook ExcelWorkbook = null;

	    //Find the file extension by spliting file name in substring and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    ExcelWorkbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	    	ExcelWorkbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet ExcelSheet = ExcelWorkbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = ExcelSheet.getLastRowNum()-ExcelSheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it
	    for (int i = 1; i <= rowCount+1; i++) {
	    	System.out.println(ExcelSheet.getRow(2).getCell(1).getStringCellValue());
	    	String value = "New";
		    if(ExcelSheet.getRow(i).getCell(0).getStringCellValue()==value)
		    {
		    	
		    
	        Row row = ExcelSheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println("Last");
		    }else {}
	    }
	    
	}
	@Test(priority = 01)
    public void sampletest() throws Exception
    {
    	try{
    		List getvalues = getData();
    		System.out.println(getvalues.get(3));
    		Excelread er =new Excelread();
	    	er.readExcel(filep, filen, sh);
	 	
    	}catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
    	   	
    }
	public List getData() {
		 
        String path = "C:\\Excelfolder\\testdata.xlsx";
        List dataList = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File(path));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet2");
            java.util.Iterator rows = sheet.rowIterator();

            while (rows.hasNext()) {
                XSSFRow row = ((XSSFRow) rows.next());
                // int r=row.getRowNum();
                java.util.Iterator cells = row .cellIterator();
                int i = 0;
                String[] testData= new String[3];
                while (cells.hasNext()) {

                    XSSFCell cell = (XSSFCell) cells.next();
                    String value = cell.getStringCellValue();
                    if (!value.equals(null)) {
                         testData [i] = value;
                         i++;
                    }
                }
                dataList.add(testData);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
  }
	public void Property() throws Exception
	{
		try {
			
		String RFile = "D:\\Myproject\\Qbendworkingcopy\\QBData.properties";
		FileInputStream in = new FileInputStream(new File(RFile));
		Properties pro = new Properties(); 
		pro.load(in);
		String  Booknames = pro.getProperty("BookName");
		//AppConstant.BOOK_NAME = Booknames;
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
