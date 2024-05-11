package practicePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		//WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--dissable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirt");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//a[@title='Yellows']//div")).click();
		
		driver.findElement(By.xpath("//button[@value='38']")).click();
		
		driver.findElement(By.xpath("//img[@data-image-index=\"1\"]")).click();
		
		
		Set<String> wh = driver.getWindowHandles();
		System.out.println("Total window Sizes are: " +  wh.size());
		
		List<String> fwh = new ArrayList<String>(wh);
		
		String swh = fwh.get(1);
		driver.switchTo().window(swh);
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='quantity']"));
		Select sel = new Select(ele);
		
		sel.selectByIndex(2);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("abc");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		
		driver.close();

	}

}