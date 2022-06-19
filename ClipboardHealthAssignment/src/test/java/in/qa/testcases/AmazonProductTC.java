package in.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.qa.base.BaseTest;
import in.qa.pages.HomePage;
import in.qa.pages.ProductPage;
import in.qa.pages.SearchResult;
import in.qa.utils.CommonActions;

public class AmazonProductTC extends BaseTest{

	HomePage homePage;
	SearchResult searchResult;
	CommonActions commonActions;
	ProductPage productPage;

	@BeforeMethod
	public void beforeMethod()
	{
		homePage=new HomePage(driver);
		searchResult=new SearchResult(driver);
		commonActions=new CommonActions(driver);
		productPage=new ProductPage(driver);
	}

	@Test
	public void searchProdcut() throws InterruptedException
	{	
		homePage.filterProduct();
		searchResult.sort("Price: High to Low");
		searchResult.clickOnPrdImg();
		commonActions.switchToTab(1);
		String aboutThisItemText =productPage.aboutThisItemText();
		Assert.assertEquals(aboutThisItemText, "About this item", aboutThisItemText);
		System.out.println(aboutThisItemText);
	}
}
