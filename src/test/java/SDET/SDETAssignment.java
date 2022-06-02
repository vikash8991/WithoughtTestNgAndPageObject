package SDET;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETAssignment {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	
	WebElement searchBox = driver.findElement(By.name("search"));
    searchBox.sendKeys("Pushpa:The Rise"+Keys.ENTER);
    
    // i am not able to click on first link
    //i have one other option also ,it directly open the movie link
    //driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
    
    

	}

}











//driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[4]/ul/li[1]/div[1]/a"));
//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//
//System.out.println(driver.getTitle());
//driver.close();
