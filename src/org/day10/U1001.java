package org.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class U1001 
{
	private void T01() throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.name("day"));
		
		Select select=new Select(day);
		select.selectByIndex(1);
		
		
		
		

	}
	public static void main(String[] args) throws InterruptedException 
	{
		U1001 day10=new U1001();
		day10.T01();
		
	}
}
