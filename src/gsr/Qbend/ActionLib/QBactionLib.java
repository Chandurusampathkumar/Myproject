package gsr.Qbend.ActionLib;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QBactionLib {

	public static WebDriver Driver ;
	
	
		//******************************************************************************************************************************************	
		/**
		 * Function to Login into Qbend application
		 * @param slocator, sValue 
		 */	
		

		public  boolean Login(String slocator, String sValue,String slocator1,String svalue1) throws Exception
			{
				try
				{
					System.out.println("Trying to Login Qbend :" +" with username and password = " + sValue);
					Driver.findElement(By.xpath(slocator)).sendKeys(sValue);
					Driver.findElement(By.xpath(slocator1)).sendKeys(svalue1);
					System.out.println("Login into the Qbend application with username as:" + sValue + " successful");
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
						
			}
		
	//******************************************************************************************************************************************	
		/**
		 * Function to Logout in  Qbend application
		 * @param slocator 
		 */	

			public boolean Logout(String slocator) throws Exception
			{
			try
			{
				System.out.println("Trying to Logout Qbend ");
				Driver.findElement(By.xpath(slocator)).click();
				System.out.println("Logout successful");
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
				
	}
		
		
	//******************************************************************************************************************************************	
			/**
			 * Function to set text in an Qbend forms field
			 * @param slocator, sValue 
			 */	
		
		public boolean setText(String slocator, String sValue) throws Exception
		{
			try
			{
				System.out.println("Trying to set text on field :" + slocator + " with value = " + sValue);
				Driver.findElement(By.xpath(slocator)).sendKeys(sValue);
				System.out.println("Set text on field : " + slocator + " successful");
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
					
		}
	//******************************************************************************************************************************************
			/**
			 * Function to click an Qbend forms button
			 * @param slacator, 
			 */	
			public boolean clickButton(String slocator) throws Exception
			{
				try
				{
					
					
					System.out.println("Trying to click the button :" + slocator);
					Driver.findElement(By.xpath(slocator)).click();
					//Thread.sleep(Integer.parseInt(ConfigProperties.Config.getProperty("Test_Execution_Speed")));
					System.out.println("Click button : " + slocator + " successful");
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					e.printStackTrace();
					throw new Exception(" Unable to execute - " + e.getMessage());
					//throw new Exception(sMessage);
				}
				
			}
	//******************************************************************************************************************************************

			/**
			 * Function to select a value from Qbend forms list 
			 * @param slocator, sValue 
			 */	
			public boolean selectListValue(String slocator, String sValue) throws Exception
			{
				try
				{
					
					System.out.println("Object : " + slocator + "exists");
					System.out.println("Trying to select the value :" + sValue + " from the list: " + slocator);
					Select select = new Select(Driver.findElement(By.xpath(slocator)));
					select.selectByVisibleText(sValue);
					
						System.out.println("Select list value :" + sValue + " from the list: " + slocator + " successful");
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
			}
	//******************************************************************************************************************************************

					/**
					 * Function to Click link from forms 
					 * @param slocator
					 */	
					public boolean ClickLink(String slocator) throws Exception
					{
						try
						{
							
							System.out.println("Object : " + slocator + "exists");
							System.out.println("Trying to Click the link value " + slocator);
							Driver.findElement(By.xpath(slocator)).click();
													
								System.out.println("link is clicked :" + slocator + " successful");
							return true;
						}
						catch(Exception e)
						{
							String sMessage = e.getMessage();
							//LastException.setLastError(sMessage);
							throw new Exception(sMessage);
						}
					}
	//******************************************************************************************************************************************	
					/**
					 * Function to get text in forms field
					 * @param slocator
					 */	
				
				public String getText(String slocator) throws Exception
				{
					try
					{
						System.out.println("Trying to get text on field :" + slocator + " with value = :" );
						WebElement TextElement = Driver.findElement(By.xpath(slocator));
						String gtext = TextElement.getText();
						System.out.println("get text on field value is : " + gtext );
						return gtext;
					}
					catch(Exception e)
					{
						String sMessage = e.getMessage();
						//LastException.setLastError(sMessage);
						throw new Exception(sMessage);
					}
							
				}
	//******************************************************************************************************************************************	
				/**
				 * Function to Window maximize
				 * @param null
				 */	
			
			public boolean Windowmaximize() throws Exception
			{
				try
				{
					System.out.println("Trying to maximize the window" );
					Driver.manage().window().maximize();
					System.out.println("Window maximize successful" );
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
						
			}
	//******************************************************************************************************************************************	
			/**
			 * Function to Radiobutton selection
			 * 		 * @param slocator
			 */	
		
		public boolean RadioB(String slocator ) throws Exception
		{
			try
			{
				System.out.println("Trying to select radio button" );
				WebElement Radio = Driver.findElement(By.xpath(slocator));
				Radio.click();
				System.out.println("Radio button selected successful" );
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
					
		}
			
	//******************************************************************************************************************************************	
				/**
				 * Function to unselect radio button 
				 * @param String slocator
				 */	
			
			public boolean Radiounselect(String slocator) throws Exception
			{
				try
				{
					System.out.println("Trying to un select the  radio button" );
					WebElement Radio = Driver.findElement(By.xpath(slocator));
					
					//Checking if already select
					if(!Radio.isSelected())
						Radio.click();
					System.out.println("Radio button selected successful" );
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
						
			}
			
	//******************************************************************************************************************************************	
			/**
			 * Function to Explicit wait
			 * @param slocator
			 */	
		
		public boolean Explicitwait(String slocator) throws Exception
		{
			try
			{	
				System.out.println("waiting for element" );
				WebDriverWait wait = new WebDriverWait(Driver,75);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(slocator)));
				
				System.out.println("system executed the script successful " );
				
				
				return true;
			}
			catch(Exception e)
			{
				String sMessage = e.getMessage();
				//LastException.setLastError(sMessage);
				throw new Exception(sMessage);
			}
					
		}
		//******************************************************************************************************************************************	
		/**
		 * Function to Clear text in forms field
		 * @param slocator
		 */	

			public boolean ClearText(String slocator) throws Exception
			{
				try
				{
					System.out.println("Trying to clear text on field :" + slocator + " with values = :" );
					WebElement Ctext = Driver.findElement(By.xpath(slocator));
					Ctext.clear();
					System.out.println("get text on field value is : " + Ctext );
					return true;
				}
				catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
				
	}
			//******************************************************************************************************************************************
					/**
					 * Function to click ID based button Qbend forms button
					 * @param slacator, sValue 
					 */	
					public boolean clickIDButton(String slocator) throws Exception
					{
						try
						{
							
							
							System.out.println("Trying to click the button :" + slocator);
							WebElement IDbutton=Driver.findElement(By.id(slocator));
							IDbutton.click();
							//Thread.sleep(Integer.parseInt(ConfigProperties.Config.getProperty("Test_Execution_Speed")));
							System.out.println("Click button : " + slocator + " successful");
							return true;
						}
						catch(Exception e)
						{
							String sMessage = e.getMessage();
							//LastException.setLastError(sMessage);
							e.printStackTrace();
							throw new Exception(" Unable to execute - " + e.getMessage());
							//throw new Exception(sMessage);
						}
						
					}	

					//******************************************************************************************************************************************
					/**
					 * Function to navigate  ID based button Qbend forms button
					 * @param slacator 
					 */	
					public boolean Navigate(String slocator) throws Exception
					{
						try
						{
							
							
							System.out.println("Trying to click the Navigation Link :" + slocator);
							WebElement Navigationlink=Driver.findElement(By.id(slocator));
							Navigationlink.click();
							//Thread.sleep(Integer.parseInt(ConfigProperties.Config.getProperty("Test_Execution_Speed")));
							System.out.println("Click Navigation : " + slocator + " successful");
							return true;
						}
						catch(Exception e)
						{
							String sMessage = e.getMessage();
							//LastException.setLastError(sMessage);
							e.printStackTrace();
							throw new Exception(" Unable to execute - " + e.getMessage());
							//throw new Exception(sMessage);
						}
						
					}
					//******************************************************************************************************************************************
					/**
					 * Function to Sendkeys function
					 * @param slacator keys
					 */	
					public boolean setKeys(String slocator, Keys enter ) throws Exception 
					{
						try
						{
							
							
							System.out.println("Object : " + slocator + "exists");
							System.out.println("Trying to select the value :" +  slocator  + " from the list: " + slocator);
							 Driver.findElement(By.xpath(slocator)).sendKeys(enter);
						
							return true;
						}
						catch(Exception e)
						{
							String sMessage = e.getMessage();
							//LastException.setLastError(sMessage);
							e.printStackTrace();
							throw new Exception(" Unable to execute - " + e.getMessage());
							//throw new Exception(sMessage);
						}// TODO Auto-generated method stub
						
					}
//******************************************************************************************************************************************
		/**
		 * Function to select a value from Qbend forms list 
		 * @param slocator, sValue 
		 */	
			public boolean MouseRightClick(String slocator, String slocator1) throws Exception
					{
						try
						{
							
							System.out.println("Object : " + slocator + "exists");
							System.out.println("Trying to right click on mouse menu option :" + slocator + " from: " + slocator);
							
							
							WebElement rightoption = QBactionLib.Driver.findElement(By.xpath(slocator));
					        Actions oAction1 = new Actions(QBactionLib.Driver);
					        oAction1.moveToElement(rightoption);
					        oAction1.contextClick(rightoption).build().perform();  /* this will perform right click */
					        
					        System.out.println("Trying to select menu option  :" + slocator + " from: " + slocator);
					        WebElement elementOpen = QBactionLib.Driver.findElement(By.xpath(slocator1)); /*This will select menu after right click */
					        Thread.sleep(1000);
					        elementOpen.click();
					        System.out.println("right click performed");
							
								
							return true;
						}
						catch(Exception e)
						{
							String sMessage = e.getMessage();
							//LastException.setLastError(sMessage);
							throw new Exception(sMessage);
						}
					}
			//******************************************************************************************************************************************
			/**
			 * Function to select a value from Qbend forms list 
			 * @param slocator, sValue 
			 */
			
			public boolean DragandDrop(String slocator, String slocator1) throws Exception
			{
				try
				{
					
					WebElement element = QBactionLib.Driver.findElement(By.xpath(slocator)); 
		
					WebElement target = QBactionLib.Driver.findElement(By.xpath(slocator1));
		
					(new Actions(QBactionLib.Driver)).dragAndDrop(element, target).perform();
				
				}catch(Exception e)
				{
					String sMessage = e.getMessage();
					//LastException.setLastError(sMessage);
					throw new Exception(sMessage);
				}
				return true;
			}
	}	

