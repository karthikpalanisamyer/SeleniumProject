package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;
import stepdef.BaseTest;

public class PreandPost extends BaseTest{
	int i=1;
	
	@Before
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@After
	public void close() {
		driver.close();
	}
	
	@AfterStep
	public void takescreenshot() throws IOException {
		File srceenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srceenshot, new File("./snap"+(i++)+".jpg"));
	}

}
