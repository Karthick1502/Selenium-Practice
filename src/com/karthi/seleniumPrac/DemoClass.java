package com.karthi.seleniumPrac;

public class DemoClass {
	static String str = "chrome";
	
	public static void main(String[] args) {
		driver.findElement(By.id("submit")).click();
		System.out.println("Clicked submit");
	}
	
	
}
