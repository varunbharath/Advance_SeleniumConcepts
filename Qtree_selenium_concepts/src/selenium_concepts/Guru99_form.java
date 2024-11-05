package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//  Contact Information
		
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.sendKeys("Varun");
		
		WebElement mail=driver.findElement(By.xpath("//input[@name='userName']"));
		mail.sendKeys("123@gmail.com");
		WebElement lastName=driver.findElement(By.xpath("(//input[@ name='lastName'])"));
		lastName.sendKeys("Bharath");
		WebElement phoneNO=driver.findElement(By.xpath("(//input[@name='phone' and@ size='15'])[1] "));
		phoneNO.sendKeys("1234567890");
		
		//  Mailing Information
		
		WebElement Address=driver.findElement(By.xpath("(//input[@ name='address1'])"));
		Address.sendKeys("PSGTech");
		
		WebElement City=driver.findElement(By.xpath("(//input[@ name='city'])"));
		City.sendKeys("Coimbatore");
		
		WebElement State=driver.findElement(By.xpath("(//input[@ name='state'])"));
		State.sendKeys("TamilNadu");
		
		WebElement Postalcode=driver.findElement(By.xpath("(//input[@ name='postalCode'])"));
		Postalcode.sendKeys("641005");
		

		WebElement Country=driver.findElement(By.xpath("//select[@ name='country']"));
		Select selectcountry=new Select(Country);
		
		selectcountry.selectByVisibleText("INDIA");
		
		WebElement firstoption	=selectcountry.getFirstSelectedOption();
		
		
		String Expectedvalue="INDIA";
		//if(Expectedvalue.i)
		
		
		if (firstoption.getText().equalsIgnoreCase(Expectedvalue)) {
			System.out.println("Selected value is correct:"+firstoption.getText());
			
		}
		else {
			System.out.println("Selected value is incorrect. Expected:"+Expectedvalue+"but I got"+firstoption.getText());
		}
		
		List<WebElement> range=selectcountry.getOptions();
		int sixefordropdown=range.size();
		System.out.println("Dropdownsize"+sixefordropdown);
		for (WebElement showthesize : range) {
			System.out.println(showthesize.getText());
			
		}
		
		
		
		
		// User Information
		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("Ram");
		WebElement Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Password.sendKeys("Coimbatore");
		System.out.println(Password);
		WebElement Confirmpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Confirmpassword.sendKeys("Coimbatore");
		
		
		WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
		if(Submit.isEnabled()) {
			System.out.println(Submit+"Submit Button is enabled");
		}
	
		if(Submit.isDisplayed()) {
			System.out.println(Submit+"Submit Button is Displayed");
		}
		if(Submit.equals(Submit)) {
			System.out.println(Submit+"Submit Button is Clicked");
		} else 
		{//Submit.click(); 
		System.out.println("Clicked by Automation");
		

				 JavascriptExecutor js = (JavascriptExecutor) driver;
			     js.executeScript("arguments[0].click();", Submit);
		}
		
		//submit button Position
	Point position	=Submit.getLocation();
	int x=position.getX();
	int y=position.getY();	
	System.out.println("value of x"+ x +"value of Y"+y);
	
	//submit button size
	int height=Submit.getSize().getHeight();
	int width=Submit.getSize().getWidth();
	System.out.println(height+ " "+ width);
	
	WebElement Supportbutton=driver.findElement(By.xpath("//a[text()='SUPPORT']"));
	
	JavascriptExecutor clicksupport=(JavascriptExecutor) driver;
	clicksupport.executeScript("arguments[0].click();",Supportbutton);
	 

	
	
	
		
		
		
		
		
		
	}

}
