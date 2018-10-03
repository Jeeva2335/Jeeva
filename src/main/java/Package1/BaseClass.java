package Package1;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public boolean elementFound(WebElement element ){
		boolean res = false;
			try{
			res = element.isDisplayed();
		}catch(Exception e){
			e.printStackTrace();
		}
			return res;
		}

public String getURL(){
	return driver.getCurrentUrl();
	
}
public String RandomEmailId(int a){
	int value = new Random().nextInt(a);
	String EmailId = "Jeeva"+value+"@gmail.com";
	return EmailId;
}
public void Toclick(WebElement element){
	element.click();
}
}
	
	