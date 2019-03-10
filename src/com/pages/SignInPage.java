package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	String username = "karthiksmilescool@gmail.com";
	String baseUrl = "https://calendar.google.com/calendar/r";
	String password = "youngBLOOD";

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void signIn(WebDriver driver) {

		driver.get(baseUrl);
		// Finding Elements in the user name page
		WebElement passUsername = driver.findElement(By.xpath("/html//input[@id='identifierId']"));
		WebElement nextBtnClick = driver.findElement(By.xpath("//div[@id='identifierNext']"));

		// Passing Elements
		passUsername.sendKeys(username);
		nextBtnClick.click();
		// Finding Elements in the password page
		WebElement passPassword = driver.findElement(By.xpath("/html//div[@id='password']//input[@name='password']"));
		// Passing Elements
		passPassword.sendKeys(password);
		WebElement signInBtnClick = driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']"));
		signInBtnClick.click();

	}

}
