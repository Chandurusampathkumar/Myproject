package gsr.Qbend.Admin;

import org.testng.annotations.Test;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.ManageFileTypes;

public class CreateManageFileTypes 
{
	QBactionLib QBA=new QBactionLib();
    CommonFunction comm=new CommonFunction();
@Test	
public void ValidManageFileType() throws Exception
{
	try
	{
		comm.LoginQbend();
		QBA.Explicitwait(ManageFileTypes.ManageFileTypeMB);
		QBA.clickButton(ManageFileTypes.ManageFileTypeMB);
		QBA.Explicitwait(ManageFileTypes.ManageFileTypeSalesFileType);
		QBA.setText(ManageFileTypes.ManageFileTypeSalesFileType,"PDF");
		QBA.setText(ManageFileTypes.ManageFileTypeFileExtention, "PDF");
		QBA.clickButton(ManageFileTypes.ManageFileTypeActiveCB);
		QBA.setText(ManageFileTypes.ManageFileTypeSnapFileType,"PDF");
		QBA.setText(ManageFileTypes.ManageFileTypeSnapFileExtension, "PDF");
		QBA.clickButton(ManageFileTypes.ManageFileTypeSnapActiveCB);
		QBA.clickButton(ManageFileTypes.ManageFileTypeIstemplate);
		QBA.selectListValue(ManageFileTypes.ManageFileTypeTDD, "Ebook");
		QBA.ClickLink(ManageFileTypes.ManageFileTypeEditB);
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
	

}
