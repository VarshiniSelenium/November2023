package com.varshini.automation.testngprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestngProgram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARSHINI\\eclipse-workspace\\Helloworld\\1234\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		WebDriverWait wait= new WebDriverWait(driver,  Duration.ofSeconds(56));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("IdentifierId"))));
		
		WebElement un = driver.findElement(By.id("IdentifierId"));
		//ExpectedConditions.attributeContains(By.id("identifierId"), "id", "IdentifierId");
		//ExpectedConditions.attributeContains(un, "name", "Identifier");
		
		un.clear();
		un.sendKeys("tallurivarshini07@gmail.com");
		
		WebElement next = driver.findElement(By.id("IdentifierNext"));
		next.click();
		
		Thread.sleep(5000);
		driver.close();

		
			
	}

}
