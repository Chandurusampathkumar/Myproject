package gsr.Qbend.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class StockManagementForIssues extends StockManagement
{

	QBactionLib QBA = new QBactionLib();
		
		@Test
		public boolean StockDetailsBook() throws Exception
		{
			try
			{
				String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
				FileInputStream in = new FileInputStream(new File(RFile));
				Properties pro = new Properties(); 
				pro.load(in);
				
				String  SiteName = pro.getProperty("StockManagementSiteName");
				QBA.setText(StockmangementSitename, SiteName);
				QBA.selectListValue(StockmangementDD, "Issues");
				QBA.clickButton(StockmangementSearch);
			}
			catch(Exception e)
			{
				
			}
			return true;
		}
			
		

	}


