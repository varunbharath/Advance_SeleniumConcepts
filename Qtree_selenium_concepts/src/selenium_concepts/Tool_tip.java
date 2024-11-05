package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_tip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement tooltipxpath=driver.findElement(By.xpath("(//div[@role='button'])[2]"));
		WebElement qrscanner=driver.findElement(By.xpath("(//div[@role='button'])[3]"));
		
		String Storedvale=tooltipxpath.getAttribute("aria-label");
		System.out.println(Storedvale);
	String lenseimagestored	=qrscanner.getAttribute("aria-label");
		System.out.println(lenseimagestored);
		String Expectedvalue="Search by voice";
	String Expectedvaluesforimages="Search by image";
		if (Storedvale.equals(Expectedvalue)) {
			System.out.println("value are equal");
			
		}
		else {
			System.out.println("value are not  equal");
		}
		if (lenseimagestored.equals(Expectedvaluesforimages)) {
			System.out.println("image concept value same");
			
		}
		else {
			System.out.println("image concept valu enot  same");
		}
	}

}
