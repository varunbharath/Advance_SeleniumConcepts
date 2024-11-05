package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRS_medical {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();

//		System.setProperty("webdiver.chrome.driver"," C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
//		//WebDriver driver =new ChromeDriver();
		driver.findElement(By.xpath(""));
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//loginpage
		
		WebElement  username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("admin");
		
		 WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		 password.sendKeys("Admin123");
		 
		 WebElement password_eyeicon=driver.findElement(By.xpath("//i[@id='togglePassword']"));
		 password_eyeicon.click();
		 
		 WebElement login_click=driver.findElement(By.xpath("//input[@id='loginButton']"));
		 login_click.click();
		 

	}

}
