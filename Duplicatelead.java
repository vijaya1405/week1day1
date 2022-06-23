package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 WebElement usernameElement=driver.findElement(By.id("username"));
		 usernameElement.sendKeys("Demosalesmanager");
		 
		
		 WebElement passwordElement=driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		 
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		 
		 WebElement crmsfaElement=driver.findElement(By.linkText("CRM/SFA"));
		 crmsfaElement.click();
		 
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
			elementLeads.click();
		 
		 WebElement elementCreateLead=driver.findElement(By.linkText("Create Lead"));
		 elementCreateLead.click();
		 
		 WebElement companynameElement=driver.findElement(By.id("createLeadForm_companyName"));
		 companynameElement.sendKeys("Barclays");
		 
		WebElement firstnameElement=driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Vijaya");
		
		WebElement lastnameElement=driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("Lakshmi");

		WebElement firstnameLocalElement=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnameLocalElement.sendKeys("Vijji");

		WebElement descriptionElement=driver.findElement(By.id("createLeadForm_description"));
		descriptionElement.sendKeys("Creating a New Lead");
		
		WebElement departmentElement=driver.findElement(By.id("createLeadForm_departmentName"));
		departmentElement.sendKeys("Testing Department");
		
		WebElement emailElement=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("tvijaya.lakshmi14@gmail.com");
		
		WebElement elementStateDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(elementStateDropDown);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
	
		
		System.out.println("The title is:"+driver.getTitle());
		
		if(driver.getTitle().contains("Testleaf"))
		{
			System.out.println("I Confirm the title has Testleaf");
			
		}
		else
			System.out.println("The title doesn't have the word Testleaf");
	
		driver.findElement(By.className("subMenuButton")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		 WebElement companyname1Element=driver.findElement(By.id("createLeadForm_companyName"));
		 companyname1Element.sendKeys("TCS");
		
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 
		 WebElement firstname1Element=driver.findElement(By.id("createLeadForm_firstName"));
			firstname1Element.sendKeys("Vijji");
		
			driver.findElement(By.className("smallSubmit")).click();
			
		
			System.out.println("The title is:"+driver.getTitle());
			
			if(driver.getTitle().contains("Testleaf"))
			{
				System.out.println("I Confirm the title has Testleaf");
				
			}
			else
				System.out.println("The title doesn't have the word Testleaf");
		
		
		
		
	}
	
	
	
	
	
	
}


		 		
		




