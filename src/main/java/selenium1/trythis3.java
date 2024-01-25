package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trythis3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://trytestingthis.netlify.app/");//4th message
		List<WebElement> re=driver.findElements(By.xpath("//*[@id='moption']"));
		System.out.println(re.size());
		for(int i=0;i<=1;i++) {
			//if(i!=0)
			re.get(i).click();
		}
	}

}
