package googleTestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleClass {
	
  @Test
  public void test1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\murshid\\Downloads\\chromedriver.exe");
	  WebDriver  driver1=new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.get("https://www.google.co.in");
	  driver1.findElement(By.name("q")).sendKeys("flowers");
	  driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver1.findElement(By.name("btnK")).click();
	  
  }
  @Test
  public void test2() {
	  
	  WebDriver driver2=new ChromeDriver();
	  driver2.manage().window().maximize();
	  driver2.get("https://www.google.co.in");
	  driver2.findElement(By.name("q")).sendKeys("rain");
	  driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver2.findElement(By.name("btnK")).click();
	  
	  
	  
	    
  }
  @Test
  public void test3() {
	  
	  WebDriver driver3=new ChromeDriver();
	  driver3.manage().window().maximize();
	  driver3.get("http://demo.guru99.com/v3/");
	  driver3.findElement(By.name("uid")).sendKeys("mngr343174");
	  driver3.findElement(By.name("password")).sendKeys("EsevYqy");
	  driver3.findElement(By.name("btnLogin")).click();
	  
	  
	  
	  
  }
  @Test
  public void test4() {
  
	  WebDriver driver4=new ChromeDriver();
	  driver4.manage().window().maximize();
	  driver4.get("http://demo.medlablive.in");
	  driver4.findElement(By.name("user_name")).sendKeys("demo");
	  driver4.findElement(By.name("password")).sendKeys("demo1212");
	  driver4.findElement(By.name("Login")).click();
	  
  }
}
