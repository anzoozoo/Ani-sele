package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualCurrentUrl=driver.getCurrentUrl();
		System.out.println("URL="+actualCurrentUrl);
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		String actualPageSource=driver.getPageSource();
		System.out.println("PageSource="+actualPageSource);
		
		driver.quit();

	}

}
