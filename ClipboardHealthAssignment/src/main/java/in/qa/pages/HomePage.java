package in.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.qa.base.BaseTest;
import in.qa.utils.PageUtils;
import in.qa.utils.WaitUtility;

public class HomePage extends BaseTest{

	public HomePage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	public enum LocatorType {
		Id, Xpath, CssSelector, Linktext, PartiallinkText, Tagname, Name, ClassName;
	}

	@FindBy(xpath="//a[@aria-label='Open Menu']") 
	WebElement hamburgerMenu;

	@FindBy(xpath="//div[text()='TV, Appliances, Electronics']//parent::a") 
	WebElement tvAppEleOption;

	@FindBy(xpath="//a[text()='Televisions']") 
	WebElement tvOption;

	@FindBy(xpath="//span[text()='Samsung']//parent::a") 
	WebElement samsung;



	public void filterProduct() throws InterruptedException
	{
		PageUtils.clickele(hamburgerMenu);
		PageUtils.clickele(tvAppEleOption);
		PageUtils.clickele(tvOption);
		WaitUtility.waitForElementToBeClickable(driver, samsung);
		PageUtils.selectCheckBox(samsung);
	}



}
