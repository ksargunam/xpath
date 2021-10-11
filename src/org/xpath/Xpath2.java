package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse-committers-2018-09-win32\\eclipse\\xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	user.sendKeys("ram");
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	pass.sendKeys("123456789");
	WebElement btnclick = driver.findElement(By.name("login"));
	btnclick.click();
	
	}

}
