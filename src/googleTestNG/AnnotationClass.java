package googleTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass extends SuiteClass {
	@BeforeTest
	public void a() {
		System.out.println("inside before before test****************");

	}
	@BeforeMethod
	public void adf() {
	System.out.println("inside before method****************");

	}

	@BeforeGroups(value = "abc")

	public void ajhuj() {

	}
	@Test(groups = "abc")
	public void d() {
		System.out.println("inside d****************");

	}

	@Test(groups = {"abc","bcd"})
	public void e() {
		System.out.println("inside e****************");

	}

	@Test(groups = "abc")
	public void f() {
		System.out.println("inside f****************");

	}
	@AfterGroups(value = "bcd")
	public void abgf() {
	System.out.println("inside after group****************");


	}
	@AfterMethod
	public void aff() {
		System.out.println("inside after method****************");

	}

	@AfterTest
	public void aw() {
		System.out.println("inside after test3****************");

	}
}
