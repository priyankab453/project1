import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		FileInputStream fis=new FileInputStream("C:\\seleniumprog\\DataDriverFramework\\data.properties");
		Properties p=new Properties();
		p.load(fis);
		String url1=p.getProperty("url");
		String email1=p.getProperty("email");
		String pass1=p.getProperty("pass");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url1);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(email1);
		driver.findElement(By.id("pass")).sendKeys(pass1);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.quit();
		driver.quit();
		
	}

}
