package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectClass extends BaseClass 
{
@FindBy(xpath = "//div[@id='block_top_menu']//ul//li//a[@title='Women']")
private WebElement Women;

@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title ='Dresses']")
private WebElement dresses;

@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title ='T-shirts']")
private WebElement Tshirt;

public ObjectClass(){
	PageFactory.initElements(driver, this);
}
public WebElement getwomen(){
	return Women;
	
}
public WebElement getdresess(){
	return dresses;
	
}
public WebElement getTshirt(){
	return Tshirt;
	
}


}