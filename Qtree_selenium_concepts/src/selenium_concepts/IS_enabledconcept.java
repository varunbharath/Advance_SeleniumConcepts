package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_enabledconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		WebElement Submitbutton=driver.findElement(By.xpath("//input[@name='submit']"));
		boolean check=Submitbutton.isEnabled();
		if(check==true) {
			System.out.println("Submit Button is enabled");
		}
		else {
			System.out.println("Submit Button is notenabled");
		}
	}

}
