package com.democode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Webdriver;
public class samplecode_1 {
	
public static void main(String[] args) {
	
		WebDriverManager.F.irefoxdriver().setup();
        WebDriver driver = new FirefoxdriverDriver();
		driver.manage().window().maximize();
		                   
		driver.get("https://www.goggle.com");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.contains("Google"))
			System.out.println("Title match: Test Case Pass");
		else
			System.out.println("Title not matching: Test Case Fail");
		
		driver.close();                                     
	}

}
.


