package gsr.Qbend.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class SiteBookCategoryMappingMapCategory extends SiteBookCategoryMapping
{
	QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean MapCategoryToSite() throws Exception
	{
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  SiteName = pro.getProperty("SiteBookCategoryMappingSiteName");
			QBA.setText(SiteBookCategoryMappingSiteNameTB, SiteName);
			QBA.clickButton(SiteBookCategoryMappingSearchB);
			QBA.clickButton(SiteBookCategoryMappingLeftSideBookCategoriesPlusSign);
			QBA.clickButton(SiteBookCategoryMappingSampleDataToMapCB);
			QBA.clickButton(EqualtoSymbolB);
			
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
	

}
