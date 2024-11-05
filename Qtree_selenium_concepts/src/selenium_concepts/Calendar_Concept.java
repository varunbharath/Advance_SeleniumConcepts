package selenium_concepts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		
		WebElement Dateselector= driver.findElement(By.xpath("//input[@id='q7']"));
		Dateselector.click();
		 WebElement Dyear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select year1= new Select(Dyear);
		 year1.selectByVisibleText("2021");
	
		 WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 Select monthselect=new Select (month);
		 monthselect.selectByValue("11");
		 //List<WebElement> monthoptions=monthselect.getOptions();

	List<WebElement> monthhh=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
	
	for (WebElement webElement2 : monthhh) {
	String S2=webElement2.getText();
	System.out.println(S2);
	
//	WebElement check	=monthselect.getFirstSelectedOption();
//	String Expectedmonth="Dec";
//	String s2	=check.getText();
//	System.out.println(check.getText());
//	
//	//List<WebElement> opt=select3.getOptions();
//	if(s2.equals(Expectedmonth)) {
//	
//		System.out.println("samevalue"+s2);
//	}
//	else {
//		System.out.println("not printed");
//	}
//	
//	
//		
//	}

		
	
		List<WebElement> ALLdate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for (WebElement webElement : ALLdate) {
			String SToreddate=webElement.getText();
			System.out.println(SToreddate);
			if (SToreddate.equals("25")) {
				webElement.click();
				System.out.println("Date is clicked");
				
			}
			else {
				System.out.println("Date is not clicked");
				
			}
			
		}
		Date today= new Date();
		SimpleDateFormat range= new SimpleDateFormat("dd-MM-YY");
	String Storeddate	=range.format(today);
	System.out.println(Storeddate);

	}
	}
}
