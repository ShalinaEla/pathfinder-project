package AdvanceSelinum;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchNewWindo {

	private static final String window = null;

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
		
		String mainWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(mainWindow);
		
		Iterator<String> i=  windows.iterator();
		
		
		while(i.hasNext()) {
			
			String childWindow = i.next();
			
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
			}
		}
		
		
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
