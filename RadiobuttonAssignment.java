package week2.day2;

//import java.awt.List;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class RadiobuttonAssignment {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/radio.xhtml");
	
	driver.findElement(By.xpath("(//table[@id='j_idt87:console1']/tbody/tr/td/div/div)[2]")).click();
	
	boolean state=driver.findElement(By.xpath("(//table[@id='j_idt87:console1']/tbody/tr/td/div/div)[2]")).isSelected();
	if (state==true)
	{
		System.out.println("Radio button not clicked");
	}
	else
	{
		System.out.println("Radio button clicked");
	}
	
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	
	//List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td"));
	//for(int i=0;i<checkboxes.size();i++)
	//{
		//if(checkboxes.get(i).isSelected()==true)
		//{
		//	System.out.println(checkboxes.get(i).getAttribute(null));
		//}
	//}
	
	if (driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled()==true)
	{
			System.out.println("enabled");		
	}
	else
	{
			System.out.println("disabled");
	}
	
	
	if (driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected()==false)
	{
		System.out.println("selected");		
	}
	else
	{
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
	}
	driver.close();	


	}

}
