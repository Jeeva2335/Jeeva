package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public String Browser = "chrome";
	
	public BaseClass() {
		if (driver==null){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kpsuresh\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}}


public String getURL(){
	return driver.getCurrentUrl();
	
}}
	
	