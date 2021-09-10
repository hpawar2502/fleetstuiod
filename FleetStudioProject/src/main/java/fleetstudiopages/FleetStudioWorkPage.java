package fleetstudiopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FleetStudioWorkPage {
	
	WebDriver driver;
	WebDriverWait wait;
	Select sel;
	
	@FindBy(xpath = "//*[@name='filter']") private WebElement dropdown;
	@FindBy(xpath = "//*[@id=\"filter\"]/div[2]/div[2]/a/img") private WebElement img;
	
	public FleetStudioWorkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void worktest() {
		sel = new Select(dropdown);
		sel.selectByVisibleText("Product Dev");
	}
	
	public void worktest2() {
		img.click();
		
	}
	

}
