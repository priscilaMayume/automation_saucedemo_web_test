package com.saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.saucedemo.stepdefinitions",
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE, dryRun = false, strict = true)
public class Runner {
}
