package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage {


    public void AccSum(String title){
       Assert.assertEquals( Driver.get().getTitle(),title);
    }
    public void AccountTypes(String types){
        List<WebElement> Account=Driver.get().findElements(By.xpath("//div[@class='row']//h2"));
        ArrayList<String> ListOfAccounts=new ArrayList<>();
        for (WebElement Accounts:Account){
           ListOfAccounts.add(Accounts.getText());
        }
        Assert.assertTrue(ListOfAccounts.contains(types));
    }
    public void Columns(String columns){
        List<WebElement> columnNames=Driver.get().findElements(By.xpath("//table[@class='table']//th"));
        ArrayList<String> Columns=new ArrayList<>();
        for (WebElement names:columnNames){
            Columns.add(names.getText());
        }
        Assert.assertTrue(Columns.contains(columns));
    }


}
