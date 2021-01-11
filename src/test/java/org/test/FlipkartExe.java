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
		
		fill(a.getUsername(), "vasu");
		
		fill(a.getPassword(), "9629983502");
		
		click(a.getLogin());
	}


	@Test(priority = 5,invocationCount = 2)
	public void testcase4() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "vasu");
		
		fill(a.getPassword(), "9629983502");
		
		click(a.getLogin());
	}
	@Test(priority = 5,invocationCount = 2)
	public void testcase5() {
		
		Flipkartpojo a= new Flipkartpojo();
		
		launchurl("https://www.flipkart.com/account/login");
		
		fill(a.getUsername(), "vasu");
		
		fill(a.getPassword(), "9629983502");
		
		click(a.getLogin());
	}

}
