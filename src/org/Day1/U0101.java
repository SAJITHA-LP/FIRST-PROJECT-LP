package org.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0101 
{
	public void T0101() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currentUrl);
		driver.quit();
	}
	
	public void T0102() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://traininginomr.co.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currentUrl);
		driver.quit();
	}
	
	public void T0103() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currentUrl);
		driver.quit();
	}
	
	public static void main(String[] args) 
	{
		U0101 day1=new U0101();
		day1.T0101();
		day1.T0102();
		day1.T0103();
		
	}
}

