package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/checkbox.xhtml");
	driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']/div)[2]")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	Thread.sleep(3000);
	String message=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println(message);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("//label[text()='Python']")).click();
	driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).click();//tristate
	//- Verify which tri-state option has been chosen.--doubt
	
	if (driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).isSelected()==true)
	{
		System.out.println("Notselected");	
	}
	else
	{
		System.out.println("Selected");	

	}
	
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();//toggleswitch
	
	//- Verify that the expected message is displayed.-doubt
	Thread.sleep(3000);
	String message1=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println("toggle "+message1);
	
	if (driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled()==true)
	{
		System.out.println("Enabled");	

	}
	else
	{
		System.out.println("Disabled");
	}

	driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
	
	
			driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
			driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
			driver.close();
	

	}

}
