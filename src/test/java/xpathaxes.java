import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Email']//following-sibling::input[1]")).sendKeys("Raviteja.Ravivarma,prasanna");
		driver.findElement(By.xpath("//label[text()='Email']//preceding-sibling::input[1]")).sendKeys("ravivarma.d1378@gmail.com");
		driver.findElement(By.xpath("//label[text()='Email']/parent::div/input[1]")).sendKeys("Ravivarma");
		driver.findElement(By.xpath("//div[@class='container']/child::input[2]")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buttons']/ancestor-or-self::div[1]/button[3]")).click();
		
	}
}
