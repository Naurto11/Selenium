package org.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));

		txtuser.sendKeys("Suresh");

		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));

		txtpass.sendKeys("183345465");
		
		WebElement btnpres = driver.findElement(By.xpath("//button[text()='Log In']"));

		btnpres.click();
		
	

		

		String url = driver.getCurrentUrl();

		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		
	}

}
