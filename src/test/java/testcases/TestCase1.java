package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeMethod
	public void createDBConn( ) {
		System.out.println("Create DB Connection");
	}

	@AfterMethod
	public void closeDBConn( ) {
		System.out.println("Closing DB Connection");
	}	
	
	@BeforeMethod
	public void launchBrowser( ) {
		System.out.println("Launching Browser");
	}

	@AfterMethod
	public void closeBrowser( ) {
		System.out.println("Closing Browser");
	}	
	
	@Test(priority=1)
	public void doUserReg( ) {
		System.out.println("Executing User Reg Test");
	}	
	
	@Test(priority=2)
	public void doLogin( ) {
		System.out.println("Executing Login Test");
	}
	
	@Test(priority=3)
	public void checkPage( ) {
		System.out.println("Check for the page opening");
	}	

	@Test(priority=4)
	public void checkTab( ) {
		System.out.println("Check for the page tabs");
	}
	
}
