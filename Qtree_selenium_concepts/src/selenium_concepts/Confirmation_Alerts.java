package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver"," C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement Co=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Thread.sleep(7800);
		Co.click();
		Thread.sleep(7800);
		
		driver.switchTo().alert().dismiss();
		

	}

}
