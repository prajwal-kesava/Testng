package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;


public class NewTest {
	
	public WebDriver driver;
	

	
  @Test
  public void openMyBlog() {
	  
	driver.get("https://www.softwaretestingmaterial.com/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	System.out.println("Got Softwaretestingmaterial webpage");
  }
  
  @BeforeMethod
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chr\\chromedriver.exe");
	  System.out.println("In Before class ,setted the chrome driver property");
	 
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterClass() {
	  System.out.println("In After method test, quited from Web page");
	  driver.quit();

  }

}

