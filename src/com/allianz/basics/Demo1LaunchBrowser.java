package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		
		
		WebDriver driver=null;
		String browser="edge";
		
		if (browser.equalsIgnoreCase("ch")) 
		{
			driver=new ChromeDriver();
		} 
		else 
		{
			driver=new EdgeDriver();
		}
		
		WebDriver driver1=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver1.get("https://www.google.com/");
		String actualCurrentUrl=driver.getCurrentUrl();
		System.out.println("URL="+actualCurrentUrl);
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		String actualPageSource=driver.getPageSource();
		System.out.println("PageSource="+actualPageSource);
		
		driver1.quit();
		driver.quit();
		
	}

}
