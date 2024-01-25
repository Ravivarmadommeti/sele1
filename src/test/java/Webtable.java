import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//int Rows=driver.findElements(By.xpath("//*[@id='customers']//tbody/tr")).size();
		//System.out.println(Rows);
		
		//int coloumns=driver.findElements(By.xpath("//*[@id='customers']//tbody/tr/th")).size();
		//System.out.println(coloumns);
		
		List <WebElement> tr= driver.findElements(By.xpath("//*[@id='customers']//tbody/tr/td"));
		System.out.println(tr.size());
		//for(int i=0;i<tr.size();i++) {
		//System.out.println(tr.get(i).getText());
		
		//for(int i=0;i<tr.size();i++) {
    	//String st=driver.findElement(By.xpath("//*[@id='customers']//tbody/tr[3]/td")).getText();
		//if(st.equals("Centro comercial Moctezuma")) {
		//	String s1=driver.findElement(By.xpath("//*[@id='customers']//tbody/tr[3]/td[2]")).getText();
		//	String s2=driver.findElement(By.xpath("//*[@id='customers']//tbody/tr[3]/td[3]")).getText();
		//	System.out.println(st+"---"+s1+"---"+s2);
			//break;
		//}
				
		//}
		for(int i=0;i<tr.size();i++) {
		String st=driver.findElement(By.xpath("//*[@id='customers']//tbody//th[3]")).getText();
		if(st.equals("Country")) {
			String s1=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[3]")).getText();
			String s2=driver.findElement(By.xpath("//*[@id='customers']//tbody//tr[4]//td[3]")).getText();
			System.out.print(st+"---"+s1+"---"+s2);
			break;
		}
				
		
		}
		

}

	}
	
