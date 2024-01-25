package selenium1;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindows1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.epfindia.gov.in/site_en/index.php");//window handle
		//String id=driver.getWindowHandle();
		//System.out.println(id);
		driver.findElement(By.xpath("//*[@id=\"img_col\"]/li[1]/a")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> vds=ids.iterator();
		//Thread.sleep(2000);
		String fwid=vds.next();
		String swid=vds.next();
		//Thread.sleep(2000);
		System.out.println("first "+fwid);
		System.out.println("second "+swid);
		
				}

}
