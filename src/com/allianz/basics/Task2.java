package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		//driver.findElement(By.xpath("//a[text()='select your product type'][1]")).click();
		WebElement pro= driver.findElement(By.className("sbSelector"));
		Actions actions=new Actions(driver);
		
		actions.click(pro).build().perform();
		
		WebElement creditCard= driver.findElement(By.linkText("Credit Card"));
		actions.click(creditCard).build().perform();
		
		WebElement cardNum= driver.findElement(By.xpath("//div[@class='colAcNum']"));
		actions.scrollToElement(cardNum).build().perform();
		actions.sendKeys(cardNum, "4545 5656 8887 9998 123").build().perform();
		
		WebElement cvv= driver.findElement(By.xpath("//input[@id='cvvnumber']"));
		actions.scrollToElement(cvv).build().perform();
		actions.sendKeys(cvv, "123").build().perform();
		
		WebElement date1= driver.findElement(By.xpath("//input[@value='dd/mm/yyyy']"));
		actions.scrollToElement(date1).build().perform();
		actions.click(date1).build().perform();
		
		//To select year
		WebElement year1= driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		actions.scrollToElement(year1).build().perform();
		Select selectYear=new Select(year1);
		selectYear.selectByVisibleText("2022");
		
		//To select month
		//WebElement month1= driver.findElement(By.xpath("//select[@data-handler='selectMont']"));
		
		WebElement month1=driver.findElement(By.className("ui-datepicker-month"));
		actions.scrollToElement(month1).build().perform();
		Select selectMonth=new Select(month1);
		selectMonth.selectByVisibleText("Apr");
		
		//ui-datepicker-month
		
		WebElement day1= driver.findElement(By.xpath("//td[@data-month='3']//a[text()='14']"));
		actions.scrollToElement(day1).build().perform();
		
		day1.click();
		//td[@data-month='3']//a[text()='14']
		
		
		WebElement proceedButton= driver.findElement(By.xpath("//input[@value='PROCEED']"));
		proceedButton.click();
	}

}
