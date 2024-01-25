package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {

	public static void main(String[] args) throws Throwable {

		WebDriver Driver =new ChromeDriver();
		Driver.get("http://empirehome.myprojectsonline.co.in");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sureshbabuemp@gmail.com");
		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ZPMHQHIA");
		Driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//img[@alt='user']")).click();
		Driver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]")).click();
		
	}

}
