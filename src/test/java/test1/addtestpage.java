package test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page1.addcategorypage;
import util1.Browserfactory;

public class addtestpage {
	WebDriver driver;
	
	@Test
	public void usershouldbeabletoaddpage() {
		driver = util1.Browserfactory.init();
		
		addcategorypage addCategorypage = PageFactory.initElements(driver, addcategorypage.class);
		addCategorypage.validateAddcategorypage();
		addCategorypage.AddCategoryElement();
		addCategorypage.AddCategoryClickElement();
		
		//Assert.assertEquals(driver.findElement(ADDCATEGORYCLICK_ELEMENT).getText(),"Category", "Category is not found");
		// addCategorypage.selectMonth(null);
	}
}
