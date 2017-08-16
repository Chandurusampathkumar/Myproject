package gsr.Qbend.Common;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Test {
		 
		public static void main(String args[]) {
			XmlSuite suite = new XmlSuite();
			suite.setName("TmpSuite");
			 
			XmlTest test = new XmlTest(suite);
			test.setName("TmpTest");
			List<XmlClass> classes = new ArrayList<XmlClass>();
			classes.add(new XmlClass("gsr.Qbend.Admin.CreatePublisher"));
			classes.add(new XmlClass("gsr.Qbend.Admin.CreateNewBook"));
			test.setXmlClasses(classes) ;
			
			List<XmlSuite> suites = new ArrayList<XmlSuite>();
			suites.add(suite);
			TestNG tng = new TestNG();
			tng.setXmlSuites(suites);
			tng.run(); 
		 
		}
}
