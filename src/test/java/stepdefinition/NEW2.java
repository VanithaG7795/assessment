package stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 WebDriver driver = null;

public class NEW2 {
	@Given("^user is entering in the url\\.$")
	public void user_is_entering_in_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
			System.out.println("Inside Step - browser is open");
					
					String projectPath = System.getProperty("user.dir");
					System.out.println("Project path is : "+projectPath);
					String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
					System.setProperty("webdriver.chrome.driver", filePath);
					driver = new ChromeDriver();
			System.out.println("Inside Step - user is on login page");

					
					driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
					
				   
	    
	}

	@When("^user click on Login and enter the details$")
	public void user_click_on_Login_and_enter_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"]")).sendKeys("VanithaG");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Vanitha@98");
	}

	@When("^enter the loan amount and down payment$")
	public void enter_the_loan_amount_and_down_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1000000");
		driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("20000");
	   
	}

	@Then("^then user able to apply$")
	public void then_user_able_to_apply() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
	    
	}



