package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promt_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement promtalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		Thread.sleep(7800);
		promtalert.click();
		Thread.sleep(7800);
		driver.switchTo().alert().sendKeys(" Hope ");
		driver.switchTo().alert().accept();

	}

}
