package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentHistoryPage {
	WebDriver driver;
	public PaymentHistoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@aria-labelledby='Sub activity Sub activity']")
	private WebElement subactivitydropdown;
	public WebElement getSubactivitydropdown() {
		return subactivitydropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='Badminton']" )
	private WebElement Badmintonoption;
	public WebElement getBadmintonoption() {
		return Badmintonoption;
	}	
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement fromdatecalenderdropdown;
	public WebElement getFromdatecalenderdropdown() {
		return fromdatecalenderdropdown;
	}
	
	@FindBy(xpath = "(//button[contains(text(),'1')])[1]")
	private WebElement selectdateas1;
	public WebElement getSelectdateas1() {
		return selectdateas1;
	}
	
	@FindBy(xpath = "//input[@id='To Date']")
	private WebElement todatefield;
	public WebElement getTodatefield() {
		return todatefield;
	}
	
	@FindBy(xpath = "//h5[normalize-space()='No Payments Found!']")
	private WebElement nofoundtext;
	public WebElement getNofoundtext() {
		return nofoundtext;
	}
	
}
