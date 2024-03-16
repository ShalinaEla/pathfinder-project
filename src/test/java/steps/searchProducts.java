package steps;

import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchProducts extends googleBase{
	
	googleHomePage gp;
	
	@Given("i am in the google homepage")
	public void i_am_in_the_google_homepage() {
		
		launchBrowser();
		  
	}
	
	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
		

		gp = new googleHomePage(driver);
		gp.enterProductNameInSearchbar(string);
	    
	    
	}

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		
		gp.clickOnSearhButton();
		
	}

	@Then("i can see the search result successfully")
	public void i_can_see_the_search_result_successfully() {
	
		
		Assert.assertTrue(gp.verifySearchResult());
		closeAll();
		
	//Assert.assertEquals("Expected", searchResult.getText());
	
	//Assert.assertNotEquals("Expected", SearchResult.getText());
	
	//Assert.assertFalse(searhResult.isDisplayed());
	    
	//Assert.assertNotNull(searchResult.getText());
		
		
	}



}
