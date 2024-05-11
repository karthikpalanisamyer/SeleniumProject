package practicePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Browser']/preceding-sibling::i")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		//get window handle
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> lstWindows = new ArrayList<String>(windowHandles);
		
		String SecondWindowHandle = lstWindows.get(1);
		driver.switchTo().window(SecondWindowHandle);
		
		driver.close();
		driver.switchTo().window(lstWindows.get(2));
		driver.close();
		
		driver.switchTo().window(lstWindows.get(0));
		driver.close();
	}

}
