package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class project1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window();
		String obj=driver.getTitle();
		System.out.println(obj);
		String var=driver.getCurrentUrl();
		System.out.println(var);
		WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pd=driver.findElement(By.xpath("//input[@name='password']"));
		un.sendKeys("Admin");
		pd.sendKeys("admin123");
		WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		log.click();
		Thread.sleep(2000);
		WebElement buzz=driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[11]"));
		buzz.click();
		Thread.sleep(2000);
		WebElement post=driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
		post.sendKeys("yogesh sharma");
		WebElement postbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		postbutton.click();
		
		

		

		
		
		
		//driver.quit();
	}

}
