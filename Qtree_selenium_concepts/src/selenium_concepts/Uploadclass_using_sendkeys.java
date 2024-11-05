package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadclass_using_sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		WebElement upload=driver.findElement(By.xpath("//input[@name='attach4589']"));
		
		//upload.sendKeys("C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		//or
String storedvalue="C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe";
upload.sendKeys(storedvalue);
	}

}
