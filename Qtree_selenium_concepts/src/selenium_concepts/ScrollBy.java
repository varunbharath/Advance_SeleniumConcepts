package selenium_concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manageengine.com/products/self-service-password/?camid=19897561874&adgid=151373317630&kwd=&matchtype=&adid=652678897673&network=d&adposition=&loc=9153066&placement=guru99.com&target=guru99.com&device=c&gclid=EAIaIQobChMIwrTQjPDhhwMVhii3AB0Z3wmIEAEYASAAEgJcu_D_BwE");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,-1500)");

	}

}
