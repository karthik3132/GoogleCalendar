package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventPage {

	//private WebDriver driver;

	/*public EventPage(WebDriver driver) {
		this.driver = driver;
	}*/

	public String createEvent(WebDriver driver, String eventName) {
		// To open the quick event page
		
		WebElement eventBtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/button"));
		eventBtn.click();
		
		WebElement title = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div/div/div[2]/content/div/div[1]/div[3]/div/div[1]/div/div[1]/input"));
		title.sendKeys(eventName);
		
		WebElement startMnth = driver.findElement(By.xpath("//*[@id=\"xStDaIn\"]"));
		startMnth.click();
		
		WebElement currentMnthCheck = driver.findElement(By.xpath("//*[@id=\"c656\"]/div/div[1]/span"));
		String currentMonth = currentMnthCheck.getText();
		
		return currentMonth;
		// Starting month click ---> //*[@id="xStDaIn"]
		// Find the current month(By getting the text) ---> //*[@id="c656"]/div/div[1]/span
		// previous Month navigation ---> //*[@id="c656"]/div/div[1]/div[1]/content/span
	}
	
}
