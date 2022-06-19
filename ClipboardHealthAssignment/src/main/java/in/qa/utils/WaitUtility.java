package in.qa.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long PAGE_LOAD_WAIT = 20;
	public static final long EXPLICIT_WAIT = 50;
	public static final long IMPLICIT_WAIT = 20;

	public enum LocatorType {
		Id, Xpath, CssSelector, Linktext, PartiallinkText, Tagname, Name, ClassName;
	}

	public static void waitForElement(WebDriver driver, String target, Enum locatortype) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		if (locatortype.equals(LocatorType.Id)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
		} else if (locatortype.equals(LocatorType.ClassName)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
		} else if (locatortype.equals(LocatorType.Xpath)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
		} else if (locatortype.equals(LocatorType.CssSelector)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(target)));
		} else if (locatortype.equals(LocatorType.Linktext)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
		} else if (locatortype.equals(LocatorType.PartiallinkText)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
		} else if (locatortype.equals(LocatorType.Tagname)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
		} else if (locatortype.equals(LocatorType.Name)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(target)));
		}
	}
	public static void waitForElementClickable(WebDriver driver, String target, Enum locatortype) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		if (locatortype.equals(LocatorType.Id)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id(target)));
		} else if (locatortype.equals(LocatorType.ClassName)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.className(target)));
		} else if (locatortype.equals(LocatorType.Xpath)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(target)));
		} else if (locatortype.equals(LocatorType.CssSelector)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(target)));
		} else if (locatortype.equals(LocatorType.Linktext)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(target)));
		} else if (locatortype.equals(LocatorType.PartiallinkText)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(target)));
		} else if (locatortype.equals(LocatorType.Tagname)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(target)));
		} else if (locatortype.equals(LocatorType.Name)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.name(target)));
		}
	}
	
	public static void waitForElementInvisible(WebDriver driver, String target, Enum locatortype) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		if (locatortype.equals(LocatorType.Id)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(target)));
		} else if (locatortype.equals(LocatorType.ClassName)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(target)));
		} else if (locatortype.equals(LocatorType.Xpath)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(target)));
		} else if (locatortype.equals(LocatorType.CssSelector)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(target)));
		} else if (locatortype.equals(LocatorType.Linktext)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(target)));
		} else if (locatortype.equals(LocatorType.PartiallinkText)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(target)));
		} else if (locatortype.equals(LocatorType.Tagname)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName(target)));
		} else if (locatortype.equals(LocatorType.Name)) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(target)));
		}
	}

	public static void waitForElementToBeClickable(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable ((target)));

	}
	public static void waitForElementToBePresent(WebDriver driver, WebElement target,String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.textToBePresentInElement(target, value));

	}
	
	public static void waitForEle(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));

	}
	
	
}
