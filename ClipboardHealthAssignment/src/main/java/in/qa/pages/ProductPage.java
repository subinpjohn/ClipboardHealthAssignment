package in.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.qa.base.BaseTest;
import in.qa.utils.PageUtils;
import in.qa.utils.WaitUtility;

public class ProductPage extends BaseTest {

	public ProductPage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	public enum LocatorType {
		Id, Xpath, CssSelector, Linktext, PartiallinkText, Tagname, Name, ClassName;
	}
	
	@FindBy(xpath="//div[@id='feature-bullets']//h1") 
	WebElement aboutThisItem;
	
	
    public String aboutThisItemText()
    {  
    	WaitUtility.waitForEle(driver, aboutThisItem);
    	String aboutThisItemText=PageUtils.getText(aboutThisItem);
    	return aboutThisItemText;
    }
    
}
