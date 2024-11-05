package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/alerts");
WebElement basicclick=driver.findElement(By.xpath("//button[@id='alertButton']"));
Thread.sleep(5000);
basicclick.click();
Thread.sleep(5000);
driver.switchTo().alert().accept();
		
	}

}
