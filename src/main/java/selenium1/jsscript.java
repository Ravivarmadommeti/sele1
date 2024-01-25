package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsscript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")).click();
		
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("document.querySelector(\"[name='test']\").disabled=false");
		//driver.findElement(By.name("test")).sendKeys("Ravyvarma");
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("document.querySelector(\"[name='test']\").disabled=false");
		driver.findElement(By.name("test")).sendKeys("Dommeti");
	}

}
