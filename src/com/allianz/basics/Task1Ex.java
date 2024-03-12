package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Ex {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("John@gmail.com");
		//driver.findElement(By.name("CompanyName")).click();
		
		//driver.findElement(By.name("UserTitle"))
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("Sales Manager");
		
		Select selectEmp=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("101 - 200 employees");
		
		
		//driver.findElement(By.xpath("//div[contains(@class,'checkbox')]")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-ui'][2]")).click();
		
		
		
		
		
		
		
		
		
	}

}
