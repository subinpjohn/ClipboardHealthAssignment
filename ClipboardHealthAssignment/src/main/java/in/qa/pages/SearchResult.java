package in.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.qa.base.BaseTest;
import in.qa.utils.PageUtils;
import in.qa.utils.WaitUtility;

public class SearchResult extends BaseTest {
	
	public SearchResult(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	public enum LocatorType {
		Id, Xpath, CssSelector, Linktext, PartiallinkText, Tagname, Name, ClassName;
	}
		
	@FindBy(id="s-result-sort-select") 
	WebElement sortDrp;
	
	@FindBy(xpath="//img[@class='s-image']") 
	WebElement prdImg;
	
	
    public void sort(String visibleText)
    {  
    	WaitUtility.waitForEle(driver, sortDrp);
    	PageUtils.drp(sortDrp, visibleText);
    }
    
    public void clickOnPrdImg()
    {  
    	WaitUtility.waitForEle(driver, prdImg);
    	PageUtils.clickele(prdImg);
    }

}
