package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//day 7 & day 8
public class U0601 
{
	private void T0601() 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
	
	driver.manage().window().maximize();
	//move to element which we want to click
//	WebElement stringclass = driver.findElement(By.xpath("//a[text()='Courses ']"));
	Actions actions=new Actions(driver);
//	actions.moveToElement(stringclass).perform();
	
	
	//drag and drop
	WebElement src = driver.findElement(By.id("credit2"));
	WebElement des = driver.findElement(By.id("java-class"));
	actions.dragAndDrop(src, des).perform();

	}
	
	private void T0602() 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/webhp?authuser=1");
	
	driver.manage().window().maximize();
	// rightclick
	WebElement gmail = driver.findElement(By.className("gb_Z"));
	Actions actions=new Actions(driver);
	actions.contextClick(gmail).perform();
	}
	
	private void T0603() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		//doubleclick
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Greens");
		Actions actions=new Actions(driver);
		actions.doubleClick(username).perform();
	}
	
	private void T0604() throws AWTException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/webhp?authuser=1");
	
	driver.manage().window().maximize();
	//robot action virtual key press
	WebElement gmail = driver.findElement(By.className("gb_Z"));
	Actions actions=new Actions(driver);
	actions.contextClick(gmail).perform();
	
	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	private void T0605() throws AWTException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	//robot action virtual key press
	
	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	}
	private void T0606() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("Iphone",Keys.ENTER);
	}
	
	private void T0607() throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.className("dropdown-toggle"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(courses).perform();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	private void T0608() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(prime).perform();
		Thread.sleep(3000);
		driver.findElement(By.className("a-button-inner")).click();
		
	}
	
	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		U0601 day6=new U0601();
		//day6.T0601();
		//day6.T0602();
		//day6.T0603();
		//day6.T0604();
		//day6.T0605();
		//day6.T0606();
		//day6.T0607();
		day6.T0608();
		
		
	}
}
