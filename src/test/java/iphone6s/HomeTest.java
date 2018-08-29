package iphone6s;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BaseClass;
import Package1.ObjectClass;

public class HomeTest {
	//ObjectClass homepage = new ObjectClass();
	//BaseClass BC = new BaseClass();
	
	ObjectClass homepage;
	BaseClass BC;
	
	public HomeTest(){
		
	ObjectClass homepage = new ObjectClass();
	BaseClass BC = new BaseClass();
	
	}
	@Test
	public void verifywomen(){
		Assert.assertTrue(homepage.getwomen().isDisplayed());
	}
	@ Test
	public void verifydresses(){
		Assert.assertTrue(homepage.getdresess().isDisplayed());
	}
	@Test
	public void verifyTshirt(){
		Assert.assertTrue(homepage.getTshirt().isDisplayed());
	}
}
