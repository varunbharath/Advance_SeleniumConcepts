package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkthedropdowncondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdwon=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select value= new Select(dropdwon);
		
		List<WebElement> options=value.getOptions();
		boolean check=false;
		for (WebElement conditions : options) {
		String text	=conditions.getText();
			if (text.equals("ANTIGUA AND BARBUDA")) {
				check=true;
				System.out.println(text+" value is present");
				
				
			} 
			
			else {
				check=false;
				//System.out.println( text+"value is not present");
				
			}
		}
			if (check==false) {
				System.out.println( "REmainingvalues is not selected ");
				
			}
		}

	

}
