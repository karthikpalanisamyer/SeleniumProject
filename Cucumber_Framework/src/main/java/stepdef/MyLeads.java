package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLeads extends BaseTest{
	
	@When("Click Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Click Find Lead")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	

}
