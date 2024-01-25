package robot1;

		import java.awt.Robot;
		import java.awt.datatransfer.StringSelection;
		import java.awt.event.KeyEvent;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class robo1 {

			public static void main(String[] args) throws Throwable {

				WebDriver driver  = new ChromeDriver();
				driver.get("https://www.ilovepdf.com/merge_pdf");
				
				driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
				Robot r=new Robot();
				r.delay(3000);
				
				StringSelection s = new StringSelection("\\MANUAL TESTING1.pdf");
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
			}

		}