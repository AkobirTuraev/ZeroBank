package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSummarySteps {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        new LoginPage().GoToLogin();
    }


    @Then("Account Summary page should have the title {string}")
    public void account_Summary_page_should_have_the_title(String title) {
        new AccountSummaryPage().AccSum(title);
    }
    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
       new LoginPage().login(username,password);
    }
    @Then("verify {string} are displayed")
    public void verify_are_displayed(String Types) {
    new AccountSummaryPage().AccountTypes(Types);
    }

    @Then("verify {string} columns")
    public void verify_columns(String Columns) {
    new AccountSummaryPage().Columns(Columns);
    }


}
