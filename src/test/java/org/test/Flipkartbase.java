package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkartbase {
		
	public static WebDriver driver;
	
	public static void launchurl(String url) {
		driver.get(url);
	}
	
	public static void fill(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static String gettitle() {
		String text1=driver.getTitle();
		return text1;
	}
	
	public static String getcurrenturl() {
		String cuurl = driver.getCurrentUrl();
		return cuurl;
	}
}
