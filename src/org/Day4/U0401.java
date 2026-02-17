package org.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0401 
{
	private void T0401() 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.omrbranch.com/");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.xpath("//span[contains(text(),'have ')]"));
	String text = element.getText();
	System.out.println(text);

	WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'VELMURUGAN')]"));
	System.out.println(element2.getText());
	
	
	
	}
	public static void main(String[] args) 
	{
		U0401 day4=new U0401();
		day4.T0401();
	}
}
