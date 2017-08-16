package gsr.Qbend.Admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertfunction {
	
	public static WebDriver Driver;
	public static Action action ;
	
	
	public static Boolean keypressfunction () throws InterruptedException
	
	{
		
		try {
			Robot robot = new Robot();
			//Thread.sleep(3000);
			//Alert alert = BookCatalogCIssue.Driver.switchTo().alert();
			//System.out.println(alert.getText());
			//alert.accept();
			//for(String handles : CreateNewBook.Driver.getWindowHandles())
			//String mainWindowHandle=Driver.getWindowHandle();
			System.out.println("Popup");

			//System.out.println(Driver.switchTo().alert().getText());
			//Runtime.getRuntime().exec("D://Enter//ClickEnter.exe");
			
			//Doing a mouse over for the X and Y coordinates of button/link which opens modal window
			robot.mouseMove(210,350);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(100);
			//Clicking tab til the cursor is on specific position (textbox/button)
			robot.keyPress(KeyEvent.VK_TAB);
			robot.delay(100);
			//Doing a mouse over for the X and Y coordinates of button/link
			robot.mouseMove(300,150);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.delay(200);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(50);
			robot.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("afterclick");
			//

			//alert.dismiss();
			//((JavascriptExecutor)Driver).executeScript("window.confirm = function(popup){return true;};");


			//webElement.click();

			//Set<String> s = Driver.getWindowHandles();
			//Alert alert = Driver.switchTo().alert();
			//System.out.println(alert.getText());
			// Integer windows = s.size();
			//System.out.println(windows);
			//Iterator<String> ite = s.iterator();
			//while(ite.hasNext())
			{
			//String popupHandle=ite.next().toString();
			//if(popupHandle.length()=2)
			{
			//Driver.switchTo().window(popupHandle);
			//Robot robot = new Robot();
			// robot.keyPress(KeyEvent.VK_KP_RIGHT);
			// robot.delay(500);
			//robot.keyPress(KeyEvent.VK_KP_LEFT);
			//robot.delay(500);
			// robot.keyPress(KeyEvent.VK_ENTER);
			// robot.delay(50);
			//robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			// Driver.navigate().refresh();
			// Driver.get("http://121.241.155.18/CatalogerDev/Admin/BookContentTab.aspx?CategoryId=&Page=BookCatlog");
			}
			}


			//Driver.switchTo().window( mainWindowHandle );
			System.out.println("Done");
			
			}catch (Exception e)
			{ e.printStackTrace();
			}
			{
				//CreateNewBook.Driver.switchTo().window(handles);
				//robot.keyPress(KeyEvent.VK_ENTER);
				 Thread.sleep(10);
				// robot.keyRelease(KeyEvent.VK_ENTER);
			}
			return true;
			
		
		
	}
	public static boolean keypressfunction1 () throws InterruptedException
	
	{
		
		try {
			WebDriverWait wait = new WebDriverWait(Driver, 10);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("alert: "+alert);
			if (alert != null && ! alert.equals("")) {
			Alert alrt = Driver.switchTo().alert();
			alrt.accept();
			/*if (action.equalsIgnoreCase("accept")) {
			System.out.println("Alert Accepted");
			alrt.accept();
			} else if (Action.equalsIgnoreCase("cancel")) {
			System.out.println("Alert Cancelled");
			alrt.dismiss();*/
			} 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public static boolean Mousepress ()
	{
		try{
			MouseEvent e = null;
			if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {
		    System.out.println("BUTTON1_MASK");
		}

		if ((e.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0) {
		    System.out.println("BUTTON1_DOWN_MASK");
		}
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	return true;
		}
	public static boolean mousePressed() {
		MouseEvent me = null;
		 if ((me.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
		      System.out.println("Left button pressed.");
		    }return true;
		}
}
