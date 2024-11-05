package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("8220113955");
		WebElement Password= driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("Coimbatore@2020");
		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();
	}

}
