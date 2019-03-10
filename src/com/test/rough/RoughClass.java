package com.test.rough;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.EventPage;
import com.pages.SignInPage;

public class RoughClass {

	private static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Materials\\Selenium\\packages\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SignInPage signUp = new SignInPage(driver);

		signUp.signIn(driver);
		
		EventPage opnEvnt = new EventPage();
		System.out.println(opnEvnt.createEvent(driver, "karthik"));
		
		
/*		//*[@id="yDmH0d"]/div/div/div[2]/content/div/div[1]/div[3]/div/div[1]/div/div[1]/input
*/
	}

}
