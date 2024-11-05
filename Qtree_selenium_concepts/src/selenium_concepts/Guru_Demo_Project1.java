package selenium_concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru_Demo_Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		//upload file
		WebElement uploadfile1=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadfile1.sendKeys("C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		//click the check box
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='terms']"));
		
	boolean check=	checkbox.isSelected();
	
	if (check==true) {
		System.out.println("alreay check box is selected");
	}
	else {
		checkbox.click();
		System.out.println("clicked by automation");
	}
	
	WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submitbutton.click();
	
   WebElement successmsg	=driver.findElement(By.xpath("//*[contains(text(),'1 file ')]"));
 // System.out.println(successmsg.getText());
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(successmsg));
	
	
	if(successmsg.getText().contains("has been successfully uploaded.")) {
	//if (successmsg.equals(wait)) {
		String visible=successmsg.getText();
		System.out.println(visible);
	}
	else {
		System.out.println("not visible");
	}
		
	}

}
