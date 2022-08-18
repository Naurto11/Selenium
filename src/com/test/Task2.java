package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		WebElement txtuser = driver.findElement(By.id("email"));

		txtuser.sendKeys("Suresh");

		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));

		txtpass.sendKeys("123345465");
		

		WebElement btnpres = driver.findElement(By.xpath("//button[text()='Log In']"));

		btnpres.click();

		WebElement pressbtn = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[2]"));

		pressbtn.click();

		WebElement topass = driver.findElement(By.name("email"));

		topass.sendKeys("9876543210");

		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Search']"));

		clickbtn.click();
		
		Thread.sleep(3000);
		
		driver.close();
		

		
	}
}
