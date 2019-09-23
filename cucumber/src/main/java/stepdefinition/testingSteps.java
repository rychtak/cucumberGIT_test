package stepdefinition;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testingSteps {
	
	WebDriver driver;
	String baseUrl;
	WebDriverWait wait;


		@Given("^User jest na stronie domowej$")
		public void user_jest_na_stronie_domowej() throws Throwable {
			
		
			driver = new ChromeDriver();
			String baseURL = "https://learn.letskodeit.com/";
			wait = new WebDriverWait(driver, 6);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
			driver.get(baseURL);
		   
		
		}

		@When("^Przechodzi do okna logowania$")
		public void przechodzi_do_okna_logowania() throws Throwable {
			
			WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
			signUpButton.click();
		
			WebElement directToLogin = driver.findElement(By.className("login-button"));	
			directToLogin.click();	
		
		
		  
		}

		@When("^User wprowadza login i haslo$")
		public void user_wprowadza_login_i_has_o() throws Throwable {
			WebElement titleLoginIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Log In to Let')]")));
			WebElement loginField = driver.findElement(By.id("user_email"));
			loginField.sendKeys("test@email.com");
			WebElement passwordField = driver.findElement(By.id("user_password"));
			passwordField.sendKeys("abcabc");
			WebElement loginClick = driver.findElement(By.xpath("//input[@name='commit']"));
			loginClick.click();
			
		
		}

		@Then("^Moze korzystac z panelu usera$")
		public void mo_e_korzysta_z_panelu_usera() throws Throwable {
			
			WebElement coursePageApearience = null;
			
			try {
			coursePageApearience = driver.findElement(By.className("course-listing-title"));
			}
			catch(NoSuchElementException e){
				System.out.println("B��d: " + e);
			
				
			}
			Assert.assertTrue(coursePageApearience != null);
			System.out.println("Login Succesfull");
			driver.quit();
			
			
		
	
		}

	

}
