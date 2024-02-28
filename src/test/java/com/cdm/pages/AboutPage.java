package com.cdm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.cdm.common.CommonActions;

public class AboutPage extends CommonActions {

	public AboutPage(WebDriver driver, ExtentTest logger) // created WebDriver Constructor
	{
		super(driver, logger);

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//div[contains(text(),'Application Version: 1.0.107')]") // these all are locators
	WebElement versionText;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'About')]") // these all are locators
	WebElement AboutTab;
	
	@FindBy(tagName ="title")
	WebElement aboutTitle;
	
	
	
	public void aboutTab() {
		AboutTab.click();
	}
	public void verifyTitle() {
		aboutTitle.getText();
		
	}
	
	public void versionText() {
		versionText.getText();
	}
	
	public void verifyTitleColor(String expectedColor) {
        // Retrieve the stored color value from the context
        String actualColor = ScenarioContext.getContext("titleColor");

        assert actualColor.equalsIgnoreCase(expectedColor) :
                "Title color is not as expected. Actual: " + actualColor + ", Expected: " + expectedColor;
    }
	
	public void captureTitleColor() {
        // Capture the color of the title element
        WebElement titleElement = driver.findElement(By.tagName("title"));
        String titleColor = titleElement.getCssValue("color");

        // Store the captured color value for later verification
        ScenarioContext.setContext("titleColor", titleColor);
    }
	
	public void setZoomLevel(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
}

