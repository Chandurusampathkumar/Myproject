package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;

import org.testng.annotations.Test;

public class TestClass {
	static QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();

	@Test(priority = 01)
	public void QbendMain() throws Exception
	{
		try
		{
			System.out.println("WElcome");
			//Comm.LoginQbend();	
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
