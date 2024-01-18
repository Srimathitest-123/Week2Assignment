package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
	
			//step 2 ma
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
//
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");  //companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("TestFirstname");  //Firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TestLastname");////Lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Local");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Department");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Description");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@Email.com");

		WebElement dropdown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt=new Select(dropdown);
		opt.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("important");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

		
		
		
		
		
		

	}

}
