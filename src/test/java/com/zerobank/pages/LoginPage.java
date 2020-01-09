package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

        @FindBy(id="user_login")
        public WebElement UserName;

        @FindBy(id = "user_password")
        public WebElement PassWord;

        @FindBy(name="submit")
        public WebElement SignIn;

    public void login(String userNameStr, String passwordStr) {
        UserName.sendKeys(userNameStr);
        PassWord.sendKeys(passwordStr);
        SignIn.click();
        // verification that we logged
    }
    public void GoToLogin() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    public void LogOut(){
        Driver.get().findElement(By.id("logout_link")).click();;
    }
    public void ErrorMessage(String errorstr){
    String actual = Driver.get().findElement(By.xpath("//div[@class='alert alert-error']")).getText();
        Assert.assertEquals(actual,errorstr);
    }
}
