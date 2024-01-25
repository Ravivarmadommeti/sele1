package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class facelogin {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email"));((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];",  "Ravivarma.d@1378");
		driver.findElement(By.name("pass")).sendKeys("Ravivarma@7036");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}

}
