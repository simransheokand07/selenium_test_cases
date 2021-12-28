package registerUser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Testclassregisteruser {
     


@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//launch browser and navigate URL
	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "https://automationexercise.com";
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.get(baseUrl);
	 String s = driver.getCurrentUrl(); 
	 System.out.println("url :"+s);
     
	 //verify page loaded 
	 JavascriptExecutor j = (JavascriptExecutor)driver;
     if (j.executeScript("return document.readyState").toString().equals("complete")){
        System.out.println("Page has loaded");
     }
     
     // click the element Signup / Login
     WebElement signup = driver.findElement(By.linkText("Signup / Login"));
     signup.click();
     
     //verify element new user signup is visible
     WebElement user = driver.findElement(By.xpath("//h2[contains(text(), 'New User Signup!')]"));
     if(user.isDisplayed())
     {
     System.out.println("Element found using text");
     }
      
     else
     System.out.println("Element not found");
     
     //enter name
     WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
     name.sendKeys("simransheokand");
     
     //enter email
     WebElement email = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
     email.sendKeys("simransheokandssss@gmail.com");
     
     //click signup button
     WebElement button = driver.findElement(By.cssSelector("button.btn:nth-child(5)"));
     button.click();
     
     //verify enter account information
     WebElement account = driver.findElement(By.cssSelector("h2.title:nth-child(1) > b:nth-child(1)"));
     if(account.isDisplayed())
     {
     System.out.println("Element found using text");
     }
      
     else
     System.out.println("Element not found");
     
     //choose gender 
     WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender2']"));
     gender.click();
     
     //enter password
     WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
     password.sendKeys("simransheokand");
     
     //select date
     WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
     day.click();
     WebElement select = driver.findElement(By.xpath("//option[@value='13']"));
     select.click();
     
     //select month
     WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
     month.click();
     WebElement selectmonth = driver.findElement(By.cssSelector("#months > option:nth-child(8)"));
     selectmonth.click();
     
     //select year
     WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
     year.click();
     WebElement selectyear = driver.findElement(By.xpath("//option[@value='2000']"));
     selectyear.click();
     
     
     //click newsletter checkbox
     WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
     newsletter.click();
     
     //click optin checkbox
     WebElement optin = driver.findElement(By.xpath("//input[@id='optin']"));
     optin.click();
     
     //enter first name
     WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
     firstname.sendKeys("simran");
     
     //enter last name
     WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
     lastname.sendKeys("sheokand");
     
     //enter company name
     WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
     company.sendKeys("abc");
     
     //enter address
     WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
     address1.sendKeys("sheokand");
     
     //enter alternate address
     WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
     address2.sendKeys("sheokand");
     
     //enter country 
     WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
     country.click();
     WebElement selectcountry = driver.findElement(By.cssSelector("#country > option:nth-child(1)"));
     selectcountry.click();
     
     //enter state
     WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
     state.sendKeys("Haryana");
     
     //enter city
     WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
     city.sendKeys("Kurukshetra");
     
     //enter zipcode
     WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
     zipcode.sendKeys("136118");
     
     //enter mobile number
     WebElement mobile_number = driver.findElement(By.xpath("//input[@id='mobile_number']"));
     mobile_number.sendKeys("7896541239");
     
     //click create account
     WebElement accountclick = driver.findElement(By.cssSelector("button.btn:nth-child(22)"));
     accountclick.click();
     
     //verify account created
     WebElement accountcreated = driver.findElement(By.cssSelector(".title > b:nth-child(1)"));
     if(accountcreated.isDisplayed())
     {
     System.out.println("Element found using text");
     }
      
     else
     System.out.println("Element not found");
 
     //click continue
     WebElement clickcontinue = driver.findElement(By.cssSelector("a.btn"));
     clickcontinue.click();

     //verify log in as simransheokand
     WebElement loginas = driver.findElement(By.cssSelector(".navbar-nav > li:nth-child(9) > a:nth-child(1)"));
     if(loginas.isDisplayed())
     {
     System.out.println("Element found using text");
     }
      
     else
     System.out.println("Element not found");    

     //click delete account
     WebElement delete = driver.findElement(By.linkText("Delete Account"));
     delete.click();

     //verify deleted account
     WebElement deleted = driver.findElement(By.cssSelector(".page-header > h1:nth-child(1)"));
     if(deleted.isDisplayed())
     {
     System.out.println("Element found using text");
     }
      
     else
     System.out.println("Element not found"); 
     
     //delete account
     WebElement deleteaac = driver.findElement(By.cssSelector("button.btn-danger:nth-child(1)"));
     deleteaac.click();
}
}


