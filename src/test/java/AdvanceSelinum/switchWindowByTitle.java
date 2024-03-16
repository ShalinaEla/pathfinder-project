package AdvanceSelinum;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		WebElement clickHerButton = driver.findElement(By.linkText("Click Here"));
		
		clickHerButton.click();
		
		WindowByTitle(driver,"New window");
		
		System.out.println(driver.getTitle());
		
	}

	public static void WindowByTitle(WebDriver driver, String title) {
		
		String mainWindow = driver.getWindowHandle();
		
		 Set<String>window = driver.getWindowHandles();
		
		for(String s : window) {
			
			if(!driver.switchTo().window(s).getTitle().equals(title)){
				
				driver.switchTo().window(mainWindow);
		}
			}
		
	}
	
	
	
}
