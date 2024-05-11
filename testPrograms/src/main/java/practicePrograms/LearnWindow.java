package practicePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Browser']/preceding-sibling::i")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		//get window handle
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println("No of opened Windows: " + allwindowHandles.size());
		
		//find where is the window control
		System.out.println("Primary Window: " + driver.getTitle());
		System.out.println("Primary URL: " + driver.getCurrentUrl());
		
		List<String> lstWindows = new ArrayList<String>(allwindowHandles);
		String secondWindowHandle= lstWindows.get(1);
		
		//move the control to the second windiow
		driver.switchTo().window(secondWindowHandle);
		
		//find where is the second window control
		System.out.println("Second Window: " +driver.getTitle());
		System.out.println("Second Url: " +driver.getCurrentUrl());
	
		driver.close();
		driver.switchTo().window(lstWindows.get(0));
		driver.close();
		
		//find where is the third window control
		driver.switchTo().window(lstWindows.get(2));
		
		System.out.println("Third Window: " +driver.getTitle());
		System.out.println("Third Window Url: " +driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(lstWindows.get(3));
		System.out.println("Fourth Window: " +driver.getSessionId());
		System.out.println("Fourth Window Url: " +driver.getCurrentUrl());
		driver.close();
		
	}

}
