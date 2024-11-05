package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Qtree_Selenium\\\\ChromeDriver\\\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
driver.manage().window().minimize();
driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.navigate().back();
driver.navigate().to("https://www.mycontactform.com/samples.php");

driver.navigate().refresh();
driver.manage().window().maximize();
//driver.get("https://www.mycontactform.com/samples.php");
//driver.close();
WebElement Marketing_Department=driver.findElement(By.xpath("//input[@value=\"0\"]"));
Marketing_Department.click();
WebElement sales=driver.findElement(By.xpath("(//input[@value=\"1\"])[1]"));
sales.click();
WebElement Customer_Service= driver.findElement(By.xpath("//input[@value=\"2\"]"));
Customer_Service.click();
WebElement Subject= driver.findElement(By.xpath("//input[@name=\"subject\"]"));
Subject.sendKeys("Value");
WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
email.sendKeys("123@gmailcom");
WebElement toolbox=driver.findElement(By.xpath("//input[@id=\"q1\"]"));
toolbox.sendKeys("Random");
WebElement Text_BoxMultiLine=driver.findElement(By.xpath("//textarea[@name=\"q2\"]"));
Text_BoxMultiLine.sendKeys("Random");
WebElement selectdropdown=driver.findElement(By.xpath("//select[@name=\"q3\"]"));

List<WebElement> dropdown=driver.findElements(By.xpath("//select[@name=\"q3\"]"));
int findsize=dropdown.size();
System.out.println(findsize);
Select bb=new Select(selectdropdown);
bb.selectByVisibleText("Second Option");



WebElement firstoption=driver.findElement(By.xpath("//input[@value=\"First Option\"]"));
firstoption.click();
WebElement single_Answer=driver.findElement(By.xpath("//input[@id=\"q5\"]"));
single_Answer.click();
WebElement MultiAnswerfirstcheckbox=driver.findElement(By.xpath("//input[@value=\"First Check Box\"]"));
MultiAnswerfirstcheckbox.click();
WebElement Multi2checkbox=driver.findElement(By.xpath("//input[@value=\"Second Check Box\"]"));
Multi2checkbox.click();
WebElement MultiAnswer3checkbox=driver.findElement(By.xpath("//input[@value=\"Third Check Box\"]"));
MultiAnswer3checkbox.click();
WebElement MultiAnswer4checkbox=driver.findElement(By.xpath("//input[@value=\"Fourth Check Box\"]"));
MultiAnswer4checkbox.click();
WebElement MultiAnswer5checkbox=driver.findElement(By.xpath("//input[@value=\"Fifth Check Box\"]"));
MultiAnswer5checkbox.click();
//WebElement date=driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]"));
//date.sendKeys("10-11-2024");

WebElement usstates=driver.findElement(By.xpath("//select[@id=\"q8\"]"));
Select usdrop=new Select(usstates);
usdrop.deselectByVisibleText("KY");
List<WebElement> value=usdrop.getOptions();
int options1=value.size();
System.out.println("value of us"+options1);

WebElement country=driver.findElement(By.xpath("//select[@id=\"q9\"]"));
Select countrydrop=new Select(country);
countrydrop.deselectByVisibleText("American Samoa");
List<WebElement> countryvalue=usdrop.getOptions();
int countryoptions1=value.size();
System.out.println("value of us"+countryoptions1);



WebElement Canadian_Provinces=driver.findElement(By.xpath("//select[@id=\"q10\"]"));
Select Canadiandrop=new Select(Canadian_Provinces);
Canadiandrop.deselectByVisibleText("Newfoundland and Labrador");
List<WebElement> canadianvalue=Canadiandrop.getOptions();
int candianranoptions=value.size();
System.out.println("value of us"+candianranoptions);

WebElement definedname=driver.findElement(By.xpath("//select[@name=\"q11_title\"]"));
Select definednamedrop=new Select(definedname);
definednamedrop.deselectByVisibleText("Dr.");

WebElement firstname=driver.findElement(By.xpath("//input[@name=\"q11_first\"]"));
firstname.sendKeys("Arvind");
WebElement lastname=driver.findElement(By.xpath("//input[@name=\"q11_last\"]"));
lastname.sendKeys("Raj");

WebElement dob_month=driver.findElement(By.xpath("//select[@name=\"q12_month\"]"));
Select month=new Select(dob_month);
month.deselectByVisibleText("7");

WebElement dob_date=driver.findElement(By.xpath("//select[@name=\"q12_day\"]"));
Select date1=new Select(dob_date);
date1.deselectByVisibleText("26");

WebElement dob_year=driver.findElement(By.xpath("//select[@name=\"q12_year\"]"));
Select year=new Select(dob_year);
year.deselectByVisibleText("2007");


WebElement imgverification=driver.findElement(By.xpath("//img[@id=\"verification_image\"]"));
String aa=imgverification.getAttribute("Visual Verification Image");
System.out.println(aa);
WebElement enterverification=driver.findElement(By.xpath("//input[@id=\"visver_code\"]"));
enterverification.sendKeys("Random");
//
//
	}

}
