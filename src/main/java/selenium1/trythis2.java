package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trythis2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); //3rd and 4th solution
		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.id("other")).click();
		WebElement ws=driver.findElement(By.id("owc"));
		Select sc=new Select(ws);
		//sc.selectByValue("option 3");
		//sc.selectByVisibleText("Option 1");
		sc.selectByIndex(2);
		
	}

}
