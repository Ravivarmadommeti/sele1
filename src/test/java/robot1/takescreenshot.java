package robot1;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=images+car&rlz=1C1CHWL_enIN1077IN1078&oq=images+car&gs_lcrp=EgZjaHJvbWUqBwgBEAAYgAQyBwgAEAAYgAQyBwgBEAAYgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQk1MTkzajFqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8#vhid=lOG1QB3arBWRbM&vssid=l");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement we =driver.findElement(By.xpath("//*[@id=\"dimg_1\"]"));
		
		TakesScreenshot ts =(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dcs=new File("C:\\Users\\Admin\\eclipse-workspace\\sele1\\src\\test\\java\\screenshot\\img7.png");
				FileUtils.copyFile(src, dcs);
				
		
		
	}

}
