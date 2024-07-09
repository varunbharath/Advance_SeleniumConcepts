package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyset_URL {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

}
}