package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window();
		TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pd = driver.findElement(By.xpath("//input[@name='password']"));
		un.sendKeys("Admin");
		pd.sendKeys("admin123");
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\screenshot//screen5.png");
		FileUtils.copyFile(src, dest);
		log.click();
		Thread.sleep(4000);
		WebElement buzz=driver.findElement(By.xpath("//span[normalize-space()='Buzz']"));
		buzz.click();
		Thread.sleep(4000);
		//WebElement scrshot1=driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-buzz-layout']"));
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("E:\\screenshot//screen3.png");
		FileUtils.copyFile(src1, dest1);
		WebElement post=driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
		post.sendKeys("yogesh sharma");
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("E:\\screenshot//screen2.png");
		FileUtils.copyFile(src2, dest2);
		Thread.sleep(3000);
		WebElement postbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		postbutton.click();
		Thread.sleep(3000);
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("E:\\screenshot//screen4.png");
		FileUtils.copyFile(src3, dest3);
	}

}
