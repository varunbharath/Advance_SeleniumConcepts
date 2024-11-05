package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.mycontactform.com/samples.php");

WebElement Subject= driver.findElement(By.xpath("//input[@id='subject']"));
WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
Actions act=new Actions(driver);
act.keyDown(Keys.SHIFT);
act.sendKeys(Subject,"value");
 
act.scrollToElement(submit);
act.click(submit);
act.build().perform();
act.keyDown(Keys.F5);
act.keyUp(Keys.F5);
	}

}
