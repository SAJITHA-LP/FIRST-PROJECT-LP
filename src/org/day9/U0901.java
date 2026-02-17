package org.day9;

import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0901 
{
	private void T0901() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		
		
		//WebElement options = driver.findElement(By.id("nav-search-submit-button"));
	
		Actions actions=new Actions(driver);
		
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
			actions.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
			
			actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}
	
	private void T0902() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchtext = driver.findElement(By.className("gLFyf"));
		Actions actions=new Actions(driver);
		
		actions.sendKeys(searchtext, "Selenium traning in chennai").perform();
		Thread.sleep(1000);
		actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
	}
	
	private void T0903() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Click to see current date']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement display = driver.findElement(By.id("display"));
		System.out.println(display.getText());

	}
	private void T0904() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		Actions actions=new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		
		actions.doubleClick(element).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement display = driver.findElement(By.id("display1"));
		System.out.println(display.getText());
		
	}
	
	private void T0905() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
			
		WebElement element = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Hi how are you?");
		
		alert.accept();
		Thread.sleep(2000);
		WebElement display = driver.findElement(By.id("demo"));
		
		System.out.println(display.getText());
		
	}
	
	
	private void T0906() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/api/documentation");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		
		System.out.println(driver.getTitle());
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert.dismiss();
		
		actions.keyDown(Keys.ENTER).sendKeys("greens@gmail.com").keyUp(Keys.ENTER).perform();
		
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		U0901 day9=new U0901();
		//day9.T0901();
		//day9.T0902();
		//day9.T0903();
		//day9.T0904();
		//day9.T0905();
		day9.T0906();
		
	}
}
