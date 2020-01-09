package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage {
    public void Title(String title){
        Assert.assertEquals(Driver.get().getTitle(),title);
    }
    public void PayeeAccount(String payee, String Account){
        Select bank = new Select(Driver.get().findElement(By.xpath("//select[@id='sp_payee']")));
        Select account = new Select(Driver.get().findElement(By.xpath("//select[@id='sp_account']")));
        bank.selectByVisibleText(payee);
        account.selectByVisibleText(Account);

    }
    public void AmountDate(String Amount, String Date){
        WebElement amount=Driver.get().findElement(By.id("sp_amount"));
        WebElement date = Driver.get().findElement(By.id("sp_date"));
        amount.sendKeys(Amount);
        date.sendKeys(Date);
    }
    public void Pay() {
     Driver.get().findElement(By.id("pay_saved_payees")).click();
    }
    public void SuccessMessage(String message) {
       WebElement alert= Driver.get().findElement(By.id("alert_content"));
       Assert.assertEquals(alert.getText(),message);

    }
    public void ErrorMessage(String expected){
        WebElement amount= Driver.get().findElement(By.id("sp_amount"));
        String actual = amount.getAttribute("validationMessage");
        Assert.assertEquals(actual, expected);
    }
}
