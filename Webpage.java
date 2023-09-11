package org.Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



public class Webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ss\\eclipse-workspace\\SeleniumWEb\\driver\\geckodriver.exe");
		
		   
		    WebDriver driver = new FirefoxDriver();
			
		    Actions a = new Actions(driver);
		   
			driver.get("https://piraiinfo.com/");
			
			WebElement services = driver.findElement(By.xpath("//button[@id='service']"));
			a.moveToElement(services).perform();

			WebElement devops = driver.findElement(By.xpath("//a[text()='DevOps Service']"));
			a.doubleClick().build().perform();

			Thread.sleep(3000);
			
			Actions op = new Actions(driver);
			   
			WebElement iu = driver.findElement(By.xpath("//*[@id=\"application\"]"));
			  
			op.moveToElement(iu).click().perform();
			
			Thread.sleep(3000);
            
			
		    Actions iy = new Actions(driver);
			  
			WebElement  er = driver.findElement(By.id("cloud"));
			 
			iy.moveToElement(er).click();
			
			Thread.sleep(3000);


			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement accl = driver.findElement(By.xpath("//h3[text()='Accelerate Your Success ']"));
			js.executeScript("arguments[0].scrollIntoView(false)", accl);

			WebElement fir = driver.findElement(By.xpath("//input[@placeholder='First name']"));
			fir.sendKeys("Ranjith");

			WebElement las = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
			las.sendKeys("Manohar");

			WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
			mail.sendKeys("rahulranjith8919@gmail.com");

			WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
			ph.sendKeys("9080052458");

			Thread.sleep(3000);

			
			WebElement genEn = driver.findElement(By.xpath("//input[@name='toclick']"));
			js.executeScript("arguments[0].click()", genEn);

			WebElement msg = driver.findElement(By.xpath("//textarea[@placeholder='Enter your message']"));
			msg.sendKeys("QA Test Engineer");

			WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
			sub.click();
	}

}
