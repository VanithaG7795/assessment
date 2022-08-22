package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class opengoogle {
	WebDriver driver;
    
    String projectPath = System.getProperty("user.dir");
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://www.google.com");
		 driver.manage().window().maximize();
	}

	@When("^user is typing search term \"([^\"]*)\"$")
	public void user_is_typing_search_term(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys((arg1));
	   
	}

	@When("^entering return button$")
	public void entering_return_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).click();;
	}

	@Then("^then user able to see the search results$")
	public void then_user_able_to_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("maveric")).isDisplayed();
		 if (status) {
	            System.out.println("result displayed");
	        }
	        else {
	            System.out.println("result not displayed");
	        }
	}

}
