package selenium_concepts;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=amazon");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazon.PNG"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		File a= new File(("C:\\Screenshotstroed\\amazondown2.PNG"));
		FileUtils.copyFile(screenshot, a);

		//FileUtils.copyFile(screenshot, new File("C:\\Screenshotstroed\\amazondown.PNG"));


	       TakesScreenshot scrshot = ((TakesScreenshot) driver);


	       File source = scrshot.getScreenshotAs(OutputType.FILE);
	       File path = new File("D:\\screenshot\\img.png");
	      // FileHandler.copyFile(source, path);
FileUtils.copyFile(source, path);


	}

}
