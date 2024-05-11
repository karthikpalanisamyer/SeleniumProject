package practicePrograms;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTrains {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT", Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MAS", Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
	
//		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
//		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
//		int size = tableRows.size();
//		System.out.println(size);
		
		//alternate way to find size
//		int size2 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
//		System.out.println(size2);
		
		//sorting
//		driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[1]")).click();
		
		//print all train numbers
		List<WebElement> allTrainnums = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[1]"));
		
		Set<String> sortedUniqueNums = new TreeSet<String>();
		Set<String> defaultUniqueNums = new LinkedHashSet<String>();
		
		for (int i = 0; i < allTrainnums.size(); i++) {
			//System.out.println(allTrainnums.get(i).getText());
			sortedUniqueNums.add(allTrainnums.get(i).getText());
			defaultUniqueNums.add(allTrainnums.get(i).getText());
		}
		System.out.println(sortedUniqueNums);
		System.out.println(defaultUniqueNums);
		
		
		
		
		
		
	}

}
