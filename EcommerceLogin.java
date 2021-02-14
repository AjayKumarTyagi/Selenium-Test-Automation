package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceLogin {
	
	public static void main(String[] args) throws InterruptedException {  

		   
		  // declaration and instantiation of objects/variables  

		  System.setProperty("webdriver.chrome.driver", "D:\\CSE\\Test Automation Lab\\Chrome Driver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();

		  // Launch website  

		  driver.navigate().to("https://www.amazon.in/");		  
		  
		  // Find Sign in button
		  WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		  signin.click();
		  
		  // Write E-mail address in the text field
		  WebElement email = driver.findElement(By.id("ap_email"));
		  email.sendKeys("ajaytyagi0209@gmail.com");
		  
		  // Click on continue button
		  WebElement continuebutton = driver.findElement(By.id("continue"));
		  continuebutton.click();
		  
		  // Write password in the text field
		  WebElement password = driver.findElement(By.id("ap_password"));
		  password.sendKeys("*****");
		  
		  // Click on sign in button
		  WebElement login = driver.findElement(By.id("signInSubmit"));
		  login.click();
		  
		  }  
}
