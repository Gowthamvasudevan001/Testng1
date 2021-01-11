package org.test;

import java.sql.DriverManager;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartExe extends Flipkartbase{

	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public static void close() {
		driver.quit();
	}
	
	@BeforeMethod
	public void startTime() {
		Date st = new Date();
		System.out.println(st);
	}
	
	@AfterMethod
	public void endTime() {
		Date et = new Date();
		System.out.println(et);
	}
	
	@Test(priority = 5,invocationCount = 2)
	public void testcase1() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "Gowthamvasudevan");
		
		fill(a.getPassword(), "156156982");
		
		click(a.getLogin());
	}
	
	@Test(invocationCount = 4,priority = 1)
	public void testcase2() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "Muthulakshmi");
		
		fill(a.getPassword(), "7849555252");
		
		click(a.getLogin());
	}
	
	@Test(enabled = false)
	public void testcase3() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
	
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Gowtham"),"check the url");
		
		fill(a.getUsername(), "8825461756");
		
		String ggg = a.getUsername().getAttribute("Value");
		Assert.assertEquals(ggg, "gowtham", "Check the message");
		
		fill(a.getPassword(), "5228585526");
		
		click(a.getLogin());
	}
	
	@Test(priority = -2)
	public void testcase4() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		SoftAssert sa = new SoftAssert();
		String currentUrl = driver.getCurrentUrl();
		sa.assertTrue(currentUrl.contains("Ghghgh"), "Chek the message");
		
		fill(a.getUsername(), "Muthuvasudevan");
		
		fill(a.getPassword(), "48948262");
		
		click(a.getLogin());
		
		sa.assertAll();
	}
	
	@Test(priority = 3)
	public void testcase5() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "Lakshmigowtham");
		
		fill(a.getPassword(), "2562598");
		
		click(a.getLogin());
		
	}
	
	@Test(invocationCount = 3)
	public void testcase6() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "Vasujsdnkjdn");
		
		fill(a.getPassword(), "Lakshmi6515");
		
		click(a.getLogin());
	}
}
