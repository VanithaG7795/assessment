package stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenNewAccount {
	 // Write code here that turns the phrase above into concrete actions
	WebDriver driver = null;
	@Given("^user is entering \"([^\"]*)\"$")
	public void user_is_entering(String arg1) throws Throwable {
System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", filePath);
		driver = new ChromeDriver();
System.out.println("Inside Step - user is on login page");

		
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		
	   
	}

	@When("^user click on Register button$")
	public void user_click_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	    
	}

	@When("^enter the User name, Address, Password, Phone Number$")
	public void enter_the_User_name_Address_Password_Phone_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Vanitha");
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("G");
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Kaviri Flat");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("600025");
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("9791020258");
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("030 72 7381");
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("VanithaG");
		driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("Vanitha@98");
		driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("Vanitha@98");
		
	    
	}

	@Then("^then user able to open new account$")
	public void then_user_able_to_open_new_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	   
	}

}
