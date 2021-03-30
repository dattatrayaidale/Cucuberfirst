package stepDefinitionFile;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition 
{
	@Given("^User is on Home page$")
    public void user_is_on_home_page() throws Throwable
	{
		System.out.println("This is Home page");
    }

	@When("^User login with Username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	{
		System.out.println(strArg1);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable
    {
    	System.out.println("Home page is displayed");
    }

    @And("^Cards is displayed$")
    public void cards_is_displayed()  throws Throwable
    {
    	System.out.println("Card is displayed");
    }
	

}
