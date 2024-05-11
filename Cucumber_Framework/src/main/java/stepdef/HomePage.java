package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class HomePage extends BaseTest{
	
	@And("Click the link CRM SFA")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
