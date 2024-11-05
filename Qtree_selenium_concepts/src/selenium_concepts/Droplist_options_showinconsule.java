package selenium_concepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droplist_options_showinconsule {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement v1=driver.findElement(By.xpath("//select[@name='country']"));
		Select Number=new Select(v1);
		
		
List<WebElement>	RANGE	=Number.getOptions();
 boolean checkthecondition= false;
 
 
for (WebElement STORE : RANGE) {
String STOREDVALUE	=STORE.getText();
System.out.println(STOREDVALUE);
if (STOREDVALUE.equals("BASSA DE INDIA ")) {
	System.out.println(STOREDVALUE+"Word is present");
	checkthecondition=true;
	
	
}

else {
	checkthecondition=false;
	System.out.println("Word is not present");
}
	
}

		
		
		

	}

}
