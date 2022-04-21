package com.example.cucumberdemo.steps;

import com.example.cucumberdemo.dataset.RunConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;


class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
public class DummySteps {

    private String today;
    private String actualAnswer;

    @Autowired
    RunConfiguration mRunConfiguration;

    @Given("user tries to enter value in calculator and it works")
    public void testThisAndCheckItWorks() {
        System.out.println("Starting >>> " + mRunConfiguration.getTestType());
        System.out.println("Test running in >>> " + mRunConfiguration.getBrowser());
        System.out.println("First Case: This is working correctly...");
    }

    @Given("I am asking wheather today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
