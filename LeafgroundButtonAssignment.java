package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	
	driver.get("https://leafground.com/button.xhtml");
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.navigate().back();
	if (driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled()==true)
	{
			System.out.println("enabled");		
	}
	else
	{
			System.out.println("disabled");
	}
	Point Pointval=driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
	System.out.println("Pointval "+Pointval);
	
	String colour1=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
	System.out.println("Colour "+colour1);
	
	int height1=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight();
	System.out.println("Height "+height1);
	
	int widhth1=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth();
	System.out.println("Width "+ widhth1);
	
	driver.close();

	}

}
