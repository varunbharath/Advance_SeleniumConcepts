package selenium_concepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementswithifconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().window().minimize();
 driver.manage().window().fullscreen();
 driver.navigate().refresh();
 driver.get("https://www.mycontactform.com/samples.php");
 //xpath for Checboxes
 
List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
    
for(WebElement buttonclick:checkbox)
	//webElement(Variable type) buttonclick (variable) :checkbox (xpath stored variable)
{
	//check the conditions
	if(buttonclick.isSelected()) {
		System.out.println("Default Clicked");
	}
	else {
		buttonclick.click();
		System.out.println("Clicked by Automation");
	}
}
	}

}
