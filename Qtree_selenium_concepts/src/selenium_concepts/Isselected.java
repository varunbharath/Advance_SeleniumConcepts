package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='First Check Box']"));
		boolean flog=checkbox.isSelected();
		if(flog==true) {
			System.out.println("checkbox_ is already selected");
		}
		else {
			checkbox.click();
			System.out.println("Clicked by Automation");
			
		}

	}

}
