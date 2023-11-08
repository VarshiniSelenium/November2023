package com.selenium.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
@SuppressWarnings("unused")
public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHINI\\eclipse-workspace\\Helloworld\\1234\\chromedriver.exe");

		//ChromeDriver driver= new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext  sc= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		
	
		
		//1. identify we element
		WebElement Un= driver.findElement(By.id("identifierId"));
		
		//2. perform action
		Un.clear();
		Un.sendKeys("varshini0798@gmail.com");
		
		WebElement nxt=driver.findElement(By.id("identifierNext"));
		
		//nxt.clear();
		nxt.click();
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
