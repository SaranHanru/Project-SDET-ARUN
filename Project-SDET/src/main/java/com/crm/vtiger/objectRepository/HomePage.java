package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genericJavaUtilities.WebDirverUtilities;

public class HomePage extends WebDirverUtilities {
	WebDriver driver;
	WebDirverUtilities wb = new WebDirverUtilities();

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orglink;

	@FindBy(linkText = "Calendar")
	private WebElement calendarLink;

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadsLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement oppLink;

	public void leadsClk() {
		leadsLink.click();
	}

	public void orgclk() {
		orglink.click();
	}
	/**
	 * to log out
	 */
	  @FindBy(xpath = "//span[@class='userName']/following::img[1]")
	private WebElement signOutHouver;
	

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signClk;

public WebElement signHouver() {
		return signOutHouver;
}

	public WebElement signOutclk() {
		return signClk;

	}

	public void logOut() {

		HomePage hp = new HomePage(driver);
		WebDirverUtilities wb1 = new WebDirverUtilities();
		wb1.mouseHover(driver,signOutHouver );
		signClk.click();
	}

}