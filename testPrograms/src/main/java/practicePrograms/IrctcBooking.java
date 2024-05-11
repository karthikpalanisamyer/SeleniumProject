package practicePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcBooking {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(@class,'search_btn loginText')]")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("GUNAKARTHI");
		driver.findElement(By.xpath("(//input[contains(@class,'form-control input-box')])[2]")).sendKeys("Irctc@1100");
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext')]")).sendKeys("KJM");
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext')]")).sendKeys("ED");
		
	    
		
		Select sel = new Select(driver.findElement(By.xpath("//p-dropdown[@id='journeyQuota']//div")));
		//sel.selectByVisibleText("GENERAL");
		List <WebElement> elementCount = sel.getOptions();
		System.out.println(elementCount.size());
		sel.selectByVisibleText("TATKAL"); 
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-212 ui-inputtext')]")).sendKeys("10/10/2023");
		
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		driver.findElement(By.xpath("//span[text()='| Duration']")).click();
		driver.findElement(By.xpath("DepartureEarly First")).click();
		driver.findElement(By.xpath("//span[text()='Show Available Trains']")).click();
		

	}

}
