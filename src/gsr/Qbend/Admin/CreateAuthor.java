package gsr.Qbend.Admin;
import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.Author;
import gsr.Qbend.util.AppConstant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class CreateAuthor
{
	
	
	QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();
	
	
	
@Test(priority = 02)
public void ValidAuthor() throws Exception
  {
	try
	{	Comm.LoginQbend();
		QBA.Explicitwait(Author.AuthorMB);
		QBA.clickButton(Author.AuthorMB);
		QBA.Explicitwait(Author.AuthorCreateNewAuthor);
		QBA.clickButton(Author.AuthorCreateNewAuthor);
		System.out.println("trying");
		Thread.sleep(1000);
		
			QBactionLib.Driver.switchTo().frame("Authorwindow");
			Thread.sleep(1000);
		
			QBA.Explicitwait(Author.AuthorFirstname);
			QBA.setText(Author.AuthorFirstname, AppConstant.Author_Name);
			QBA.setText(Author.AuthorMiddlename,"h");
			QBA.setText(Author.AuthorLastname,"Lastname");
			QBA.setText(Author.AuthorTitle,"Testing");
			QBA.setText(Author.AuthorDescrition,"testing");
			QBA.setText(Author.AuthorBlog, "www.sample.com");
			QBA.setText(Author.AuthornewEmail,AppConstant.Author_Email);
			QBA.clickButton(Author.AuthorSubmit);
			Thread.sleep(2000);
			
		
			Comm.CloseBrowser(); 
		 }
	
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	  }
		
}
