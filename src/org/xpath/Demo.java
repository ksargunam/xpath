package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse-committers-2018-09-win32\\eclipse\\xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	Thread.sleep(500);
	WebElement btn = driver.findElement(By.xpath("//input[@value='Cricket']"));
	btn.click();
	Thread.sleep(500);
	WebElement click = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	click.click();
	}

}
