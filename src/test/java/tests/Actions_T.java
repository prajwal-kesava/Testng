package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;

public class Actions_T {
	private static String name="prajwal-kesava";
	private static String pass="Amrutha@2418";
	  WebDriver driver;
	
  @Test
  public void f() {
	  
    driver = new ChromeDriver();
             
             driver.get("https://github.com/");
             
             driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
             WebElement login=driver.findElement(By.xpath("(//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a[@class='HeaderMenu-link no-underline mr-3'])"));
             login.click();
             WebElement username=driver.findElement(By.xpath("(//div[@class='auth-form-body mt-3']//input[@type='text'])"));
             username.sendKeys(name);
             System.out.println("Entered Login name");
            
             WebElement password= driver.findElement(By.xpath("(//div[@class='auth-form-body mt-3']//input[@type='password'])"));
             password.sendKeys(pass);
             password .sendKeys(Keys.RETURN);
             System.out.println("Entered password");
          
           
             System.out.println("Selenium Webdriver Script in chrome browser using chrome Driver | GitHub");
	  
  }
  @BeforeTest
  public void initial()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chr\\chromedriver.exe");
  }
  @AfterTest
  public void quit()
  {
	  Actions action=new Actions(driver);
	  
	  System.out.println("In After class, quited from Web page");
	  driver.close();
  }
}
