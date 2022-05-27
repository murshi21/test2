package googleTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleNgClass {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\murshid\\Downloads\\chromedriver.exe");
	  WebDriver obj=new ChromeDriver();
	  obj.get("https://www.google.com/");
	  obj.findElement(By.name("q")).sendKeys("flipkart");
	  obj.findElement(By.name("btnK")).click();
  }
}
