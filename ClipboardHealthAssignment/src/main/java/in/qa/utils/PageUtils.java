package in.qa.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import in.qa.base.BaseTest;

public class PageUtils extends BaseTest{


	public static void sendInput(WebDriver driver,WebElement ele,String input)
	{
		ele.clear();
		ele.sendKeys(input);
	}

	public static void clickele(WebElement ele)
	{
		ele.click();
	}

	public static void selectCheckBox(WebElement ele)
	{
		if(!ele.isSelected())
		{
			ele.click();
		}
	}

	public static void drp(WebElement ele,String text)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(text);
	}

	public static String getText(WebElement ele)
	{
		String text=ele.getText();	
		return text;
	}

	public static void scrollTillEle(WebDriver driver, WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	public static void scroll(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,000)", "");
	}


}
