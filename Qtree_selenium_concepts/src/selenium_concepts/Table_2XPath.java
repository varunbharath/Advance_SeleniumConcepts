package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_2XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	WebElement fetchfourthcell=driver.findElement(By.xpath("//table[@border='l']/tbody/tr[2]/td[2]"));
String expected	=fetchfourthcell.getText();
	//fetchfourthcell.getText();
	if (expected.equals("fourth cell")) {
		System.out.println("Expected valus are same");
		
	}
	else {
		System.out.println("Expected values are different");
	}
	

	}

}
