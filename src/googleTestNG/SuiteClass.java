package googleTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteClass {
 @BeforeSuite
  public void ddfwt() {
	 
	 System.out.println("inside before suite");
  }
 
 @AfterSuite
 public void fsdjdj() {
	 
	 System.out.println("inside after suite");
 }
}
