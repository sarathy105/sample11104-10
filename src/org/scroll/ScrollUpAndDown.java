package org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 9\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("http://greenstech.in/selenium-course-content.html");
	
	WebElement scrolldown = driver.findElement(By.id("heading8825"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView('true')",scrolldown);
	js.executeScript("arguments[0].click()",scrolldown);
	Thread.sleep(3000);
	WebElement scrollup = driver.findElement(By.xpath("//a[text()='Corporate Training']"));
	js.executeScript("arguments[0].scrollIntoView('false')",scrollup);
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	}

}
