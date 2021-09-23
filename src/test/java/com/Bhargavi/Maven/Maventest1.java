package com.Bhargavi.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maventest1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

         driver.get("https://www.mortgagecalculator.org");
         driver.manage().window().maximize();
         Thread.sleep(2000);
        driver.close();
	}
}
