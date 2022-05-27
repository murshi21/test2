package googleTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MeblabLoginClass {
	WebDriver obj1;
	 @Test
	  public void test1()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\murshid\\Downloads\\chromedriver.exe");
		obj1=new ChromeDriver();
		obj1.get("http://demo.medlablive.in");
		obj1.findElement(By.name("userid")).sendKeys("demo");
		obj1.findElement(By.name("password")).sendKeys("demo1212");
		obj1.findElement(By.name("Login")).click();	
	}
	 @Test
	  public void test2()  {
	obj1.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 obj1.findElement(By.linkText("Bill Entry")).click();
		 obj1.findElement(By.name("BillNo")).sendKeys("New");
		 obj1.findElement(By.name("Patient")).sendKeys("murshid");
		 obj1.findElement(By.name("Address")).sendKeys("vengara");
		 obj1.findElement(By.name("Remarks")).sendKeys("good");
		 obj1.findElement(By.name("Age")).sendKeys("25");
		 obj1.findElement(By.name("Phone")).sendKeys("7558847002");
		 obj1.findElement(By.name("Email")).sendKeys("murshidmandodan494@gmail.com");
		 obj1.findElement(By.name("RefNo")).sendKeys("111");
		 	
		WebElement dateBox = obj1.findElement(By.name("BillDate"));
	        dateBox.sendKeys("09252013");
	        dateBox.sendKeys(Keys.TAB);
	        dateBox.sendKeys("0245PM");
	}
}
