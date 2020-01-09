package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AccountActivitySteps {


    @Given("user is on login page")
    public void user_is_on_the_login_page(){
        new LoginPage().GoToLogin();
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        new LoginPage().login(username, password);
    }

    @Then("user clicks on {string} tab")
    public void page_should_be_displayed(String tab) {
        new BrowserUtils().Navigate(tab);

    }
    @Then("verify page title is {string}")
    public void verify_page_title_is(String string) {
        new AccountActivityPage().VerifyTitle(Driver.get().getTitle());
    }

    @Then("verify {string} has correct options")
    public void verify_has_correct_options(String DropDown) throws InterruptedException {
    new AccountActivityPage().VerifyAllAccounts(DropDown);


    }
    @Then("verify {string} names")
    public void verify_names(String names) throws InterruptedException {
    new AccountActivityPage().TableName(names);
    }
}
