package gsr.Qbend.Admin;

import org.testng.annotations.Test;

public class SortingWhiteLabelSites extends Sorting
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean WhiteLabelSite() throws Exception
	{
		try
		{
			QBA.clickButton(SortingWhitelabelsitesB);
			QBA.clickButton(SortingWhiteLabelSiteSearchB);
			QBA.clickButton(SortingWhiteLabelSitePopUpSitenameRB);
			QBA.clickButton(SortingWhiteLabelSitePopUpSubmitB);
			QBA.clickButton(SortingWhiteLabelSiteSampleCategory);
			QBA.selectListValue(SortingWhiteLabelSiteSampleDD, "Published Date A-Z");
			QBA.clickButton(SortingWhiteLabelSiteSaveB);
			
		}
		catch(Exception e)
		{
			
		}
		return true;
	}

}
