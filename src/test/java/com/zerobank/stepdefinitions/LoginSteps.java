package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        new LoginPage().GoToLogin();
    }
    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        new LoginPage().login(username,password);
    }
    @Then("Page title {string} should be displayed")
    public void page_title_should_be_displayed(String tab) {
        new BrowserUtils().Navigate(tab);
    }
    @Then("User should not be able to login")
    public void user_should_not_be_able_to_login() {

    }
    @Then("error message {string} is displayed")
    public void error_message_is_displayed(String error) {
        new LoginPage().ErrorMessage(error);
    }
}
