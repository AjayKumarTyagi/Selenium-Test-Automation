package selenium;


import static org.testng.AssertJUnit.assertTrue;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceSearch {
	
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
		  
		  //enter item name on search bar
		  WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		  search.sendKeys("iphone 12");
		  
		  //click on search button
		  WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		  searchbutton.click();
		  
		  //validate item's name
		  WebElement iphone = driver.findElement(By.linkText("New Apple iPhone 12 (128GB) - Blue"));
		  boolean iphoneDisplay=iphone.isDisplayed();
		  boolean iphoneEnabled=iphone.isEnabled();
		  System.out.println("\nItem Link name: ");
		  System.out.println("Display: "+iphoneDisplay);
		  System.out.println("Enable: "+iphoneEnabled);
		  
		 //validate item's image
/*		  WebElement iphoneimage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		  boolean imageDisplay=iphoneimage.isDisplayed();
		  boolean imageEnabled=iphoneimage.isEnabled();
		  System.out.println("\nItem image: ");
		  System.out.println("Display: "+imageDisplay);
		  System.out.println("Enable: "+imageEnabled);
		  
		  //validate item's price8
		  WebElement iphoneprice = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/a/span[1]"));
		  boolean priceDisplay=iphoneprice.isDisplayed();
		  boolean priceEnabled=iphoneprice.isEnabled();
		  System.out.println("\nItem price: ");
		  System.out.println("Display: "+priceDisplay);
		  System.out.println("Enable: "+priceEnabled); */
		  
		  iphone.click();
		  
		  ArrayList<String> nTabs = new ArrayList<String>(driver.getWindowHandles());
		  System.out.println("no of Tabs " + nTabs);
		  driver.switchTo().window(nTabs.get(1));
		  
		  //Validating MRP
		  WebElement mrpElement = driver.findElement(By.xpath("//*[@id=\"price\"]/table/tbody/tr[1]/td[1]"));
		  String txt = mrpElement.getText();
		  System.out.println("Text is " + txt);
		  assertTrue(txt.equalsIgnoreCase("M.R.P.:"));
		  
		  //Validating Deal Price
		  String rate = driver.findElement(By.id("priceblock_ourprice_lbl")).getText();
		  System.out.println("Label is " + rate);
		  assertTrue(rate.contains("Price"));
		  
		  //For Picture
		  WebElement img = driver.findElement(By.id("landingImage"));
		  System.out.println("Image "+ img);
		  assertTrue(img.isDisplayed());
		  
		  //For Add to cart button
		  WebElement cartbtn = driver.findElement(By.id("add-to-cart-button"));
		  System.out.println("Add to cart button is "+ cartbtn);
		  assertTrue(cartbtn.isEnabled());
		  
		  //Buy Now button
		  WebElement buybtn = driver.findElement(By.id("buy-now-button"));
		  System.out.println("Buy now button is "+ buybtn);
		  assertTrue(buybtn.isEnabled());
		  
		  
	}
	

}
