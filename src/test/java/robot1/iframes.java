package robot1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("selectnav2")).click();
		
	//	driver.switchTo().frame("frm2");
		//driver.findElement(By.id("firstName")).sendKeys("Ravivarma");
	}

}
