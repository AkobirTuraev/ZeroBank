package com.zerobank.pages;

import org.openqa.selenium.support.PageFactory;
import com.zerobank.utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
