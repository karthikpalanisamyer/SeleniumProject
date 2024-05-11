package stepdef;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseTest{
		
		@When("Load URL {string}")
		public void loadUrl(String url) {
			driver.get(url);
		}
		
		@And("Type Username as {string}")
		public void typeUsername(String username) {
			driver.findElement(By.id("username")).sendKeys(username);
		}
		
		@And("Type Password as {string}")
		public void typePassword(String password) {
			driver.findElement(By.id("password")).sendKeys(password);
		}
		@And("Click Login Button")
		public void clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		@Then("Verify Login is Successfull")
		public void isSuccess() {
			WebElement eleCrm = driver.findElement(By.linkText("CRM/SFA"));
			System.out.println(eleCrm.isDisplayed());
			
		}
		
		@And("Verify Login Failed with error (.*)$")
		public void isFailed(String errorMessage) {
			WebElement eleError = driver.findElement(By.xpath("//div[@id='errorDiv']/p[2]"));
			if(eleError.getText().equals(errorMessage)) {
				System.out.println("The Error message appeared: " + errorMessage);
			}else {
				System.out.println("The Error message did not appeared: ");
			}
			
		}

		
}
