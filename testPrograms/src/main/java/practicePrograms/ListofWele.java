package practicePrograms;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListofWele {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.bing.com/shop?q=www.flipkart.com+online+shopping&qs=n&form=SHOPSB&sp=-1&lq=0&pq=www.flipkart.com+online+shopping&sc=0-32&sk=&cvid=862A861C30354144B96A1252C62F79A8&ghsh=0&ghacc=0&ghpl=");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.xpath("//a[text()='School Stationery']/parent::div"));
		List<WebElement> ele =table.findElements(By.xpath("//div[@class=\"br_relatedItems\"]/a"));
		
		int size = ele.size();
		System.out.println("Table size: " +size);
		
		Set<String> allTrains = new TreeSet<String>();
		
		for(int i=0; i<ele.size(); i++) {
			allTrains.add(ele.get(i).getText());
			
			
		}System.out.println(allTrains);
	}

}
