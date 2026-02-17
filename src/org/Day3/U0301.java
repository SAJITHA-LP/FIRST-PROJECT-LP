package org.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0301 
{
	private void T0301() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("greenstechchennaiomr@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Greens@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[@value='login']")).click();
		Thread.sleep(5000);
		driver.close();
		}
	
	private void T0303()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox-cricket']")).click();
		driver.findElement(By.xpath("//button[@value='Refresh']")).click();
		
		}
	
	private void T0304() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		}
	
	private void T0305()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velmurugansiromrbranch@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Greens@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		}
	
	private void T0306()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velmurugansiromrbranch@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Greens@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		}

	public static void main(String[] args) throws InterruptedException 
	{
		U0301 day3=new U0301();
		//day3.T0301();
		//day3.T0303();
		//day3.T0304();
		//day3.T0305();
		day3.T0306();
		
	}

}
