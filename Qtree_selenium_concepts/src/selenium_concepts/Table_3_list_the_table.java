package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_3_list_the_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Qtree_Selenium\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> Companyname=driver.findElements(By.xpath("//thead//following::tr//a[text()]"));
		//List<WebElement> tablecount=driver.findElements(By.xpath("(//tr)"));
		//List<WebElement> Companyname1=driver.findElements(By.xpath("//tr//font[@class='green']"));

	for (WebElement webElement :Companyname) {
		
String Storedvalues		=webElement.getText();

		for (int i=0;i<Companyname.size();i++) {
		String B= Companyname.get(i).getText();
System.out.println( B);

}


	}
	}
	}


