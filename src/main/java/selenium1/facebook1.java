package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();  //to launch the browser
		
		driver.get("https://www.facebook.com/login/");  // to launch the URL
		driver.manage().window().maximize();  // to maximize the webpage
		driver.findElement(By.name("email")).sendKeys("ravivarma.d1378@gmail.com");
		//driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Ravivarma@7036");
		//Thread.sleep(2000);
		//driver.findElement(By.className("input[value=1]")).click();
		driver.findElement(By.name("pass")).sendKeys("Ravivarma@7036");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();	
	}

}
