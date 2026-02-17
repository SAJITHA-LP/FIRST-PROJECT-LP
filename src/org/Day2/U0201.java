package org.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0201 
{
	public void T0201() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Greens@123");
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0202()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("first_name"));
		username.sendKeys("GreensTech");
		
		WebElement password = driver.findElement(By.id("last_name"));
		password.sendKeys("omr");
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		address.sendKeys("ICICI Bank upstairs");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9003855316");
		
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("Greens@123");
		
		WebElement password2 = driver.findElement(By.id("confirm-password"));
		password2.sendKeys("Greens@123");
		
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0204() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("_R_32d9lplcldcpbn6b5ipamH1_"));
		username.sendKeys("velmurugansirgtomr");
		
		WebElement password = driver.findElement(By.id("_R_33d9lplcldcpbn6b5ipamH1_"));
		password.sendKeys("Greens@123");
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0205() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("greensomrbranch");
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0206() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?authuser=1");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("APjFqb"));
		username.sendKeys("greensomrbranch");
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0207() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icici.bank.in/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.className("input-content"));
		username.sendKeys("Education Loan");
		
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	public void T0208() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement from = driver.findElement(By.className("inputAndSwapWrapper___15de7e"));
		
		
		boolean enabled = from.isEnabled();
		System.out.println(enabled);
		from.click();
		Thread.sleep(3000);
		
		WebElement src = driver.findElement(By.id("srcinput"));
		src.sendKeys("Koyambedu");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.id("destinput"));
		dest.sendKeys("Theni");
		Thread.sleep(3000);
		
	
		
		
		
		
		
				
		//String title = driver.getTitle();
		
		//String currentUrl = driver.getCurrentUrl();
				
		//System.out.println(title);
		//System.out.println(currentUrl);
		//driver.quit();
	}
	
	public void T0209() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.id("search-box-input"));
		search.sendKeys("books");
	}
	
	public void T0210() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Greens@123");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		U0201 day2=new U0201();
		//day2.T0201();
		//day2.T0202();
		//day2.T0204();
		//day2.T0205();
		//day2.T0206();
		//day2.T0207();
		day2.T0208();
		//day2.T0209();
		//day2.T0210();
			
	}
}
