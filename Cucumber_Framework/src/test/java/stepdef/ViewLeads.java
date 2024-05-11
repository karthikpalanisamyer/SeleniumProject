package stepdef;

import io.cucumber.java.en.Then;

public class ViewLeads extends BaseTest{

	@Then("Verify the lead is Created")
	public void verifyTitle() {
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("Success");
		}
	}
	
}
