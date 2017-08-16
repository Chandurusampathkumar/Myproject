package gsr.Qbend.Admin;
import gsr.Qbend.Common.CommonFunction;
import org.testng.annotations.Test;
import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.TransactionLib.FrequentlySearchedKeywords;

public class CreateFSK {

	static QBactionLib QBA=new QBactionLib();
	CommonFunction comm=new CommonFunction();


@Test
public void ValidFSK() throws Exception
 {
	try 
	{
		comm.LoginQbend();
		QBA.Explicitwait(FrequentlySearchedKeywords.FrequentlySearchedKeywordB);
		QBA.clickButton(FrequentlySearchedKeywords.FrequentlySearchedKeywordB);
		QBA.Explicitwait(FrequentlySearchedKeywords.SiteName);
		QBA.setText(FrequentlySearchedKeywords.SiteName,"121.241.155.18");
		QBA.clickButton(FrequentlySearchedKeywords.FetchB);
		QBA.Explicitwait(FrequentlySearchedKeywords.KeywordsTB);
		QBA.setText(FrequentlySearchedKeywords.KeywordsTB,"TEstiniog");
		QBA.setText(FrequentlySearchedKeywords.CountTB,"232");
		QBA.clickButton(FrequentlySearchedKeywords.BlockUnblockCB);
		QBA.ClickLink(FrequentlySearchedKeywords.AddEdit);
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 
 }
}
