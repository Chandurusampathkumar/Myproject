package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.BookCatalogContentUnit;
import gsr.Qbend.TransactionLib.Bookcataloger;
import gsr.Qbend.util.AppConstant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewBook
{
	//WebDriver Driver;
	static QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();
	
	
	@Test (priority = 02)
	public void InvaildBookName() throws Exception
	{
		try {
			
			Comm.LoginQbend();		
			QBA.Explicitwait(Bookcataloger.Bookcatalog);
			QBA.clickButton(Bookcataloger.Bookcatalog);
			QBA.Explicitwait(Bookcataloger.Addnewbook);
			QBA.clickButton(Bookcataloger.Addnewbook);
			QBA.Explicitwait(Bookcataloger.Booktab);
			QBA.setText(Bookcataloger.Bookname,"GSR_Testa01");
			QBA.setText(Bookcataloger.ProductID,"DproductIDs");
			QBA.clickButton(Bookcataloger.ActiveBookTabCB);
			QBA.clickButton(Bookcataloger.ContentAvilabilityB);
			for(String popup :QBactionLib.Driver.getWindowHandles())
			{
				QBactionLib.Driver.switchTo().window(popup);
				QBA.clickButton(Bookcataloger.GlobalAvilable);
				QBA.clickButton(Bookcataloger.popOK);
				
			}
			QBA.clickButton(Bookcataloger.BooksTabsubmit);
			/*String msg	=QBA.getText(Bookcataloger.Bookvalidationmsg);
			String Validationmsg = "Save Failed: ProductID Gsrta01 already exists.";
			//Assert.assertEquals(Validationmsg,msg);*/
				
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false);
		}
			
	}
	
	@Test (priority = 03)
	public void ValidBookName() throws Exception 
	{
		try {
			Comm.ValidBookTab();
			
			
			}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test (priority = 04)
	public void VaildBookContentTab() throws Exception {
		try {
	          Comm.ContentTab();
	      	
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test (priority = 05)
	public void VaildBookFileLocationTab() throws Exception {
		try {
	          Comm.BookFileTabwithepup();
	         
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test (priority = 06)
	public void VaildBookPricingTab() throws Exception {
		try {
	          Comm.PricingTab();
	         
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	 @Test (priority = 07)						//(enabled=false)
	public void BookDragandDrop() throws Exception {
		try {
	          QBA.ClickLink(Bookcataloger.BoolLinkHead);
	          QBA.Explicitwait(BookCatalogContentUnit.SubmitBforsearch);
				QBA.setText(BookCatalogContentUnit.SearchBook,AppConstant.BOOK_NAME);
				QBA.clickButton(BookCatalogContentUnit.SubmitBforsearch);
				Thread.sleep(3000);
				QBA.clickButton(Bookcataloger.CategoryB);
				Thread.sleep(3000);
				WebElement dragElement=QBactionLib.Driver.findElement(By.xpath(Bookcataloger.DragElement));  
				WebElement dropElement=QBactionLib.Driver.findElement(By.xpath(Bookcataloger.DropElement));  
				
				Actions builder = new Actions(QBactionLib.Driver); // Configure the Action
				Thread.sleep(1000);
				  Action dragAndDrop = builder.clickAndHold(dragElement)
				    .moveToElement(dropElement)  
				    .release(dropElement)  
				    .build();  // Get the action  
				    dragAndDrop.perform();
				//QBA.DragandDrop(Bookcataloger.DragElement, Bookcataloger.DropElement);
				Thread.sleep(1000);
				Comm.checkAlert();
				
		}catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	@Test (dependsOnMethods = "VaildBookPricingTab")
	public void Close() throws Exception {
		try {
	          //Comm.CloseBrowser();
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	}
