package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window();
		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pd = driver.findElement(By.xpath("//input[@name='password']"));
		un.sendKeys("Admin");
		pd.sendKeys("admin123");
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.switchTo().window("https://www.orangehrm.com/");

	}

}
