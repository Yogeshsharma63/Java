package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class javascript {

	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "E:\\download\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
	        js.executeScript("arguments[0].setAttribute('value','Admin')", un);
	        WebElement pd = driver.findElement(By.xpath("//input[@name='password']"));
	        js.executeScript("arguments[0].setAttribute('value','admin123')", pd);
	        WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
	        js.executeScript("arguments[0].click()", log);

	      



	}

}
