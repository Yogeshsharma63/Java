package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window();
		WebElement at=driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"));
		at.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement ab=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		ab.click();
		Thread.sleep(2000);
		WebElement dis=driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
		dis.click();
		Thread.sleep(2000);
		Alert b=driver.switchTo().alert();
		b.dismiss();
		WebElement ac=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		ac.click();
		Thread.sleep(2000);
		WebElement tex=driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"));
		tex.click();
		Thread.sleep(2000);
		Alert se=driver.switchTo().alert();
		se.sendKeys("yogesh");
		se.accept();
		

	}

}
