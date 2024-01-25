package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {

	public static void main(String[] args) {

		WebDriver Driver =new ChromeDriver();
		Driver.get("http://empirehome.myprojectsonline.co.in");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sureshbabuemp@gmail.com");
		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ZPMHQHIA");
		Driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	}

}
