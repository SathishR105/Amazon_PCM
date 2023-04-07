package TestingPrg;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;

import BasicPrg.LoginPage;

Run All

public class PlaceOrder extends TestBase {
	@Test
	Run | Debug
	public void LoginTest() {
		LoginPage loginTest = new LoginPage();
		loginTest.validateLogin("sathish.ravi105@gmail.com" ,"sathish@105");
		
	}
	@Test
	Run | Debug
	public void selectProductTest() {
}


@Test
 Run | Debug
public void addToCartTest() {
}

@Test
Run | Debug
public void makepayment() {
	
}

@Test
Run | Debug
public void logoffTest() {
	
}

@BeforeClass
public void beforeClass() {
	launchBrowser();
	navigateToURL();
}
@AfterClass
public void afterClass() {
}
}
