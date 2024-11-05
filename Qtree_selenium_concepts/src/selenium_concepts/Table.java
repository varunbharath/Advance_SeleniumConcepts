package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/write-xpath-table.html");

WebElement secondcell=driver.findElement(By.xpath("//td[contains(text(),'second cell')]"));
String value=secondcell.getText();
if(value.equals("second cell")) {
	System.out.println("Values are fetched same data");
}
else {
	System.out.println("values fetched different data");
}
	}

}
