package com.karthi.seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	static WebDriver driver ;
		
		protected static WebDriver launchBrowser( String browsername) {
			
			try {
				if( browsername.equals("chrome")) {
					driver = new ChromeDriver();
				}
				else if ( browsername.equals("edge")) {
					driver = new EdgeDriver();
				}
				else if ( browsername.equals("firefox") ) {
					driver = new FirefoxDriver();
				}	
			} catch (Exception e) {
					
			}
			driver.manage().window().maximize();
			return driver;
			
	}
	
		protected static void launchUrl(String url) {
			driver.get(url);
		}

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		launchUrl("https://www.flipkart.com/");
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//span[text() = 'Login']")).getText();
		if ( text.equals("Login")) {
			System.out.println("verified");
		}else {
			System.out.println("not verified");
		}
		
		System.out.println(" hi all ");

	}
	
	

}
