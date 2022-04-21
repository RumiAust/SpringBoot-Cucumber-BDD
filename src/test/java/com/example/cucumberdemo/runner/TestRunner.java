package com.example.cucumberdemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/featureFiles",
        glue="classpath:com.example.cucumberdemo",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber-json.json",
                "junit:target/cucumber-reports/Cucumber-xml.xml",
                "html:target/cucumber-reports/Cucumber-web.html"},
        monochrome = true,
        publish = true
)
public class TestRunner {

}
