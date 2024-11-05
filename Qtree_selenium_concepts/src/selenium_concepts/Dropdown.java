 package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		WebElement drop=driver.findElement(By.xpath("//select[@id='q3']"));
		Select value=new Select(drop);
		value.selectByIndex(3);
		//select by index
		WebElement drop2=driver.findElement(By.xpath("//select[@id='q8']"));
		Select value2=new Select(drop2);
		value2.selectByIndex(3);
		//select by visibletext
		WebElement drop3=driver.findElement(By.xpath("//select[@id='q10']"));
		Select value3=new Select(drop3);
		value3.selectByVisibleText("Newfoundland and Labrador");
		//select by value
				WebElement drop4=driver.findElement(By.xpath("//select[@name='q11_title']"));
				Select value4=new Select(drop4);
				value4.selectByVisibleText("Dr.");
				
				//select by index
				WebElement Selectmonth=driver.findElement(By.xpath("//select[@name='q12_month']"));
				Select value5=new Select(Selectmonth);
				value5.selectByIndex(10);
				
				//select by index
				WebElement day=driver.findElement(By.xpath("//select[@name='q12_day']"));
				Select value6=new Select(day);
				value6.selectByIndex(12);
				//select by index
				WebElement year=driver.findElement(By.xpath("//select[@name='q12_year']"));
				Select value7=new Select(year);
				value7.selectByIndex(6);
			List<WebElement>bb	=value7.getOptions();
			int vv	=bb.size();
			System.out.println(vv);
		

	}

}
