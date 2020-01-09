package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage {
    public AccountActivityPage() {
        PageFactory.initElements(Driver.get(), this);
    }





    public void VerifyTitle(String title){
       String Title= Driver.get().getTitle();
         Assert.assertEquals(Title,title);
    }

    public void VerifyAllAccounts(String Accs) throws InterruptedException {
        new BrowserUtils().waitForVisibility(By.id("aa_accountId"),1000);
        Select accts= new Select(Driver.get().findElement(By.id("aa_accountId")));

        List<WebElement> options = accts.getOptions();
        ArrayList<String> texts=new ArrayList<>();

        for (WebElement option:options){
            texts.add(option.getText());
        }
       Assert.assertTrue(texts.contains(Accs));

    }
    public void TableName(String theads) throws InterruptedException {
        new BrowserUtils().waitForVisibility(By.xpath("//table[@class='table table-condensed table-hover']//th"),1000);
        List<WebElement> tablehead= Driver.get().findElements(By.xpath("//table[@class='table table-condensed table-hover']//th"));
        ArrayList<String> Tables=new ArrayList<>();
        for (WebElement thead:tablehead){
            Tables.add(thead.getText());
        }
        System.out.println(Tables);
        Assert.assertTrue(Tables.contains(theads));


    }


}
