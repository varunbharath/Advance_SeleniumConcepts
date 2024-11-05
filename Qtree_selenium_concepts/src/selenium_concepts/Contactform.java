package selenium_concepts;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contactform {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	//Set the browser

	System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// URL launch

	driver.navigate().to("https://www.mycontactform.com/samples.php");
	
	//Send to
	
    //  Marketing_Departmen
	WebElement Marketing_Department=driver.findElement(By.xpath("//input[@value='0']"));
	Marketing_Department.click();
	//Sales
	WebElement sales=driver.findElement(By.xpath("(//input[@value='1'])[1]"));
	sales.click();
	//Customer_Service
	WebElement Customer_Service= driver.findElement(By.xpath("//input[@value='2']"));
	Customer_Service.click();
	
	//subject
	WebElement Subject= driver.findElement(By.xpath("//input[@name='subject']"));
	Subject.sendKeys("Automation");
	// Enter the mail id
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("123@gmailcom");
	//Tool Box
	WebElement toolbox=driver.findElement(By.xpath("//input[@id='q1']"));
	toolbox.sendKeys("UI Automation");
	//Multiline
	WebElement Text_BoxMultiLine=driver.findElement(By.xpath("//textarea[@name='q2']"));
	Text_BoxMultiLine.sendKeys("UI Automatio for MY contavt form");
	//dropdown 
	
	WebElement drop=driver.findElement(By.xpath("//select[@id='q3']"));
	Select value=new Select(drop);
	value.selectByIndex(3);
	System.out.println("value of the first dropdown"+value);
	
    //radio button
	WebElement firstoption=driver.findElement(By.xpath("//input[@value='First Option']"));
	firstoption.click();
	//Single Click
	WebElement single_Answer=driver.findElement(By.xpath("//input[@id='q5']"));
	single_Answer.click();
	//Multiclick
	
	WebElement MultiAnswerfirstcheckbox=driver.findElement(By.xpath("//input[@value='First Check Box']"));
	MultiAnswerfirstcheckbox.click();
	//2nd checkbox
	WebElement Multi2checkbox=driver.findElement(By.xpath("//input[@value='Second Check Box']"));
	Multi2checkbox.click();
	//3rd
	WebElement MultiAnswer3checkbox=driver.findElement(By.xpath("//input[@value='Third Check Box']"));
	MultiAnswer3checkbox.click();
	
	//4th check box
	WebElement MultiAnswer4checkbox=driver.findElement(By.xpath("//input[@value='Fourth Check Box']"));
	MultiAnswer4checkbox.click();
	//5th check box
	WebElement MultiAnswer5checkbox=driver.findElement(By.xpath("//input[@value='Fifth Check Box']"));
	MultiAnswer5checkbox.click();
//	WebElement date=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
//	date.sendKeys("10-11-2024");
	//select by value
	
	
	//Pre-Defined Field - U.S. States:
	WebElement USStates=driver.findElement(By.xpath("//select[@id='q8']"));
	Select USA_State=new Select(USStates);
	USA_State.selectByVisibleText("TN");
	
	//Pre-Defined Field - Countries:
	WebElement Countries=driver.findElement(By.xpath("//select[@id='q9']"));
	Select country=new Select(Countries);
	country.selectByVisibleText("American Samoa");
	
	//Pre-Defined Field - Canadian Provinces:
	WebElement Canadian_Provinces=driver.findElement(By.xpath("//select[@id='q10']"));
	Select canadian=new Select(Canadian_Provinces);
	canadian.selectByVisibleText("--Canadian Territories--");
	
	//Pre-Defined Field - Name:
	WebElement drop4=driver.findElement(By.xpath("//select[@name='q11_title']"));
	Select value4=new Select(drop4);
	value4.selectByVisibleText("Dr.");
	
	
	
// firstName
	WebElement firstname=driver.findElement(By.xpath("//input[@name='q11_first']"));
	firstname.sendKeys("Arvind");
	//last name
	WebElement lastname=driver.findElement(By.xpath("//input[@name='q11_last']"));
	lastname.sendKeys("Raj");
	
	//select by month
	WebElement Selectmonth=driver.findElement(By.xpath("//select[@name='q12_month']"));
	Select value5=new Select(Selectmonth);
	value5.selectByIndex(10);
	
	
	//select by day
	WebElement day=driver.findElement(By.xpath("//select[@name='q12_day']"));
	Select value6=new Select(day);
	value6.selectByIndex(12);
	
	
	//select by year
	WebElement year=driver.findElement(By.xpath("//select[@name='q12_year']"));
	Select value7=new Select(year);
	value7.selectByIndex(6);
	

	

	
	WebElement enterverification=driver.findElement(By.xpath("//input[@id='visver_code']"));
	enterverification.sendKeys("Automation");
	// username
	
	WebElement username=driver.findElement(By.xpath("(//input[@id='user'])[1]"));
	username.sendKeys("Bharath");

	//Password
	WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
	Password.sendKeys("P@ssw0rd");
	System.out.println(Password);
	
	//WebElement login=driver.findElement(By.xpath("//input[@name='btnSubmit']"));
	//login.click();
	
	//Submit
	WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
	Submit.click();
	
		}

	

}
