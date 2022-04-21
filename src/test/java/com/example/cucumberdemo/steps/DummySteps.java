package com.example.cucumberdemo.steps;

import com.example.cucumberdemo.dataset.RunConfiguration;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class DummySteps {

    @Autowired
    RunConfiguration mRunConfiguration;

    @Given("user tries to enter value in calculator and it works")
    public void testThisAndCheckItWorks() {
        System.out.println("Starting >>> " + mRunConfiguration.getTestType());
        System.out.println("Test running in >>> " + mRunConfiguration.getBrowser());
        System.out.println("This is working correctly...");
    }
}
