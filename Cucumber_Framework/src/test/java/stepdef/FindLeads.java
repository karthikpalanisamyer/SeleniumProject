package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;

public class FindLeads extends BaseTest{
	
	@And("Click Phone Tab")
	public void clickPhonetab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@And("Type Phone Number as (.*)$")
	public void clickPhonetab(String phoneNumber) {
		driver.findElement(By.name("phoneNumber")).sendKeys(phoneNumber);
	}
	
	@And("Click FindLeads Button")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And("Click FirstMatching Result")
	public void clickFirstMatchingResult() throws InterruptedException {
		Thread.sleep(2000);;
		WebElement firstResult = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		//wait.until(ExpectedConditions.stalenessOf(firstResult));
		firstResult.click();
	}

}
