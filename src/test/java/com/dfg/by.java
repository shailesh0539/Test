package com.dfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class by {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		
	}
	
	
	
	
	
	
	
	
	
//	public String getXpath(WebElement ele) {
//	    String str = ele.toString();
//	    String[] listString = null;
//	    
//	    if(str.contains("xpath"))
//	    		
//	      listString = str.split("xpath:");
//	    
//	    else if(str.contains("id"))
//	    		
//	      listString = str.split("id:");
//	    
//	    String last = listString[1].trim();
//	    
//	    return last.substring(0, last.length() - 1);
//	}
}
