package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.manage().window();
		driver.switchTo().frame(3);
        WebElement cat = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
        Actions a = new Actions(driver);
        a.dragAndDrop(cat, trash).build().perform();
        driver.switchTo().defaultContent();
        
       


	}

}
