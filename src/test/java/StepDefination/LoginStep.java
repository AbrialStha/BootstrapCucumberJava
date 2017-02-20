package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by pav15p on 17/02/2017.
 */
public class LoginStep {
    @Given("^user is in the login page$")
    public void userIsInTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterAnd(String userName, String passWord) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks Log In button$")
    public void userClicksLogInButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user is on Search screen$")
    public void userIsOnSearchScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user sees error message saying \"([^\"]*)\"$")
    public void userSeesErrorMessageSaying(String errorMessage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
