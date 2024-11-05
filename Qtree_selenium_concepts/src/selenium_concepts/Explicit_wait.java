package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(null));
		driver.get("https://demoqa.com/alerts");
		WebElement waitclick=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		Thread.sleep(5000);
		waitclick.click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
	//	wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		driver.switchTo().alert().accept();
		

	}

}
