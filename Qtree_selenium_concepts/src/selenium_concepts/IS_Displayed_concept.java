package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_Displayed_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		WebElement Resetbutton= driver.findElement(By.xpath("//input[@name='reset']"));
		boolean Checkthecondition=Resetbutton.isDisplayed();
		if(Checkthecondition==true) {
			System.out.println("RESET Buttton is Displayed");
		}
		else {
			System.out.println("Reset Button is notDisplayed");
		}
		

	}

}
