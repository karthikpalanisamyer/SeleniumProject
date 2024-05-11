package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseTest{
	
	@And("Enter the Company Name as (.*)$")
	public void enterCName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	@And("Enter the First Name as (.*)$")
	public void enterFName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@And("Enter the Last Name as (.*)$")
	public void enterLName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@Then("Click the Submit Button")
	public void clickSubmit() {
		driver.findElement(By.className("smallSubmit")).click();
	}

}
