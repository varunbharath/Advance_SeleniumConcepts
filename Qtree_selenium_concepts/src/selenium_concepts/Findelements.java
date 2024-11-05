package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		//click  all check box (Select All checkbox)
		//send to check box , single check box , multiple check box
		List<WebElement> Allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement value:Allcheckbox) {
			value.click();
		}
		 // unselect Allcheckbox
		List<WebElement> Allcheckbox1= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement value1:Allcheckbox1) {
			value1.click();
		}
		
		
    
		
		// click multiple checkbox only
		List<WebElement> Multiplecheckbox1= driver.findElements(By.xpath("//input[@name=\"checkbox6[]\"]"));
		for(WebElement options:Multiplecheckbox1) {
			if(options.isSelected()) {
				
				//options.click();
		
			
			System.out.println("default selected");
		}
		
		 else {
			 options.click();
				System.out.println("Clicked by Automation");
		}
			
		
		
	}

}
}