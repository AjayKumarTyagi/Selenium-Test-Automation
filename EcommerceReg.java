package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceReg {
	
	public static void main(String[] args) throws InterruptedException {  

		   
		  // declaration and instantiation of objects/variables  

		  System.setProperty("webdriver.chrome.driver", "D:\\CSE\\Test Automation Lab\\Chrome Driver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();

		  // Launch website  

		  driver.navigate().to("https://www.amazon.in/");
		  
		  WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		  signin.click();
		  
		  WebElement createAcc = driver.findElement(By.id("createAccountSubmit"));
		  createAcc.click();
		  
		  WebElement CustName= driver.findElement(By.id("ap_customer_name"));
		  CustName.sendKeys("Ajay Kumar Tyagi");
		  
		  WebElement phone = driver.findElement(By.id("ap_phone_number"));
		  phone.sendKeys("7906349904");
		  
		  WebElement password = driver.findElement(By.id("ap_password"));
		  password.sendKeys("*****");
		  
		  WebElement continuebutton = driver.findElement(By.id("continue"));
		  continuebutton.click();
		  
		  }  

}

