@package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://marolixhr.com/hrm-dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravivarmadommeti.marolix@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ravivarma@7036");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("/html/body/header/div/div[1]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/header/div/div[1]/ul/li[2]/div/a[2]")).click();
		
	}

}
