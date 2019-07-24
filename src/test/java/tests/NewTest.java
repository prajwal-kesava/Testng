package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	  
	driver.get("https://www.softwaretestingmaterial.com/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	System.out.println("Got Softwaretestingmaterial webpage");
  }
  
  @BeforeTest
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chr\\chromedriver.exe");
	  System.out.println("In Before class ,setted the chrome driver property");
	 
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterClass() {
	  System.out.println("In After class, quited from Web page");
	  driver.quit();
  }

}

