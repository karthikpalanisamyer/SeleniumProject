package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class MyHomePage extends BaseTest{
	@Then("Click on Leads tab")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
