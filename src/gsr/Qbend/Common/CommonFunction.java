package gsr.Qbend.Common;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.TransactionLib.Bookcataloger;
import gsr.Qbend.util.AppConstant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CommonFunction  {

	static QBactionLib QBA = new QBactionLib();
	
	/****************************************************************************************************
	 * Qbend Login Function 	
	 * @return
	 * @throws Exception
	 */	
	public  void LoginQbend() throws Exception
	{
		try
		{
			
			QBactionLib.Driver = new FirefoxDriver();
			QBactionLib.Driver.manage().window().maximize();
			Property();
			System.out.println(AppConstant.APP_URL);
			QBactionLib.Driver.get(AppConstant.APP_URL);
			QBA.Login(Bookcataloger.username,AppConstant.Login_Username,Bookcataloger.password,AppConstant.Login_Password);
			QBA.clickButton(Bookcataloger.Logsubmitbutton);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	}
/****************************************************************************************************
 * 	
 * @return
 * @throws Exception
 */
	public void Property() throws Exception
	{
		try {
			
		String RFile = "D:\\Myproject\\Qbendworkingcopy\\QBData.properties";
		FileInputStream in = new FileInputStream(new File(RFile));
		Properties pro = new Properties(); 
		pro.load(in);
		String  Booknames = pro.getProperty("BookName");
		AppConstant.BOOK_NAME = Booknames;
		String  url = pro.getProperty("MainURL");
		AppConstant.APP_URL = url;
		String name = pro.getProperty("Username");
		AppConstant.Login_Username = name;
		String password = pro.getProperty("Password");
		AppConstant.Login_Password = password;
		String productid = pro.getProperty("ProductId");
		AppConstant.PRODUCT_ID = productid;
		String dbookname =	pro.getProperty("Dbookname");
		AppConstant.DBOOK_NAME = dbookname;
		String dproductid = pro.getProperty("DProductID");
		AppConstant.DPRODUCT_ID = dproductid;
		String resourceid = pro.getProperty("ResourceID");
		AppConstant.RESOURCE_ID = resourceid;
		String listprice = pro.getProperty("ListPrice");
		AppConstant.LIST_PRICE =listprice;
		String unitprice = pro.getProperty("UnitPrice");
		AppConstant.LIST_PRICE = unitprice;
		String Issuename = pro.getProperty("Issuetitle");
		AppConstant.Issue_NAME = Issuename;
		String journalproid = pro.getProperty("JournalProductid");
		AppConstant.JOURNAL_PRODUCTID = journalproid;
		String publishername = pro.getProperty("PublisherName");
		AppConstant.PUBLISHER_NAME = publishername;
		String shortname = pro.getProperty("ShortName");
		AppConstant.P_SHORTNAME = shortname;
		String Authorname = pro.getProperty("Authorname");
		AppConstant.Author_Name =  Authorname ;
		String AuthorEID = pro.getProperty("AuthorEmailID");
		AppConstant.Author_Email =  AuthorEID ;
		String Contentunitname = pro.getProperty("ContentUnitName");
		AppConstant.Content_TitleName =  Contentunitname ;
		String ContentunitproductID = pro.getProperty("ContentUnitproductID");
		AppConstant.Content_ProductID =  ContentunitproductID ;
		String AncillaryproductID = pro.getProperty("AncillaryproductID");
		AppConstant.Ancillary_ProductID =  AncillaryproductID ;
		String AncillarytitleName = pro.getProperty("AncillaryTitleName");
		AppConstant.Ancillary_TitleName =  AncillarytitleName ;
		String SearchContentName = pro.getProperty("SearchContentName");
		AppConstant.SearchContent_Title =  SearchContentName ;
		
		String SearchIssueContentName = pro.getProperty("SearchIssueTitleContentName");
		AppConstant.SearchIssue_Title =  SearchIssueContentName ;
		
		String IssueContentP_ID = pro.getProperty("IssueContentunitProductid");
		AppConstant.IssueUnit_productID =  IssueContentP_ID ;
		
		
		
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/****************************************************************************************************
	 *Bookcataloger module content tab function 	
	 * @return
	 * @throws Exception
	 */
		public void  ContentTab() throws Exception
		{
			try {
				
				//Conten tab ========================================================
				QBA.Explicitwait(Bookcataloger.ContentTab);
					QBA.clickButton(Bookcataloger.ContentTab);
					QBA.setText(Bookcataloger.SubTitle, "Gsr SubTitle");
					QBA.setText(Bookcataloger.Publishername, "GSRTest Publisher , USA");
					QBA.clickButton(Bookcataloger.Authorplus);
					for(String popup :QBactionLib.Driver.getWindowHandles())
					{
						QBactionLib.Driver.switchTo().window(popup);
						QBA.setText(Bookcataloger.popsearch, "gsr_test");
						QBA.clickButton(Bookcataloger.popsearchButt);
						QBA.Explicitwait(Bookcataloger.authourCB);
						QBA.clickButton(Bookcataloger.authourCB);
						QBA.clickIDButton(Bookcataloger.ContentpopOkButt);
					}
					QBA.clickButton(Bookcataloger.PurchaseCB);
					QBA.clickButton(Bookcataloger.RentCB);
					WebElement checkbox = QBactionLib.Driver.findElement(By.xpath(Bookcataloger.AvilableStoreCB));
					if(!checkbox.isSelected())
					{
					QBA.clickButton(Bookcataloger.AvilableStoreCB);
					} else
					{}
					QBA.clickButton(Bookcataloger.SnapCB);
					QBA.clickButton(Bookcataloger.ContentabSubmitButton);
					
					
					
					/*List<WebElement> tableRowCollection = webTableElement.findElements(By.xpath("/table"))
							List<String> elements = new LinkedList<String>();
							for (WebElement e : tableRowCollection) {
							    elements.add(e.getText());
							}*/
									
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Assert.assertTrue(false);
			}
	
			
		}
	
		/****************************************************************************************************
		 *Bookcataloger module File tab function 	
		 * @return
		 * @throws Exception
		 */
		public void BookFileTabwithepup() throws Exception  
			{
				try {
					
					//File Tab
					QBA.Explicitwait(Bookcataloger.FilelocationTab);
					QBA.clickButton(Bookcataloger.FilelocationTab);
					QBA.selectListValue(Bookcataloger.FileTypeDD, "ePub");
					QBA.setText(Bookcataloger.FileTabResourceID, AppConstant.RESOURCE_ID);
					QBA.setText(Bookcataloger.FiletabISBN10, "9874563218");
					QBA.clickButton(Bookcataloger.SubmitFiletypeB);
					QBA.Explicitwait(Bookcataloger.FilelocationtabValidationMsg);
					Thread.sleep(1000);
					//QBA.Explicitwait(Bookcataloger.Purchasevalidationmsg);
					
					//QBA.clickButton(Submitabove2B);
					/*QBA.clickButton(Bookcataloger.DRMFileDisplayCB);
					QBA.Explicitwait(Bookcataloger.DRMFileTypeDD);
					QBA.selectListValue(Bookcataloger.DRMFileTypeDD, "ePub");
					QBA.setText(Bookcataloger.DRMExpires, "2");
					QBA.selectListValue(Bookcataloger.DRMPurchaseSelectSecondsDD, "Week(s)");
					QBA.clickButton(Bookcataloger.FLTDRMCOPYCB);
					QBA.clickButton(Bookcataloger.FLTDRMPrintCB);
					QBA.clickButton(Bookcataloger.FLTDRMPurchaseSunmitB);
					QBA.Explicitwait(Bookcataloger.Purchasevalidationmsg);
					 
					///==============
					
					QBA.clickButton(Bookcataloger.DRMRentalTab);
					QBA.selectListValue(Bookcataloger.DRMRentTabSelectFile, "ePub");
					QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
					QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
					QBA.setText(Bookcataloger.DRMRentTabSelectionEvery, "2");
					QBA.selectListValue(Bookcataloger.DRMRentTabSecondsDD, "Week(s)");
					QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
					QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
					QBA.clickButton(Bookcataloger.DRMRentTabSubmitB);
					QBA.Explicitwait(Bookcataloger.Rentvalidationmsg);*/
				
					}catch (Exception e) {
						
							e.printStackTrace();
							Assert.assertTrue(false);
						}
					
				
			}
		
		
		/****************************************************************************************************
		 *Bookcataloger module File tab function 	
		 * @return
		 * @throws Exception
		 */
		public void IssueContentunitFileTabwithepup() throws Exception  
			{
				try {
					
					//File Tab
					QBA.Explicitwait(Bookcataloger.FilelocationTab);
					QBA.clickButton(Bookcataloger.FilelocationTab);
					QBA.selectListValue(Bookcataloger.FileTypeDD, "ePub");
					QBA.setText(Bookcataloger.FileTabResourceID, AppConstant.RESOURCE_ID);
					//QBA.setText(Bookcataloger.FiletabISBN10, "9874563218");
					QBA.clickButton(Bookcataloger.SubmitFiletypeB);
					QBA.Explicitwait(Bookcataloger.FilelocationtabValidationMsg);
					Thread.sleep(1000);
					//QBA.Explicitwait(Bookcataloger.Purchasevalidationmsg);
					
					//QBA.clickButton(Submitabove2B);
					/*QBA.clickButton(Bookcataloger.DRMFileDisplayCB);
					QBA.Explicitwait(Bookcataloger.DRMFileTypeDD);
					QBA.selectListValue(Bookcataloger.DRMFileTypeDD, "ePub");
					QBA.setText(Bookcataloger.DRMExpires, "2");
					QBA.selectListValue(Bookcataloger.DRMPurchaseSelectSecondsDD, "Week(s)");
					QBA.clickButton(Bookcataloger.FLTDRMCOPYCB);
					QBA.clickButton(Bookcataloger.FLTDRMPrintCB);
					QBA.clickButton(Bookcataloger.FLTDRMPurchaseSunmitB);
					QBA.Explicitwait(Bookcataloger.Purchasevalidationmsg);
					 
					///==============
					
					QBA.clickButton(Bookcataloger.DRMRentalTab);
					QBA.selectListValue(Bookcataloger.DRMRentTabSelectFile, "ePub");
					QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
					QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
					QBA.setText(Bookcataloger.DRMRentTabSelectionEvery, "2");
					QBA.selectListValue(Bookcataloger.DRMRentTabSecondsDD, "Week(s)");
					QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
					QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
					QBA.clickButton(Bookcataloger.DRMRentTabSubmitB);
					QBA.Explicitwait(Bookcataloger.Rentvalidationmsg);*/
				
					}catch (Exception e) {
						
							e.printStackTrace();
							Assert.assertTrue(false);
						}
					
				
			}
		
		/****************************************************************************************************
		 *Bookcataloger Issue module File tab function 	
		 * @return
		 * @throws Exception
		 */
			
		public void IssueFileTabwithepup() throws Exception  
		{
			try {
				
				//File Tab
				QBA.Explicitwait(Bookcataloger.FilelocationTab);
				QBA.clickButton(Bookcataloger.FilelocationTab);
				QBA.selectListValue(Bookcataloger.FileTypeDD, "ePub");
				QBA.setText(Bookcataloger.FileTabResourceID, AppConstant.RESOURCE_ID);
				QBA.setText(Bookcataloger.FiletabISSN,"443212");
			
				QBA.clickButton(Bookcataloger.SubmitFiletypeB);
				Thread.sleep(2000);
				//QBA.Explicitwait(Bookcataloger.Purchasevalidationmsg);
			}catch (Exception e) {
				
				e.printStackTrace();
				Assert.assertTrue(false);
			}
		
	
}
			
		/****************************************************************************************************
		 *Bookcataloger module File tab function 	
		 * @return
		 * @throws Exception
		 */
		public void FileTabwithepdf() throws Exception  
			{
				try {
							QBactionLib.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							QBA.Explicitwait(Bookcataloger.FilelocationTab);
							QBA.clickButton(Bookcataloger.FilelocationTab);
							QBA.selectListValue(Bookcataloger.FileTypeDD, "PDF");
							QBA.clickButton(Bookcataloger.SubmitFiletypeB);
							Thread.sleep(3000);
							//QBA.clickButton(Bookcataloger.Submitabove2B);
							QBA.clickButton(Bookcataloger.DRMFileDisplayCB);
							QBA.selectListValue(Bookcataloger.DRMFileTypeDD, "PDF");
							QBA.setText(Bookcataloger.DRMExpires, "2");
							QBA.selectListValue(Bookcataloger.DRMPurchaseSelectSecondsDD, "Week(s)");
							QBA.clickButton(Bookcataloger.FLTDRMCOPYCB);
							QBA.clickButton(Bookcataloger.FLTDRMPrintCB);
							QBA.clickButton(Bookcataloger.FLTDRMPurchaseSunmitB);
							QBA.clickButton(Bookcataloger.DRMRentalTab);
							QBA.selectListValue(Bookcataloger.DRMRentTabSelectFile, "PDF");
							QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
							QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
							QBA.setText(Bookcataloger.DRMRentTabSelectionEvery, "2");
							QBA.selectListValue(Bookcataloger.DRMRentTabSecondsDD, "Week(s)");
							QBA.clickButton(Bookcataloger.DRMRentTabPrintCB);
							QBA.clickButton(Bookcataloger.DRMRentTabCopyCB);
							QBA.setText(Bookcataloger.DRMRentTabSelectionEvery, "2");
							QBA.selectListValue(Bookcataloger.DRMRentTabSecondsDD, "Week(s)");
							QBA.clickButton(Bookcataloger.DRMRentTabSubmitB);
					
													
						}catch (Exception e) {
						
							e.printStackTrace();
							Assert.assertTrue(false);
						}
					
				
			}
		/****************************************************************************************************
		 *Bookcataloger module Pricing  tab function 	
		 * @return
		 * @throws Exception
		 */
		public void PricingTab() throws Exception 
		{
			try {
				
				QBA.Explicitwait(Bookcataloger.PricingTab);
				QBA.clickButton(Bookcataloger.PricingTab);
				QBA.selectListValue(Bookcataloger.PricingFileformatDD, "ALL");
				QBA.selectListValue(Bookcataloger.PricingSaleType, "Purchase");
				QBA.selectListValue(Bookcataloger.Currency, "America (United States of America), Dollars");
				QBA.setText(Bookcataloger.Unitprice, "20");
				QBA.clickButton(Bookcataloger.pricingActiveCB);
				QBA.clickButton(Bookcataloger.pricingEditB);
				QBA.Explicitwait(Bookcataloger.PricingUpdatedMsg);
				Thread.sleep(2000);
				}
			catch (Exception e) {
				
				e.printStackTrace();
				Assert.assertTrue(false);
			}
		}
			

		
		/****************************************************************************************************
		 *Bookcataloger module content tab function 	
		 * @return
		 * @throws Exception
		 */
			public void ValidBookTab() throws Exception
			{
				try {
					//BookTab ========================================================
					
					QBA.Explicitwait(Bookcataloger.Booktab);
					QBA.ClearText(Bookcataloger.Bookname);
					QBA.ClearText(Bookcataloger.ProductID);
					QBA.setText(Bookcataloger.Bookname,AppConstant.BOOK_NAME);
					QBA.setText(Bookcataloger.ProductID, AppConstant.PRODUCT_ID);
					QBA.setText(Bookcataloger.ISBN13, "GSR123456");
					QBA.setText(Bookcataloger.ISBNno10, "GSR9874563");
					QBA.setText(Bookcataloger.Edition, "Version 1.2");
					//QBA.clickButton(Bookcataloger.ActiveBookTabCB);
					QBA.setText(Bookcataloger.Series, "GSRSeries");
					QBA.setText(Bookcataloger.AgeMinimum, "18");
					QBA.setText(Bookcataloger.AgeMaximun, "100+");
					QBA.setText(Bookcataloger.Grademaximum, "55");
					QBA.setText(Bookcataloger.Grademinimum, "20");
					QBA.setText(Bookcataloger.CustomData, "Qbend Customer");
					QBA.clickButton(Bookcataloger.BooksTabsubmit);
					//String msg	=QBA.getText(Bookvalidationmsg);
					//Assert.assertEquals("Save Failed: ProductID Gsrta01 already exists.", QBA.getText(Bookvalidationmsg));
					
					//QBA.clickButton(Bookcataloger.ContentAvilabilityB);
						
						
				
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Assert.assertTrue(false);
				}
					
			}
	/****************************************************************************************************
	 *Alert function module content tab function 	
	 * @return
	 * @throws Exception
	 */			
				public void checkAlert() {
					try {
						System.out.println("========================1=======================");
						WebDriverWait wait = new WebDriverWait(QBactionLib.Driver, 10);
						wait.until(ExpectedConditions.alertIsPresent());
						Alert alert = QBactionLib.Driver.switchTo().alert();
						System.out.println("!!" + alert.getText());
	
						alert.accept();
					} catch (Exception e) {
						// exception handling
						e.printStackTrace();
					}
				}
	/*****************************************************************************************************************
				 *Alert function module content tab function 	
				 * @return
				 * @throws Exception
				 */			
					public void CloseBrowser() {
						try {
							System.out.println("========================1=======================");
							QBactionLib.Driver.close();
							System.out.println("!Close the Browser successfully!" );
				
						} catch (Exception e) {
							// exception handling
							e.printStackTrace();
						}
					}
}


