package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trythis1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.id("other")).click();
		WebElement we= driver.findElement(By.id("option"));//2nd  message
		Select se=new Select(we);
		se.selectByValue("option 3");
		//se.selectByVisibleText("Option 1");
		//se.selectByIndex(3);
	}
	

}
