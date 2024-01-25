package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {

	public static void main(String[] args) {

		WebDriver Driver =new ChromeDriver();
		Driver.get("http://empirehome.myprojectsonline.co.in");
		Driver.manage().window().maximize();
	}

}
