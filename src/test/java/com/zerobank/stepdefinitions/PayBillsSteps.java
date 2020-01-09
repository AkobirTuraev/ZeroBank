package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBillsSteps {
    @Given("User is in Login page")
    public void User_is_in_Login_page(){
        new LoginPage().GoToLogin();
    }
    @When("User enters {string} in username and {string} in password")
    public void user_enters_in_username_and_in_password(String username, String password) {
       new LoginPage().login(username,password);
    }

    @When("User clicks on {string} tab")
    public void user_clicks_on_tab(String tab) {
        new BrowserUtils().Navigate(tab);
    }

    @Then("verify title is {string}")
    public void verify_title_is(String title) {
        new PayBillsPage().Title(title);
    }

    @When("user clicks {string} as Payee, {string} as Account")
    public void user_clicks_as_Payee_as_Account(String payee, String account) {
        new PayBillsPage().PayeeAccount(payee,account);
    }

    @When("user enters {string} for amount, {string} as Date")
    public void user_enters_for_amount_as_Date(String amount, String date) {
        new PayBillsPage().AmountDate(amount, date);
    }
    @When("user clicks Pay button")
    public void user_clicks_button() {
        new PayBillsPage().Pay();
    }
    @Then("verify message {string} is displayed")
    public void verify_message_is_displayed(String message) {
        new PayBillsPage().SuccessMessage(message);
    }



    @Then("the message {string} is displayed")
    public void the_message_is_displayed(String message) {
        new PayBillsPage().ErrorMessage(message);
    }

    @When("user enters {string} in amount or enters {string} in Date")
    public void user_enters_in_amount_or_enters_in_Date(String amount, String date) {
        new PayBillsPage().AmountDate(amount, date);
    }

    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        new PayBillsPage().Pay();
    }

    @Then("Application should not accept payment")
    public void application_should_not_accept_payment() {

    }



}
