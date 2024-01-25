package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selecss2 {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();  //to launch the browser
			driver.get("https://login.yahoo.com/?.intl=in");//to launch the browser.
			driver.manage().window().maximize();
			//driver.findElement(By.name("username")).sendKeys("sampath.kannala@gmail.com");
			//driver.findElement(By.cssSelector("inspect[class=phone-no]")).sendKeys("sampath.kannala@gmail.com");
			//driver.findElement(By.xpath("//*[@id=\"mbr-forgot-link\"]")).click();
			//driver.findElement(By.linkText("Forgotten username?")).click();
			driver.findElement(By.partialLinkText("Forgotten username?")).click();
			//driver.findElement(By.tagName("input")).click();
			//driver.findElement(By.name("username")).sendKeys("sampath.kannala@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("login-signin")).click();
			}

}
