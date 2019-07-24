package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	  driver = new ChromeDriver();
	driver.get("https://www.softwaretestingmaterial.com/");
	System.out.println("Got Softwaretestingmaterial webpage");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chr\\chromedriver.exe");
	  System.out.println("In Before class ,setted the chrome driver property");
	 
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In After class, quited from Web page");
	  driver.quit();
  }

}
/*
ssss
sss
sss
*/
