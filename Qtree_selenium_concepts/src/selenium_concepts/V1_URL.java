package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V1_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=chatgpt&rlz=1C1CHBF_enIN1007IN1007&oq");
		driver.get("https://www.google.com/search?q=Amazon.in");
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().to("https://www.google.com/search?q=Amazon.in");
		driver.navigate().refresh();
		driver.navigate().forward();
		//driver.close();
		driver.navigate().to("https://www.google.com/search?q=Accenture");
		
	driver.close();}
}