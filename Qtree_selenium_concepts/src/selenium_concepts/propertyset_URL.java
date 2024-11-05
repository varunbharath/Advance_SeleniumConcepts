package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class propertyset_URL {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.mycontactform.com/samples.php");

		WebElement Marketing_Department=driver.findElement(By.xpath("//input[@value='0']"));
		Marketing_Department.click();
		WebElement sales=driver.findElement(By.xpath("(//input[@value='1'])[1]"));
		sales.click();
		WebElement Customer_Service= driver.findElement(By.xpath("//input[@value='2']"));
		Customer_Service.click();
		WebElement Subject= driver.findElement(By.xpath("//input[@name='subject']"));
		Subject.sendKeys("Value");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("123@gmailcom");
		WebElement toolbox=driver.findElement(By.xpath("//input[@id='q1']"));
		toolbox.sendKeys("Random");
		WebElement Text_BoxMultiLine=driver.findElement(By.xpath("//textarea[@name='q2']"));
		Text_BoxMultiLine.sendKeys("Random");
		


		WebElement firstoption=driver.findElement(By.xpath("//input[@value='First Option']"));
		firstoption.click();
		WebElement single_Answer=driver.findElement(By.xpath("//input[@id='q5']"));
		single_Answer.click();
		WebElement MultiAnswerfirstcheckbox=driver.findElement(By.xpath("//input[@value='First Check Box']"));
		MultiAnswerfirstcheckbox.click();
		WebElement Multi2checkbox=driver.findElement(By.xpath("//input[@value='Second Check Box']"));
		Multi2checkbox.click();
		WebElement MultiAnswer3checkbox=driver.findElement(By.xpath("//input[@value='Third Check Box']"));
		MultiAnswer3checkbox.click();
		WebElement MultiAnswer4checkbox=driver.findElement(By.xpath("//input[@value='Fourth Check Box']"));
		MultiAnswer4checkbox.click();
		WebElement MultiAnswer5checkbox=driver.findElement(By.xpath("//input[@value='Fifth Check Box']"));
		MultiAnswer5checkbox.click();
//		WebElement date=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
//		date.sendKeys("10-11-2024");

		WebElement firstname=driver.findElement(By.xpath("//input[@name='q11_first']"));
		firstname.sendKeys("Arvind");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='q11_last']"));
		lastname.sendKeys("Raj");

		

		
		WebElement enterverification=driver.findElement(By.xpath("//input[@id='visver_code']"));
		enterverification.sendKeys("Randomvalue");
		
		WebElement username=driver.findElement(By.xpath("(//input[@id='user'])[1]"));
		username.sendKeys("Randomvalue");
		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("Randomvalue");
		//WebElement login=driver.findElement(By.xpath("//input[@name='btnSubmit']"));
		//login.click();
		
		
		WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Submit.click();
		
			}

		

		

}
