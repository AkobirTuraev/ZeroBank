package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features/",
        glue = "com/zerobank/stepdefinitions",
        dryRun = false,
        tags = "@AccAct"

)
public class CukesRunner {
}
