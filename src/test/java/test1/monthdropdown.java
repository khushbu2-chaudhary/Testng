package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class monthdropdown {
	WebDriver driver;
	
	@Test
	public void usershouldbeabletoseemonthdropdown() {
		driver = util1.Browserfactory.init();

	
	WebElement MONTHDROPDOWN_ELEMENT =driver.findElement(By.xpath("//*[@id=\"extra\"]/select[3]"));
		Select sel = new Select(MONTHDROPDOWN_ELEMENT);
		
		 List<WebElement>allelements = sel.getOptions();
		 
			System.out.println(allelements.size());
			
			for(int i =0;i<allelements.size();i++) {
				System.out.println(allelements.get(i).getText());
			}
	
	
	
	
	}
	
}