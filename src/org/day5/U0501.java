package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0501 
{
	
		private void T0501() 
		{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("greenstechchennaiomr@gmail.com");
		String domProperty = username.getDomProperty("value");
		System.out.println(domProperty);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Greens@123");
		System.out.println(password.getDomProperty("value"));
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();	
		}
		
		private void T0502() 
		{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement male = driver.findElement(By.xpath("//label[@for='male']"));
		
		
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		
		System.out.println(male.getDomProperty("value"));
		
		}
		
		
		
		
		public static void main(String[] args) 
		{
			U0501 day5=new U0501();
			day5.T0501();
			day5.T0502();
		}
}
