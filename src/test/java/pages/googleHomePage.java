package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	
WebDriver driver;

public googleHomePage(WebDriver dr) {
	
	driver = dr;
	
	// page factory is a class.
	// web driver is a interface.in order to perform my action.
	
	PageFactory.initElements(driver, this);
}

@FindBy(className = "gLFyf")
WebElement searchBar; 

@FindBy(name = "btnK")
WebElement searchButton; 

@FindBy (id = "result-stats")
WebElement searhResult;

public void enterProductNameInSearchbar(String Product) {
	
	searchBar.sendKeys(Product);
}

public void clickOnSearhButton() {
	searchButton.submit();
	
}
public boolean verifySearchResult() {
	
	return searhResult.isDisplayed();
}

}
