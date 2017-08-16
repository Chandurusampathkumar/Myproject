package gsr.Qbend.Admin;

import org.testng.annotations.Test;

public class SitePeriodicalCatalogMapcategory extends SitePeriodicalCatalog
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean MapBookToCategory() throws Exception
	{
		try
		{
			QBA.clickButton(SitePeriodicalCatalogSearchB);
			//String ParentWindow =Driver.getWindowHandle();
		   // for(String ChildWindow :Driver.getWindowHandles());
		    {
		    	QBA.clickButton(SitePeriodicalCatalogQbendSiteId);
		    	QBA.clickButton(SitePeriodicalCatalogPopUpWindowSubmitB);
		    }
		    QBA.setText(SitePeriodicalCatalogBookNameTB, "A dictionary of critical Theory");
		    QBA.clickButton(SitePeriodicalCatalogBelowSearchB);
		    //QBA.DragAndDrop(SitePeriodicalCatalogJournalDragId, SitePeriodicalCatalogJournalDropId);
		}
		catch(Exception e)
		{
			
		}
		return true;
    }
}
