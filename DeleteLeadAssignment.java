package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
	
			//step 2 ma
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//need to check above one-password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//class='decorativeSubmit'
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("3436234356");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String id=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(id);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//a[@class='subMenuButtonDangerous']
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12752");//4234242342
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String tablevalue=driver.findElement(By.xpath("//div[@class='tabletext']/b")).getText();
		if(tablevalue.contains("TestLeaf"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("Failure");
		}
		driver.close();	

		

	}

}
