package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Ravivarma.d1378@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Ravivarma@7036");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		//@Test
		void main{
			System.out.println();
		}
		}

}
